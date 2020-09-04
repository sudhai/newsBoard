package com.newsBoard;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.springframework.data.mongodb.core.mapping.Document;
@Entity
@Table(name = "Article")
//@Document(collection = "Articles")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OneToOne
	@ElementCollection
	@JoinColumn(name = "sId", referencedColumnName = "_id")
	private Source source;

	private String author;

	private String title;

	private String description;

	private String url;

	private String urlToImage;

	private String publishedAt;

	private String content;

	public void setSource(Source source) {
		this.source = source;
	}

	public Source getSource() {
		return this.source;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getUrlToImage() {
		return this.urlToImage;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt() {
		return this.publishedAt;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}
}