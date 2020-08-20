package edu.learning.johan.app.utils;

import edu.learning.johan.app.domain.MoviesDescription;
import edu.learning.johan.app.reader.ReadFile;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MovieUtil extends ReadFile {

    public static boolean filterTopTen(MoviesDescription movie){

        Predicate<MoviesDescription> p1 = (MoviesDescription m) -> m.getImdb().equals(" ");
        Predicate<MoviesDescription> p2 = (MoviesDescription m) -> m.getImdb().equals("IMDb");
        Predicate<MoviesDescription> p3 = p1.negate().and(p2.negate());

        return p3.test(movie);
    }


     /*public static Stream<Double> printA() {
        return movies.stream().map(MoviesDescription::getImdb)
                .filter(m-> !m.isBlank())
                .filter(m->!m.equals("IMDb"))
                .map(Double::parseDouble)
                .sorted(Comparator.reverseOrder());//.filter(n-> (n > 8) && (n < 10))
    }*/
}
