package com.newsBoard;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface NewsRepository extends CrudRepository<Article, Integer> {

	@Query("Select * from article where publishedAt=")
	List<Article> findbyDate(String date);
	List<Article> findbyCity(String city);
//public interface NewsRepository extends MongoRepository<NewsResponse, Integer> {

	//S save(NewsResponse response);
}
	