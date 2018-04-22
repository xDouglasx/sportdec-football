package br.com.sportdec.football.service;

import java.util.List;

import br.com.sportdec.football.model.Project;
import br.com.sportdec.football.repository.GithubRepository;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class GithubService {

	private GithubRepository githubRepository;
	
	public GithubService() {		
		this.githubRepository = Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(GithubRepository.class, "https://api.github.com");
		
	}
	
	public List<Project> getProjects(String keyword){
		return this.githubRepository.getGitHubProjects(keyword).getItems();	
		
	}
}
