package trishvaleri.com.databasereviewmovie;

/**
 * Created by Trish Valeri on 4/27/2016.
 */
public class Movie {
    private int _movie_id, _movie_release_yr;
    private double _movie_length;
    private String _movie_title, _movie_genre;

    //empty constructor
    public Movie() {

    }
    //constructor
    public Movie(int movie_id, String movie_title, String movie_genre,
                 int movie_release_yr, double movie_length) {

    }
    //constructor
    public Movie(String movie_title, String movie_genre,
                 int movie_release_yr, double movie_length) {

    }
    //set movie id
    public void set_movie_id(int movie_id) {
        this._movie_id = movie_id;
    }
    //get movie id
    public int get_movie_id() {
        return this._movie_id;
    }
    //set movie release year
    public void set_movie_release_yr(int movie_release_yr) {
        this._movie_release_yr = movie_release_yr;
    }
    //get movie release year
    public int get_movie_release_yr() {
        return this._movie_release_yr;
    }
    //set movie length
    public void set_movie_length(int movie_length) {
        this._movie_length = movie_length;
    }
    //get movie length
    public double get_movie_length() {
        return this._movie_length;
    }
    //set movie title
    public void set_movie_title(String movie_title) {
        this._movie_title = movie_title;
    }
    //get movie title
    public String get_movie_title() {
        return this._movie_title;
    }
    //set movie genre
    public void set_movie_genre(String movie_genre) {
        this._movie_genre = movie_genre;
    }
    //get movie genre
    public String get_movie_genre() {
        return this._movie_genre;
    }
}
