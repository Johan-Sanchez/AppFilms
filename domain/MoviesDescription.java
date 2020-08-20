package edu.learning.johan.app.domain;

public class MoviesDescription {

    private String index;
    private String id;
    private String title;
    private String year;
    private String age;
    private String imdb;
    private String rottenTomatoes;
    private String netflix;
    private String hulu;
    private String primeVideo;
    private String disneyPlus;
    private String type;
    private String directors;
    private String geners;
    private String country;
    private String language;
    private String runtime;

    public MoviesDescription(String index,String title, String imdb, String rottentomatoes ,
                             String netflix,String hulu,String primeVideo,String disneyPlus,
                             String type,String age ) {
        this.imdb = imdb;
        this.rottenTomatoes = rottentomatoes;
        this.index = index;
        this.title = title;
        this.netflix = netflix;
        this.hulu = hulu;
        this.primeVideo = primeVideo;
        this.disneyPlus = disneyPlus;
        this.type = type;
        this.age = age;
    }

        //Getters

        public String getIndex() {
            return index;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getYear() {
            return year;
        }

        public String getAge() {
            return age;
        }

        public String getImdb() {
            return imdb;
        }

        public String getRottenTomatoes() {
            return rottenTomatoes;
        }

        public String getNetflix() {
            return netflix;
        }

        public String getHulu() {
            return hulu;
        }

        public String getPrimeVideo() { return primeVideo; }

        public String getDisneyPlus() {
            return disneyPlus;
        }

        public String getType() {
            return type;
        }

        public String getDirectors() { return directors; }

        public String getGeners() {
            return geners;
        }

        public String getCountry() {
            return country;
        }

        public String getLanguage() {
            return language;
        }

        public String getRuntime() {
            return runtime;
        }


}
