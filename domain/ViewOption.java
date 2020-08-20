package edu.learning.johan.app.domain;


public class ViewOption {

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

    public void mostRotten(){


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


   public  void showNetflix(){
       movies.getMovies().stream().filter(n-> n.getNetflix().equals(("1"))).map(MoviesDescription::getTitle).forEach(System.out::println);

   }

/*
   public void  showHulu(){
       movies.stream().filter(n->n.getHulu().equals("1")).map(MoviesDescription::getTitle).forEach(System.out::println);
   }

    public  void  showPrimeVideo(){
        movies.stream().filter(n->n.getPrimeVideo().equals("1")).map(MoviesDescription::getTitle).forEach(System.out::println);
    }

    public void  showDisneyPlus(){
        movies.stream().filter(n->n.getDisneyPlus().equals("1")).map(MoviesDescription::getTitle).forEach(System.out::println);
    }


    public   void showType(){
       if ((movies.stream().filter(n-> n.getType().equals(("1"))).map(MoviesDescription::getTitle)) == null ){
           System.out.println("No se encuentran peliculas por esta plataforma");
       }else{
           movies.stream().filter(n-> n.getType().equals(("1"))).map(MoviesDescription::getTitle).forEach(System.out::println);
       }

    } */


}
