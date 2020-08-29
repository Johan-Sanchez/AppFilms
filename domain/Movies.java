package edu.learning.johan.app.domain;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import edu.learning.johan.app.services.ReadFile;
import org.apache.commons.csv.CSVRecord;


public class Movies {

    private List<MoviesDescription> movies = new ArrayList<>();
    private MoviesDescription movie ;

    private static Movies instance = null;

    private Movies() {

    }

    public synchronized static Movies getInstance() {

        if (instance == null) {
            instance = new Movies();
        }
        return instance;
    }

    //Getter

    public List<MoviesDescription> getMovies() {

        ReadFile reads = new ReadFile();

            reads.read();
        if (reads.getCsvParser() == null) {

            return null;

        } else {

            for (CSVRecord column : reads.getCsvParser()) {

                movie = new MoviesDescription(column.get("index"), column.get("title"),
                        column.get("imdb"), column.get("rottenTomatoes"),
                        column.get("netflix"), column.get("hulu"), column.get("primeVideo"),
                        column.get("disneyPlus"), column.get("type"), column.get("age"));

                movies.add(movie);



            }
            return movies;

        }



    }

}














