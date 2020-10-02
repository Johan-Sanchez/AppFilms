package edu.learning.johan.app.services;

import edu.learning.johan.app.domain.Movie;
import edu.learning.johan.app.domain.Movies;

import java.util.Comparator;
import java.util.List;

public class MovieService {

    private final  List<Movie> instanceMovies = Movies.getInstance();

    public void topTenImdb (){

        instanceMovies.stream().filter(m -> !m.getImdb().isBlank())
                      .filter(m -> !m.getImdb().equals("IMDb"))
                      .sorted(((o2, o1) -> o1.getImdb().compareTo(o2.getImdb())))
                      .limit(10)
                      .forEach(s-> System.out.println(s.getIndex()+"--"+s.getImdb()+"--"+s.getTitle()));

        /* movies.getMovies().stream().map(m->m.getImdb())
                //.filter(moviesDescription -> !moviesDescription.getImdb().isBlank())
                //.filter(moviesDescription -> moviesDescription.getImdb().equals("9.0"))
                //.peek(v-> System.out.println(v.getImdb()))
                // .map(MoviesDescription::getTitle)
                //.sorted()
                .forEach(System.out::println); */

        //.sorted(Comparator.comparing(Movie::getImdb).reversed())

        //.sorted(Comparator.naturalOrder())//.filter(n-> (n > 8) && (n < 10))
        //.sorted(Comparator.reverseOrder())

        /* Iterator<MoviesDescription> iterator = movies.iterator();
        MoviesDescription movie1;

       while(iterator.hasNext()){
            movie1 = (MoviesDescription)iterator.next();

            System.out.println(movie1.getIndex()+"-----> "+movie1.getTitle()+"------>"
                            + movie1.getImdb()+"----->" + " "+movie1.getRottenTomatoes());
       } */

    }

    public void topTenRotten(){

        instanceMovies.stream()
                .filter(r->!r.getRottenTomatoes().isBlank())
                .filter(r-> !r.getRottenTomatoes().equals("Rotten Tomatoes"))
                //.map(r->r.getRottenTomatoes().replace("%",""))
                .sorted((o2, o1) -> o1.getRottenTomatoes().compareTo(o2.getRottenTomatoes()))
                .limit(10)
                .forEach(s -> System.out.println(s.getIndex()+"--"+s.getRottenTomatoes()+"--"+s.getTitle()));



       /* OptionalInt min= movies.stream().filter(r->!r.getRottenTomatoes().isBlank())
                           .filter(r-> !r.getRottenTomatoes().equals("Rotten Tomatoes"))
                           .map(r->r.getRottenTomatoes().replace("%",""))
                           .map(Integer::parseInt).mapToInt(p->p).min();
       System.out.println(min);


        //rotten.stream().filter(r->!r.isBlank()).filter(r-> !r.equals("Rotten Tomatoes"))
        //.map(r->r.substring(0,2)).forEach(System.out::println);
        */


    }

    public void worstTenImdb(){

        instanceMovies.stream().filter(m -> !m.getImdb().isBlank()).filter(m -> !m.equals("Title"))
                .sorted(((o1, o2) -> o1.getImdb().compareTo(o2.getImdb())))
                .limit(10)
                .forEach(s-> System.out.println(s.getIndex()+"--"+s.getImdb()+"--"+s.getTitle()));

    }

    public void worstTenRotten(){

        instanceMovies.stream()
                .filter(r->!r.getRottenTomatoes().isBlank())
                .filter(r-> !r.getRottenTomatoes().equals("Rotten Tomatoes"))
                //.map(r->r.getRottenTomatoes().replace("%",""))
                .sorted((o1, o2) -> o1.getRottenTomatoes().compareTo(o2.getRottenTomatoes()))
                .limit(10)
                .forEach(s -> System.out.println(s.getIndex()+"--"+s.getRottenTomatoes()+"--"+s.getTitle()));
    }

    // Methods to show movies by provider

    public  void moviesNetflix(){

        instanceMovies.stream().filter(n-> n.getNetflix().equals("1"))
                      .forEach(netflix-> System.out.println(netflix.getTitle()+"--"+netflix.getRuntime()));

    }

    public  void moviesHulu(){

        instanceMovies.stream().filter(n-> n.getHulu().equals("1"))
                .forEach(netflix-> System.out.println(netflix.getTitle()+"--"+netflix.getRuntime()));

    }

    public  void moviesPrimeVideo(){

        instanceMovies.stream().filter(n-> n.getPrimeVideo().equals("1"))
                .forEach(netflix-> System.out.println(netflix.getTitle()+"--"+netflix.getRuntime()));

    }

    public  void moviesDisneyPlus(){

        instanceMovies.stream().filter(n-> n.getDisneyPlus().equals("1"))
                .forEach(netflix-> System.out.println(netflix.getTitle()+"--"+netflix.getRuntime()));

    }

    public  void moviesType(){

        instanceMovies.stream().filter(n-> n.getType().equals("1"))
                .forEach(netflix-> System.out.println(netflix.getTitle()+"--"+netflix.getRuntime()));

    }

    // Methos to show statistics by provider

    public void mostRankingNetflix(){
        int counter = (int) instanceMovies.stream().filter(netflix-> netflix.getNetflix().equals("1"))
                .filter(rotten -> rotten.getRottenTomatoes().startsWith("9")).count();

        instanceMovies.stream().filter(netflix-> netflix.getNetflix().equals("1"))
                               .filter(rotten -> rotten.getRottenTomatoes().startsWith("9"))
                                .forEach(s-> System.out.println(s.getIndex()+" "+s.getTitle()+"  "+s.getRottenTomatoes()));
        System.out.println("");
        System.out.println("The number of netflix films with a rating over 90% in Rotten Tomatoes are "+counter);
    }
}
