package com.newsBoard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
//public interface NewsRepository extends CrudRepository<NewsData, Integer> {
public interface NewsRepository extends MongoRepository<Article, Integer> {
}
	