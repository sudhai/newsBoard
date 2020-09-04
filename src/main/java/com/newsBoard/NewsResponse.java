package com.newsBoard;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
public class NewsResponse
{
	@JsonIgnore
    private String status;
	@JsonIgnore
    private int totalResults;

    private List<Article> articles;

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setTotalResults(int totalResults){
        this.totalResults = totalResults;
    }
    public int getTotalResults(){
        return this.totalResults;
    }
    public void setArticles(List<Article> articles){
        this.articles = articles;
    }
    public List<Article> getArticles(){
        return this.articles;
    }
}
