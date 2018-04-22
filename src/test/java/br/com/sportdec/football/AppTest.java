package br.com.sportdec.football;

import org.junit.Test;
import org.springframework.web.client.HttpClientErrorException;

import br.com.sportdec.football.service.TwitterService;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	  @Test(expected = HttpClientErrorException.class )
	  public void twitterTest() throws HttpClientErrorException {
	    String consumerKey = "AXE7tAccsKLWiHFxpyBHIegt";
	    String consumerSecret = "9MxkdUtf1ajiyEctj6aj7yijP91BHzkNiygX6JDje75AzB8";
	    TwitterService twitterService = new TwitterService(consumerKey, consumerSecret);
	    twitterService.getTweets("footballdata");
	  }
}
