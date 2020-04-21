package com.movieInfoService.movieinfoservice.Info;

public class Movie {
	
	private String movieId;
	private String id;
	
	
	public Movie(String movieId, String id) {
		super();
		this.movieId = movieId;
		this.id = id;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}