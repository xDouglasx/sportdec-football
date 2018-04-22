package br.com.sportdec.football;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.client.HttpClientErrorException;

import br.com.sportdec.football.model.Project;
import br.com.sportdec.football.service.GithubService;
import br.com.sportdec.football.service.TwitterService;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);	
	
    public static void main( String[] args ){    	
    	BasicConfigurator.configure();
    	
    	String consumerKey = "";
    	String consumerSecret = "";
    	String keyword = "football"; 
    	
    	if (args.length > 0 && args[0] != null) {
    	      consumerKey = args[0];
    	}
    	    
    	if (args.length > 1 && args[1] != null) {
    	      consumerSecret = args[1];
    	}
    	
    	if (args.length > 2 && args[2] != null) {
  	      keyword = args[2];
  	    }
    	
    	GithubService githubService = new GithubService();
    	List<Project> projects = githubService.getProjects(keyword);

    	System.out.println("\n\n---------- RETRIEVING LIST OF PROJECTS ON GIT HUB WITH THE WORD '" +
    	keyword.toUpperCase() + "' ----------\n");

        for(int i = 0; i < 10; i++) {
        	System.out.println("\n---------- PROJECT " + (i+1) + " ---------------\n");
        	
        	System.out.println(" Project id: " + projects.get(i).getId());
        	System.out.println(" Project name: " + projects.get(i).getName());
        	System.out.println(" Project description: " + projects.get(i).getDescription());
        	System.out.println("\n");
        	
        	
        	System.out.println("-----RETRIEVING LIST OF RECENT TWEETS RELATED TO " + 
        	projects.get(i).getName().toUpperCase() + "------\n");  	
        	
        	List<Tweet> tweetList = new ArrayList<Tweet>();
        	
        	try {
        		  TwitterService twitterService = new TwitterService(consumerKey, consumerSecret);
        	      tweetList = twitterService.getTweets(projects.get(i).getName());
        	      
        	      if(tweetList.size() < 1)
              		System.out.println("\nno tweets was found for this project :(\n");
              		
              	  for(int j = 0; j < tweetList.size(); j++) {
              		
              		System.out.println("\n----------------------------");
              		System.out.println("From User: " + tweetList.get(j).getFromUser());
              		System.out.println("Tweet Text: " + tweetList.get(j).getText());
              		System.out.println("Tweet Id: " + tweetList.get(j).getId());
              		System.out.println("----------------------------");
              	}
        	} catch(HttpClientErrorException e) {
        		logger.error("was not possible retrieve tweets because you provided a invalid consumer key " + 
        	    "or a invalid key secret" );
        	}     	
        	
        }
        
        System.out.println("\n-----------SEARCH FINISHED-------");
    }
}
