package com.cst.dto;

public class Film {
	private Integer filmId;
	private String title;
	private String description;
	private Integer languageId;

	private String name;

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFilmId() {
		return filmId;
	}

	public Film setFilmId(Integer filmId) {
		this.filmId = filmId;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Film setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Film setDescription(String description) {
		this.description = description;
		return this;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public Film setLanguageId(Integer languageId) {
		this.languageId = languageId;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
