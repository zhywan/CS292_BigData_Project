/*
 * Index skills, generate two integer matrices, and then compare them.
 */

package contentbased;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProjectRecommender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//Start time

		int top=5;
		String userfilename = "data/freelancerfile.txt";
		String projectfilename = "data/projectfile.txt";
		String outputfilename = "data/Content_based_recommendation_result.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-i:")){
				userfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-p:")) {
				projectfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-o:")) {
				outputfilename = args[i].substring(3);
			}
		}
		try {
			BufferedReader userfile = new BufferedReader(new FileReader(userfilename));
			BufferedReader projectfile = new BufferedReader(new FileReader(projectfilename));
			BufferedWriter outputfile = new BufferedWriter(new FileWriter(outputfilename));
			//BufferedWriter PSfile = new BufferedWriter(new FileWriter("PS.txt"));
			//BufferedWriter USfile = new BufferedWriter(new FileWriter("US.txt"));
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
			//computing
			for (int i=0;i<user_id;i++){
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
							if ((US[i][ii]==PS[j][jj])&&(US[i][ii]!=0)){
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
				//System.out.print("User" + i + "(" + username[i] + "): ");
				outputfile.write("User" + i + "(" + username[i] + "): ");
				for (int ii=0;ii<top;ii++){
					//System.out.print("project" + rec[ii] + "(" +projectname[rec[ii]] + ")[" + scores[ii] + "], ");
					outputfile.write("project" + rec[ii] + "(" +projectname[rec[ii]] + ")[" + scores[ii] + "], ");
				}
				//System.out.print("\n");
				outputfile.write("\n");
			}
			outputfile.close();
			
			//print PS US
			//for (int i=0;i<user_id;i++){
			//	for (int j=0;j<n_skill;j++){
			//		USfile.write(US[i][j] + " ");
			//	}
			//	USfile.write("\n");
			//}
			//USfile.close();
			//for (int i=0;i<project_id;i++){
			//	for (int j=0;j<n_skill;j++){
			//		PSfile.write(PS[i][j] + " ");
			//	}
			//	PSfile.write("\n");
			//}
			//PSfile.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();//End time
		System.out.println("Running time is "+(endTime-startTime)+"ms");
	}

}
