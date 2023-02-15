package com.Handson.Movies.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Handson.Movies.Entity.MovieCatalog;
import com.Handson.Movies.Exception.MovieException;
import com.Handson.Movies.Repository.MovieRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class MovieServiceImp implements  MovieService{
	
	@Autowired
	private MovieRepository repo;
	
	

//	@Override
//	public MovieCatalog getMovieById(Long id) {
//		// TODO Auto-generated method stub
//		Optional<MovieCatalog> ById=this.repo.findById(id);
//		
//		if(ById.isPresent()) {
//			return ById.get();
//		}
//		else {
//			throw new MovieException("Movie Not Found");
//		}
//	}
//
//	@Override
//	public List<MovieCatalog> getMovies() {
//		// TODO Auto-generated method stub
//		return this.repo.findAll();
//	}
	
	
	//	public MovieService() {	
	//    }

	@Override
	public List<MovieCatalog> saveall(List<MovieCatalog> detailsLists) {
		// TODO Auto-generated method stub
		return this.repo.saveAll(detailsLists);
	}

	@Override
	public List<MovieCatalog> getall() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

}
