package dev.pohsienhsu.movies.service;

import dev.pohsienhsu.movies.entity.Movie;
import dev.pohsienhsu.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return this.movieRepository.findAll();
    }

    public Movie MovieById(ObjectId id) {
        Optional<Movie> result = this.movieRepository.findById(id);
        Movie movie;
        if (result.isPresent()) {
            movie = result.get();
        } else {
            throw new RuntimeException("can't find movie with id: " + id);
        }
        return movie;
    }

}
