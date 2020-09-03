package com.newsBoard;
import java.util.List;
public class NewsResponse
{
    private String status;

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
