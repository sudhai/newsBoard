package com.newsBoard;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewsController {

	@Autowired
	NewsRepository repo;
	
	@RequestMapping("/loadData")
	public String loadData() {

		String API_KEY = "a8462e92b06e456c92ec2b983d84162d";
		final String uri = "https://newsapi.org/v2/everything?domains=wsj.com&apiKey=" + API_KEY;

		System.out.println("uri: " + uri);
//	    RestTemplate restTemplate = new RestTemplate();
//	    JsonNode result = restTemplate.getForObject(uri, JsonNode.class);

		CloseableHttpClient httpClient = HttpClients.custom().build();
		HttpComponentsClientHttpRequestFactory reqFactory = new HttpComponentsClientHttpRequestFactory();
		reqFactory.setHttpClient(httpClient);
		ResponseEntity<NewsResponse> response = new RestTemplate(reqFactory).exchange(uri, HttpMethod.GET, null,
				NewsResponse.class);
		// String responseCode = response.getStatusCode();
		System.out.println(response.getBody());
		repo.save(response.getBody().getArticles());
		
		
		return "Data is loaded";

	}

	@RequestMapping("/getNewsByDate")
	public Article getNewsByDate(@RequestParam String date) {
		return null;
	}

	@RequestMapping("/getNewsByCity")
	public Article getNewsByCity(@RequestParam String city) {
		return null;
	}
}