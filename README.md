Freelancer_Recommender_Algorithms
=================================

CS292 Big Data Project Team 9

Zhiyun Yin, Na Wang, Zhiyu Wan

Package contentbased includes 4 java files.
--------------------------------------------------------------------------------------
ProjectRecommender.java 
  implements content-based algorithm that recommend top k projects to each freelances.
Arguments:
  -o:Output file (default: "data/Content_based_recommendation_result.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")

--------------------------------------------------------------------------------------
InteractiveRecommender.java 
  implements content-based algorithm that recommend top k projects in an iteractive way.
Arguments:
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")

--------------------------------------------------------------------------------------
FreelancerRecommender.java 
  implements content-based algorithm that recommend top k freelancers to each project.
Arguments:
  -o:Output file (default: "data/Content_based_recommendation_result2.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")
  
--------------------------------------------------------------------------------------
Evaluator.java
  implements evaluatation methods for content-based algorithm and does some other things.
Arguments:
  -o:Output result file (default: "data/eval_result.txt")
  -i:Input freelancer file which contians freelancers' names and top 5 skills associated with each freelancer. (default: "freelancerfile.txt")
  -p:Input project file which contains projects' names and top 5 skills associated with each project. (default: "projectfile.txt")
  -t:Input Ground Truth file which contains the bidding projects for each freelancer and the associated top 5 skills with each project (default: "data/biddingfile.txt")
  -r:Output Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -u:Output freelancer names used in Collaborative Filtering (default: "data/freelancername.txt")
  -j:Output project names used in Collaborative Filtering (default: "data/projectname.txt')
  -s:Output skill names

--------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------

Package collaborativefiltering includes 3 java files.
--------------------------------------------------------------------------------------
UserBased.java
  implements user-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -o:Output result file (default: "data/User_based_recommendation_result.txt")
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -u:Input freelancer names used in Collaborative Filtering (default: "data/freelancername.txt")
  -j:Input project names used in Collaborative Filtering (default: "data/projectname.txt')
  
--------------------------------------------------------------------------------------
ItemBased.java
  implements item-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -o:Output result file (default: "data/Item_based_recommendation_result.txt")
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  -j:Input project names used in Collaborative Filtering (default: "data/projectname.txt')
  
--------------------------------------------------------------------------------------
RecIREvaluator.java
  implements information retrieval evaluation methods for user-based collaborative filtering recommendation algorithm based on Apache Mahout Taste library.
Arguments:
  -r:Input Preference Matrix as an input of Collaborative Filtering algorithm used in Apache Mahout Taste library (default: "data/preference.txt")
  
---------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------

In data folder, there should be three input files: freelancerfile.txt, projectfile.txt, and biddingfile.txt. finishedfile.txt which contains the finished projects for each freelancer and the associated top 5 skills.

In lib folder, there should be the Apache Mahout jar package and its denpendency packages.
