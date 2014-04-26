/*
 * Make recommendations interactively.
 */

package contentbased;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractiveRecommender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int top=5;
		String userfilename = "data/freelancerfile.txt";
		String projectfilename = "data/projectfile.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-i:")){
				userfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-p:")) {
				projectfilename = args[i].substring(3);
			} 
		}
		try {
			BufferedReader userfile = new BufferedReader(new FileReader(userfilename));
			BufferedReader projectfile = new BufferedReader(new FileReader(projectfilename));
			//BufferedWriter usernamefile =  new BufferedWriter(new FileWriter("username.txt"));
			//BufferedWriter projectnamefile =  new BufferedWriter(new FileWriter("projectname.txt"));
			//BufferedWriter skillnamefile =  new BufferedWriter(new FileWriter("skillname.txt"));
			int n_users=3900;
			String [] username = new String [n_users];
			int n_projects=9750;
			String [] projectname = new String [n_projects];
			int n_skills = 1000;
			String [] skillname = new String [n_skills];
			int n_skill =5;
			int [][] PS = new int [n_projects][n_skill];
			int [][] US = new int [n_users][n_skill];
			//read projects' names
			String projectline = null;
			projectline = projectfile.readLine();
			int skill_id=0;
			int project_id=0;
			while (projectline!=null){
				String [] pretokens = projectline.split(": ");
				projectname[project_id]=pretokens[1];
				if (pretokens.length>2){
					for (int i=0;i<pretokens.length-2;i++){
						projectname[project_id]=projectname[project_id]+pretokens[i+2];
					}
				}
				projectline = projectfile.readLine();
				String [] projecttokens = projectline.split(",");
				for (int j=0;j<projecttokens.length;j++){
					if (j>=n_skill){
						break;
					}
					String [] projecttoken=projecttokens[j].split(" ");
					String tmp = "";
					if (projecttoken.length==1){
						tmp = projecttokens[j];
					} else {
						tmp = projecttoken[0];
						for (int t=1;t<projecttoken.length;t++){
							tmp=tmp + "_" + projecttoken[t];
						}						
					}
					int find=0;
					for (int k=0;k<skill_id;k++){
						if (tmp.equals(skillname[k])){
							PS[project_id][j]=k+1;
							find=1;
							break;
						}
					}
					if (find==0){
						skillname[skill_id]=tmp;
						PS[project_id][j]=skill_id+1;
						skill_id++;
					}
				}
				projectline = projectfile.readLine();
				project_id++;
			}
			projectfile.close();
			
			//for (int i=0;i<project_id;i++){
			//	projectnamefile.write(projectname[i]+"\n");
			//}
			//projectnamefile.close();
			
			int user_id=0;			
			String userline = null;
			userline = userfile.readLine();
			while (userline!=null){
				String [] pretokens = userline.split(":");
				String [] usertokens = pretokens[1].split(" ");
				username[user_id]=usertokens[0]; //record users' names
				for (int j=0;j<usertokens.length-1;j++){
					if (j>=n_skill){
						break;
					}
					String tmp= usertokens[j+1];
					int find=0;
					for (int k=0;k<skill_id;k++){
						if (tmp.equals(skillname[k])){
							US[user_id][j]=k+1;
							find=1;
							break;
						}
					}
					if (find==0){
						skillname[skill_id]=tmp;
						US[user_id][j]=skill_id+1;
						skill_id++;
					}
				}
				userline=userfile.readLine();
				user_id++;
			}
			userfile.close();
			
			//for (int i=0;i<user_id;i++){
			//	usernamefile.write(username[i]+"\n");
			//}
			//usernamefile.close();
			//for (int i=0;i<skill_id;i++){
			//	skillnamefile.write(skillname[i]+"\n");
			//}
			//skillnamefile.close();
			
			//interactive part
			System.out.println("Interactive Recommender System 0.1");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please type your name (type \"exit\" for exit)");
			String name = buffer.readLine();
			while(!name.equalsIgnoreCase("exit")){
				System.out.println("Please type your top " + n_skill + " skills");
				String skillline = buffer.readLine();
				String [] skilltokens = skillline.split(", ");
				int [] S = new int [n_skill];
				for (int j=0;j<skilltokens.length;j++){
					if (j>=n_skill){
						break;
					}
					String [] projecttoken=skilltokens[j].split(" ");
					String tmp = "";
					if (projecttoken.length==1){
						tmp = skilltokens[j];
					} else {
						tmp = projecttoken[0];
						for (int t=1;t<projecttoken.length;t++){
							tmp=tmp + "_" + projecttoken[t];
						}						
					}
					int find=0;
					for (int k=0;k<skill_id;k++){
						if (tmp.equalsIgnoreCase(skillname[k])){
							S[j]=k+1;
							find=1;
							break;
						}
					}
					if (find==0){
						skillname[skill_id]=tmp;
						S[j]=skill_id+1;
						skill_id++;
					}
				}
				
				int [] rec = new int [top];
				
				for (int ii=0;ii<top;ii++){
					rec[ii]=ii;
				}
				double [] scores = new double [top];
				for (int ii=0;ii<top;ii++){
					scores[ii]=0;
				}
				for (int j=0;j<project_id;j++){
					double score=0,required_score=0;
					for (int jj=0;jj<n_skill;jj++){
						if (PS[j][jj]!=0){
							required_score++;
						}
					}
					for (int ii=0;ii<n_skill;ii++){
						for (int jj=0;jj<n_skill;jj++){
							if ((S[ii]==PS[j][jj])&&(S[ii]!=0)){
								score++;
								break;
							}
						}
					}
					score=score/required_score;
					for (int ii=0;ii<top;ii++){
						if (scores[ii]<score){
							for (int jj=top-1;jj>ii;jj--){
								scores[jj]=scores[jj-1];
								rec[jj]=rec[jj-1];
							}
							scores[ii]=score;
							rec[ii]=j;
							break;
						}
					}					
				}
				System.out.print(name + ", our recommendations for you are as follows:\n");
				for (int ii=0;ii<top;ii++){
					System.out.print("project" + rec[ii] + "(" +projectname[rec[ii]] + ")[" + scores[ii] + "], ");
				}
				System.out.print("\n");
				System.out.println("Please type your name (type \"exit\" for exit)");
				name = buffer.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}

}
