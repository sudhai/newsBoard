package com.newsBoard;

import javax.persistence.*;

@Entity
@Table(name = "Source")
public class Source {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long _id;

	private String id;
	private String name;

	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}