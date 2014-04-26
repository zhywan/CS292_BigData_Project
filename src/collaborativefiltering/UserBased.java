package collaborativefiltering;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class UserBased {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();//Start time
		int nUserNeighbor = 10;
		int nRecommendations = 5;
		
		
		String outputfilename = "data/User_based_recommendation_result.txt";
		String ratingfilename = "data/preference.txt";
		String usernamefilename = "data/freelancername.txt";
		String projectnamefilename = "data/projectname.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-o:")) {
				outputfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-r:")) {
				ratingfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-u:")) {
				usernamefilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-j:")) {
				projectnamefilename = args[i].substring(3);
			} 
		}
		
		int n_users=3900;
		String [] username = new String [n_users];
		int n_projects=30000;
		String [] projectname = new String [n_projects];
		
		BufferedReader userfile = new BufferedReader(new FileReader(usernamefilename));
		BufferedReader projectfile = new BufferedReader(new FileReader(projectnamefilename));
		BufferedWriter outputfile = new BufferedWriter(new FileWriter(outputfilename));
		
		String projectline = null;
		projectline = projectfile.readLine();
		int project_id=0;			
		while (projectline!=null){
			projectname[project_id]=projectline;
			projectline = projectfile.readLine();
			project_id++;
		}
		String userline = null;
		userline = userfile.readLine();
		int user_id=0;
		while (userline!=null){
			username[user_id]=userline;
			userline = userfile.readLine();
			user_id++;
		}
		
		try {
			DataModel model = new FileDataModel (new File(ratingfilename)); //Load data file
			//UserSimilarity similarity = new LogLikelihoodSimilarity (model);
			UserSimilarity similarity = new TanimotoCoefficientSimilarity (model); //Compute the user similarity
			UserNeighborhood neighborhood = new NearestNUserNeighborhood (nUserNeighbor, similarity, model); //Select neighborhood
			Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity); //Create recommender engine
			for (LongPrimitiveIterator users = model.getItemIDs(); users.hasNext();){
				long userID = users.nextLong();
				List<RecommendedItem> recommendations = recommender.recommend(userID, nRecommendations);
				if (userID>username.length)break;
				if (recommendations.isEmpty()) continue;
				String out = "";
				out = out + username[(int)userID-1] + " may like: ";
				for (RecommendedItem recommendation : recommendations){
					if ((int)recommendation.getItemID()>project_id){
						continue;
					}
					out = out + "\"" + projectname[(int)recommendation.getItemID()-1]	+ "\", ";
				}
				//System.out.println(out);
				outputfile.write(out);
			}
			userfile.close();
			projectfile.close();
			outputfile.close();
		} catch (IOException e) {
			System.out.println("There was an error.");
			e.printStackTrace();
		} catch (TasteException e) {
			System.out.println("There was a Taste Exception.");
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time elapsed: " + (endTime-startTime) + "ms");

	}

}
