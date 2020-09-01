package com.newsBoard;

import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<NewsData, Integer> {

}
