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
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.TanimotoCoefficientSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

public class ItemBased {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//Start time
		int nRecommendations = 5;
		String outputfilename = "data/Item_based_recommendation_result.txt";
		String ratingfilename = "data/preference.txt";
		String projectnamefilename = "data/projectname.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-o:")) {
				outputfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-r:")) {
				ratingfilename = args[i].substring(3);
			} else if (args[i].substring(0, 3).equals("-j:")) {
				projectnamefilename = args[i].substring(3);
			} 
		}
		try {
			int n_projects=30000;
			String [] projectname = new String [n_projects];
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
			DataModel model = new FileDataModel(new File(ratingfilename));
			ItemSimilarity sim = new LogLikelihoodSimilarity(model);
			//UserSimilarity similarity = new TanimotoCoefficientSimilarity (model);
			GenericItemBasedRecommender recommender = new GenericItemBasedRecommender(model,sim);
			for (LongPrimitiveIterator items = model.getItemIDs(); items.hasNext();){
				long itemID = items.nextLong();
				if ((int)itemID>project_id)break;
				
				List<RecommendedItem> recommendations = recommender.mostSimilarItems(itemID, nRecommendations);
				if (recommendations.isEmpty()) continue;
				String out = "";
				out = out + "User who bidding \"" + projectname[(int)itemID-1] + "\" may bid: ";
				for (RecommendedItem recommendation: recommendations){
					if ((int)recommendation.getItemID()>project_id){
						continue;
					}
					out = out + "\"" + projectname[(int)recommendation.getItemID()-1] + "\", ";
				}
				//System.out.println(out);
				outputfile.write(out);
			}
			outputfile.close();
			projectfile.close();
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