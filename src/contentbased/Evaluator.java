/*
 * No training set, test directly. Evaluation metrics: recall, precision, G-measure
 * Also output preference matrix
 */

package contentbased;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Evaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//Start time
		int top=5;
		String userfilename = "data/freelancerfile.txt";
		String projectfilename = "data/projectfile.txt";
		String outputfilename = "data/eval_result.txt";
		String truefilename = "data/biddingfile.txt";
		String ratingfilename = "data/preference.txt";
		String usernamefilename = "data/freelancername.txt";
		String projectnamefilename = "data/projectname.txt";
		String skillnamefilename = "data/skillname.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-i:")){
				userfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-p:")) {
				projectfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-o:")) {
				outputfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-t:")) {
				truefilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-r:")) {
				ratingfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-u:")) {
				usernamefilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-j:")) {
				projectnamefilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-s:")) {
				skillnamefilename = args[i].substring(3);
			}
		}
		try {
			BufferedReader userfile = new BufferedReader(new FileReader(userfilename));
			BufferedReader projectfile = new BufferedReader(new FileReader(projectfilename));
			BufferedReader truefile = new BufferedReader(new FileReader(truefilename));
			BufferedWriter evalfile = new BufferedWriter(new FileWriter(outputfilename));
			BufferedWriter ratingfile = new BufferedWriter(new FileWriter(ratingfilename));

			BufferedWriter usernamefile =  new BufferedWriter(new FileWriter(usernamefilename));
			BufferedWriter projectnamefile =  new BufferedWriter(new FileWriter(projectnamefilename));
			BufferedWriter skillnamefile =  new BufferedWriter(new FileWriter(skillnamefilename));
			
			int n_users=3900;
			String [] username = new String [n_users];
			int n_projects=30000;
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
			for (int i=0;i<project_id;i++){
				projectnamefile.write(projectname[i]+"\n");
			}
			projectnamefile.close();
			//read project name from truefile
			String trueline = null;
			trueline = truefile.readLine();
			////System.out.println(trueline+trueline.length());
			while (trueline!=null){
				trueline = truefile.readLine();	
				////System.out.println(trueline+trueline.length());
				while((trueline.length()==0)||(trueline.substring(0, 10).equals("**********"))){
					trueline = truefile.readLine();	
					////System.out.println(trueline+trueline.length());
				}
				while((trueline!=null)&&(!trueline.substring(0, 10).equals("**********"))){
					int repeati=0;
					String [] pre = trueline.split(":::");
					if (pre.length==1){
						trueline = truefile.readLine();
						////System.out.println(trueline+trueline.length());
						while((trueline.length()==0)||(trueline.substring(0, 10).equals("**********"))){
							trueline = truefile.readLine();	
							////System.out.println(trueline+trueline.length());
						}
						continue;
					}
					int repeat = 0;
					for (int i=0;i<project_id;i++){
						if (projectname[i].equals(pre[0])){
							repeat=1;
							repeati=i;
							break;
						}
					}					
					projectname[project_id]=pre[0];
					String [] projecttokens = pre[1].split(",");
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
					trueline = truefile.readLine();
					while((trueline!=null)&&((trueline.length()==0)||(trueline.substring(0, 10).equals("**********")))){
						trueline = truefile.readLine();	
						//System.out.println(trueline+trueline.length());
					}
					if (repeat==1){
						int allsame=1;
						for (int ii=0;ii<n_skill;ii++){
							if (PS[project_id][ii]!=PS[repeati][ii]){
								allsame=0;
							}
						}
						if (allsame==1){
							continue;
						}						
					}
					project_id++;
				}
			}
			truefile.close();
			truefile = new BufferedReader(new FileReader(truefilename));
			
			//read users' names
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
			for (int i=0;i<user_id;i++){
				usernamefile.write(username[i]+"\n");
			}
			usernamefile.close();
			for (int i=0;i<skill_id;i++){
				skillnamefile.write(skillname[i]+"\n");
			}
			skillnamefile.close();
			
			//evaluation

			double sum_recall=0;
			double sum_precision=0;
			double sum_g1_score=0;
			
			int m_projects =1000;
			int true_id=0;			
			trueline = null;
			trueline = truefile.readLine();			
			while (trueline!=null){
				String [] pretokens;
				if (!trueline.substring(0,1).equals("*")){
					pretokens = trueline.substring(11).split(":");
				} else{
					pretokens = trueline.substring(10).split(":");
				}
				String u_name = pretokens[0];
				int ui;
				for (ui=0;ui<user_id;ui++){
					if (username[ui].equals(u_name)){
						break;
					}
				}
				int [] u_projects = new int [m_projects];
				int u_project_id=0;
				trueline = truefile.readLine();
				while((trueline.length()==0)||(trueline.substring(0, 10).equals("**********"))){
					trueline = truefile.readLine();	
				}
				while((trueline!=null)&&(!trueline.substring(0,10).equals("**********"))){
					String [] pre = trueline.split(":::");
					String p_name = pre[0];
					for (int pi=0;pi<project_id;pi++){
						if (projectname[pi].equals(p_name)){
							u_projects[u_project_id]=pi;
							
							//rating matrix printing
							ratingfile.write(ui + "," + pi +"\n");				
							
							u_project_id++;
							break;
						}
					}
					trueline = truefile.readLine();
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
							if ((US[ui][ii]==PS[j][jj])&&(US[ui][ii]!=0)){
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
					for (int ii=0;ii<top;ii++){
						//rec [ii]=(int)(Math.random()*project_id);
					}
				}
				
				//calculate the evaluation metrics
				int TP=0;
				for(int i=0;i<top;i++){
					for (int j=0;j<u_project_id;j++){
						if (rec[i]==u_projects[j]){
							TP++;
						}
					}
				}
				double precision=(double)TP/(double)u_project_id;
				if (u_project_id==0){
					precision=0;
				}
				double recall=(double)TP/(double)top;
				double g1_score= Math.sqrt(precision*recall);
				
				//System.out.print(true_id + " " +u_name + ": " + precision + ", " + recall + "," + g1_score +"\n");
				evalfile.write(true_id + " " +u_name + ": " + precision + ", " + recall + "," + g1_score +"\n");
				sum_recall=sum_recall+recall;
				sum_precision=sum_precision+precision;
				sum_g1_score=sum_g1_score+g1_score;
				true_id++;
			}
			System.out.print("Avg: " + sum_precision/true_id + ", " + sum_recall/true_id + "," + sum_g1_score/true_id +"\n");
			evalfile.write("Avg: " + sum_precision/true_id + ", " + sum_recall/true_id + "," + sum_g1_score/true_id +"\n");
			truefile.close();
			evalfile.close();
			ratingfile.close();
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
