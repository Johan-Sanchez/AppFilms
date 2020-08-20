package edu.learning.johan.app.domain;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import edu.learning.johan.app.reader.ReadFile;
import org.apache.commons.csv.CSVRecord;


public class Movies {

    private List<MoviesDescription> movies = new ArrayList<>();

    private static Movies instance = null;

    private Movies() {
    }

    public synchronized static  Movies getInstance() {

        if(instance == null){
            instance = new Movies();
        }
        return instance;
    }

    //Getter y Setter

    public List<MoviesDescription> getMovies() {

        llenarLista();
        return movies;
    }


    private boolean llenarLista() {

        ReadFile reads = new ReadFile();
        MoviesDescription movie;

        if (reads.getCsvParser() == null){

            return false;
        }else{

            for (CSVRecord column : reads.getCsvParser()) {

                movie = new MoviesDescription(column.get("index"),column.get("title"),
                        column.get("imdb"), column.get("rottenTomatoes"),
                        column.get("netflix"),column.get("hulu"),column.get("primeVideo"),
                        column.get("disneyPlus"), column.get("type"), column.get("age"));

                movies.add(movie);
            }
                try {
                    reads.getCsvParser().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return  true;
        }

    }

    public static void main(String[] args) {
        Movies m = Movies.getInstance();

        for(MoviesDescription n: m.getMovies()) {
            System.out.println(n.getImdb());
        }
        }
    }











