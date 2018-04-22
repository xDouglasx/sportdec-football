package br.com.sportdec.football.repository;

import br.com.sportdec.football.model.Github;
import feign.Param;
import feign.RequestLine;

public interface GithubRepository {
	
	@RequestLine("GET /search/repositories?q={keyword}")
	Github getGitHubProjects(@Param("keyword") String keyword);

}
