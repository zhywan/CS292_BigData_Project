package collaborativefiltering;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.DataModelBuilder;
import org.apache.mahout.cf.taste.eval.IRStatistics;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.eval.GenericRecommenderIRStatsEvaluator;
import org.apache.mahout.cf.taste.impl.model.GenericBooleanPrefDataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.common.RandomUtils;

public class RecIREvaluator {

	public static void main(String[] args) {
		final int top = 5; 
		String ratingfilename = "data/preference.txt";
		//Parse the command-line arguments
		for (int i=0;i<args.length;i++){
			if (args[i].substring(0, 3).equals("-r:")) {
				ratingfilename = args[i].substring(3);
			} 
		}
		try {
			RandomUtils.useTestSeed();
			DataModel model = new FileDataModel (new File(ratingfilename)); //Load data file
			RecommenderIRStatsEvaluator evaluator = new GenericRecommenderIRStatsEvaluator ();
			RecommenderBuilder recommenderbuilder = new RecommenderBuilder(){	
				@Override
				public Recommender buildRecommender(DataModel model)
						throws TasteException {
					//UserSimilarity similarity = new PearsonCorrelationSimilarity (model);
					UserSimilarity similarity = new LogLikelihoodSimilarity (model);
					//UserSimilarity similarity = new TanimotoCoefficientSimilarity (model);
					
					UserNeighborhood neighborhood = new NearestNUserNeighborhood (top, similarity, model);
					return new GenericUserBasedRecommender(model, neighborhood, similarity); //Create recommender engine
				}
			};
			DataModelBuilder modelbuilder = new DataModelBuilder(){

				@Override
				public DataModel buildDataModel(
						FastByIDMap<PreferenceArray> trainingdata) {
					return new GenericBooleanPrefDataModel(GenericBooleanPrefDataModel.toDataMap(trainingdata));
				}
				
			};
			IRStatistics stats =evaluator.evaluate(recommenderbuilder, modelbuilder, model, null, top, GenericRecommenderIRStatsEvaluator.CHOOSE_THRESHOLD, 1.0);
			System.out.println("The precision is " + stats.getPrecision());
			System.out.println("The recall is " + stats.getRecall());
			System.out.println("The G-measure is " + Math.sqrt(stats.getRecall()*stats.getPrecision()));
			
		} catch (IOException e) {
			System.out.println("There was an error.");
			e.printStackTrace();
		} catch (TasteException e) {
			System.out.println("There was a Taste Exception");
			e.printStackTrace();
		}

	}

}
