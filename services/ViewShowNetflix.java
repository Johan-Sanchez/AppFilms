package edu.learning.johan.app.services;

import edu.learning.johan.app.domain.Movies;
import edu.learning.johan.app.domain.MoviesDescription;

public class ViewShowNetflix {

    Movies movies;

    public  void showNetflix(){

        movies = Movies.getInstance();

        movies.getMovies().stream().filter(n-> n.getNetflix().equals(("1"))).map(MoviesDescription::getTitle).forEach(System.out::println);

    }
}
