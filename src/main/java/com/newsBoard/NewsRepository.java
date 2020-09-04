package com.newsBoard;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface NewsRepository extends CrudRepository<Article, Integer> {
//public interface NewsRepository extends MongoRepository<NewsResponse, Integer> {

	//S save(NewsResponse response);
}
	