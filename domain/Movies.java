package edu.learning.johan.app.domain;


import java.util.ArrayList;
import java.util.List;
import edu.learning.johan.app.services.ReadFile;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class Movies {

    private List<Movie> movies = new ArrayList<>();
    private Movie movie ;
    private static Movies instance ;

    private Movies() {

    }

    public synchronized static List<Movie> getInstance() {

        if (instance == null) {
            instance = new Movies();

        }

        return instance.getMovies();
    }

    //Getter

    private List<Movie> getMovies() {


        ReadFile reads = new ReadFile();
        CSVParser csvParcer = reads.read();

        for (CSVRecord column : csvParcer) {

            movie = new Movie(column.get("index"), column.get("title"),
                    column.get("imdb"), column.get("rottenTomatoes"),
                    column.get("netflix"), column.get("hulu"), column.get("primeVideo"),
                    column.get("disneyPlus"), column.get("type"), column.get("age"),column.get("runtime"));

            movies.add(movie);

        }


        return movies;
    }

}
















