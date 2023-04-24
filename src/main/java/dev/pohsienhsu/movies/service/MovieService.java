package dev.pohsienhsu.movies.service;

import dev.pohsienhsu.movies.entity.Movie;
import dev.pohsienhsu.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        return this.movieRepository.findAll();
    }

}
