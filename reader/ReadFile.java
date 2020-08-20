package edu.learning.johan.app.reader;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;



import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadFile  {

    CSVParser csvParser = null;

    public  void read(String file) {


       try {
            Reader reader = Files.newBufferedReader(Paths.get(file));
            csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                                 .withHeader("index","id","title","year","age","imdb","rottenTomatoes","netflix","hulu","primeVideo",
                                             "disneyPlus","type","directors","geners","country","language","runtime"));





       } catch (IOException e) {
           System.out.println("");
           System.out.println("No se encuentra el archivo " + e.getMessage());

       }


   }

    public CSVParser getCsvParser() {
        return csvParser;
    }



}
