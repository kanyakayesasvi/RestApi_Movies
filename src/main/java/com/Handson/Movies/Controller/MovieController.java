package com.Handson.Movies.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Handson.Movies.Entity.MovieCatalog;
import com.Handson.Movies.Service.MovieService;



@RestController
public class MovieController {
	@Autowired
	private MovieService service;

	
	
	@PostMapping({"/addmovies"})
	public List<MovieCatalog> saveAllMovies(){
		List<MovieCatalog> ml=new ArrayList();
		ml.add(new MovieCatalog ("21st century girl", "drama", 200.0F));
        ml.add(new MovieCatalog("Pathaan", "action-comedy", 99.99F));
        ml.add(new MovieCatalog("avatar", "action", 149.99F));
        ml.add(new MovieCatalog("hera pheri", "drama", 49.99F));
        ml.add(new MovieCatalog("rrr", "action-drama", 129.99F));
        ml.add(new MovieCatalog("suryavamsham", "action-drama", 29.99F));
        ml.add(new MovieCatalog("kgf chapter1", "action", 139.99F));
        ml.add(new MovieCatalog("kgf chapter2", "action", 159.99F));
        ml.add(new MovieCatalog("one piece", "horror", 39.99F));
        ml.add(new MovieCatalog("friends", "drama", 19.99F));
        ml.add(new MovieCatalog("avengers", "action", 129.99F));
        ml.add(new MovieCatalog("harry poter", "action", 129.99F));
        return this.service.saveall(ml);
	}

	
	@GetMapping({"/allmovies"})
    public List<MovieCatalog> getallmovies() {
        return this.service.getall();
    }
    
	
	@PostMapping({"/buymovie/{id}"})
	public String buymovie(@PathVariable int id) {
		return "movie payment sucessfull";
	
	
	
	}
	
	
}
