package edu.learning.johan.app.services;

import edu.learning.johan.app.domain.Movies;

public class ViewMostImdb {

    Movies movies ;

    public void mostImdb (){

        movies = Movies.getInstance();

        movies.getMovies().stream().map(m->m.getImdb())
                //.filter(moviesDescription -> !moviesDescription.getImdb().isBlank())
                //.filter(moviesDescription -> moviesDescription.getImdb().equals("9.0"))
                //.peek(v-> System.out.println(v.getImdb()))
                // .map(MoviesDescription::getTitle)
                //.sorted()
                .forEach(System.out::println);

        System.out.println("");

        movies.getMovies().stream().filter(moviesDescription -> !moviesDescription.getImdb().isBlank())

                //.map(Double::parseDouble)
                // .sorted(Comparator.reverseOrder())
                .limit(10)
                .forEach(System.out::println);



        //.sorted(Comparator.naturalOrder())//.filter(n-> (n > 8) && (n < 10))
        //.limit(10)


        /* Iterator<MoviesDescription> iterator = movies.iterator();
        MoviesDescription movie1;

       while(iterator.hasNext()){
            movie1 = (MoviesDescription)iterator.next();

            System.out.println(movie1.getIndex()+"-----> "+movie1.getTitle()+"------>"
                            + movie1.getImdb()+"----->" + " "+movie1.getRottenTomatoes());
       } */

    }
}
