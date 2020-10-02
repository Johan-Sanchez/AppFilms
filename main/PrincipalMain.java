package edu.learning.johan.app.main;

import edu.learning.johan.app.services.MovieService;

import java.util.Scanner;

public class PrincipalMain {

    public static void main(String[] args) {

        MovieService service = new MovieService();

        Scanner read = new Scanner(System.in);
        int option;
        boolean exit = false;


        while (!exit) {

            System.out.println(" ");
            System.out.println("************Ranking Films*********");
            System.out.println(" ");
            System.out.println("Select the option you want to see:");
            System.out.println(" ");
            System.out.println("1. Top ten most rated movies");
            System.out.println("2. Worst ten most rated movies");
            System.out.println("3. Movies by provider");
            System.out.println("4. Statistics for provider");
            System.out.println("5. Exit");
            System.out.println("");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ten most rated movies");
                    System.out.println("Select the option");
                    System.out.println("1. By IMDb");
                    System.out.println("2. By Rotten Tomatoes");
                    option = read.nextInt();
                    switch (option) {
                        case 1:
                            service.topTenImdb();

                            break;
                        case 2:
                            service.topTenRotten();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Ten least viewed movies");
                    System.out.println("Select the option");
                    System.out.println("1. By IMDb");
                    System.out.println("2. By Rotten Tomatoes");
                    option = read.nextInt();
                    switch (option){
                        case 1:
                            service.worstTenImdb();
                            break;
                        case 2:
                            service.worstTenRotten();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Movies by provider");
                    System.out.println("");
                    System.out.println("Select the option you want to see:");
                    System.out.println("1. Netflix");
                    System.out.println("2. Hulu");
                    System.out.println("3. Prime Video");
                    System.out.println("4. Disney +");
                    System.out.println("5. Type ");
                    option = read.nextInt();

                    switch (option) {
                        case 1:
                            service.moviesNetflix();
                            break;
                            case 2:
                              service.moviesHulu();
                                break;
                            case 3:
                                service.moviesPrimeVideo();
                                break;
                            case 4:
                                service.moviesDisneyPlus();
                                break;
                            case 5:
                                service.moviesType();
                                break;
                            default:
                                System.out.println("Enter a valid option");
                        }
                        break;

                    case 4:
                        service.mostRankingNetflix();
                        break;

                    case 5:
                        System.out.println("We wait for you back");
                        exit = true;
                        break;


                    default:
                        System.out.println("Only number from 1 to 4");
                    }
            }



           /* Iterator<Double> iterador = imdb.iterator();
            while (iterador.hasNext()){
                index++;
                Double value = Double.(iterador.next());

                System.out.println(index+" " +value);
            }*/

           /* while (iterador.hasNext()){
                index++;
                String value = iterador.next();
                if (value.equals("8.8")) {
                    System.out.println(index + "--- " + value);
                }
            } */


          /* for (CSVRecord csvrecord : filecsv) {

                String index = csvrecord.get(0);
                String id = csvrecord.get(1);
                String title = csvrecord.get(2);
                String year = csvrecord.get(3);
                String age = csvrecord.get(4);

                System.out.println(index + " " + id + " " + title + " " + year+" "+age);

            } */


        }
    }

