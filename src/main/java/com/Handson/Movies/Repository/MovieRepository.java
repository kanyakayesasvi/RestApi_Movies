package com.Handson.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Handson.Movies.Entity.MovieCatalog;

public interface MovieRepository extends JpaRepository<MovieCatalog, Integer>{

}
