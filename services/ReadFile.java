package edu.learning.johan.app.services;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadFile  {

    private CSVParser csvParser ;
    private final String file = System.getenv("Moviefile");

    public  CSVParser read() {


       try {
            Reader reader = Files.newBufferedReader(Paths.get(file));
            csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                                 .withHeader("index","id","title","year","age","imdb","rottenTomatoes","netflix","hulu","primeVideo",
                                             "disneyPlus","type","directors","geners","country","language","runtime"));





       } catch (IOException e) {
           System.out.println("");
           System.out.println("No se e ncuentra el archivo " + e.getMessage());

       }

        return csvParser;

   }





}
