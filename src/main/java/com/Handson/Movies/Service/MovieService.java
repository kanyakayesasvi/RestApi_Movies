package com.Handson.Movies.Service;

import java.util.List;

import com.Handson.Movies.Entity.MovieCatalog;
public interface MovieService {
	List<MovieCatalog> saveall(List<MovieCatalog> detailsLists);
	
	List<MovieCatalog> getall();
	

}
