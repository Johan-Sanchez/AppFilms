package edu.learning.johan.app.services;

import edu.learning.johan.app.domain.Movies;

public class ViewMostRottem {

    Movies movies ;
    public void mostRotten(){

        movies = Movies.getInstance();
        //rotten.stream().filter(r->!r.isBlank()).filter(r-> !r.equals("Rotten Tomatoes"))
        //.map(r->r.substring(0,2)).forEach(System.out::println);

        movies.getMovies().stream().filter(r->!r.getRottenTomatoes().isBlank()).filter(r-> !r.getRottenTomatoes().equals("Rotten Tomatoes"))
                .map(r->r.getRottenTomatoes().replace("%","")).map(Integer::parseInt).max(Integer::compareTo);

        System.out.println(" ");
        System.out.println("Min");

       /* OptionalInt min= movies.stream().filter(r->!r.getRottenTomatoes().isBlank())
                           .filter(r-> !r.getRottenTomatoes().equals("Rotten Tomatoes"))
                           .map(r->r.getRottenTomatoes().replace("%",""))
                           .map(Integer::parseInt).mapToInt(p->p).min();
       System.out.println(min);

       System.out.println(" " ); */



    }
}
