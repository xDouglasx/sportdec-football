package br.com.sportdec.football.service;

import java.util.List;

import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.web.client.HttpClientErrorException;

public class TwitterService {
	
	private Twitter twitter;
	
	public TwitterService(String consumerKey, String consumerSecret) throws HttpClientErrorException {
		this.twitter = new TwitterTemplate(consumerKey, consumerSecret);
	}
	
	public List<Tweet> getTweets(String projecName) throws HttpClientErrorException {
		return this.twitter.searchOperations().search(projecName, 20).getTweets();
	}

}
