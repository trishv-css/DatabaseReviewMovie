package trishvaleri.com.databasereviewmovie;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Trish Valeri on 4/27/2016.
 */
public class MyDBHandler extends SQLiteOpenHelper {

    //database version
    private static final int DATABASE_VERSION = 1;
    //database name
    private static final String DATABASE_NAME = "theaterDB.db";

    //table names
    public static final String TABLE_ACTORS = "actors";
    public static final String TABLE_MOVIES = "movies";
    public static final String TABLE_MOVIE_ACTOR = "movie_actor";

    // Actors Table - column names
    public static final String ACTOR_COLUMN_ID = "actor_id";
    public static final String ACTOR_FIRST_NAME = "first_name";
    public static final String ACTOR_LAST_NAME = "last_name";

    // Movies Table - column names
    public static final String MOVIE_COLUMN_ID = "movie_id";
    public static final String MOVIE_TITLE = "movie_title";
    public static final String MOVIE_YEAR = "movie_release_yr";
    public static final String MOVIE_LENGTH = "movie_length";
    public static final String MOVIE_GENRE = "movie_genre";

    // Movie_actor table - column name
    public static final String MOVIE_ACTOR_ID = "movie_actor_id";

    // actor table create statement
    public static final String CREATE_ACTORS_TABLE = "CREATE TABLE " +
            TABLE_ACTORS + "(" +
            ACTOR_COLUMN_ID + " INTEGER PRIMARY KEY," +
            ACTOR_FIRST_NAME + " TEXT," +
            ACTOR_LAST_NAME + " TEXT" + ")";

    // movie table create statement
    public static final String CREATE_MOVIES_TABLE = "CREATE TABLE " +
            TABLE_MOVIES + "(" +
            MOVIE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            MOVIE_TITLE + " TEXT," +
            MOVIE_GENRE + " TEXT," +
            MOVIE_YEAR + " INTEGER," +
            MOVIE_LENGTH + " INTEGER" + ")";

    //movie_actor table create statement
//    public static final String CREATE_MOVIE_ACTOR_TABLE = "CREATE TABLE " +
//            TABLE_MOVIE_ACTOR + "(" +
//            MOVIE_ACTOR_ID + " INTERGER PRIMARY KEY (" + ACTOR_COLUMN_ID + ", " + MOVIE_COLUMN_ID + ")" +
//            "FOREIGN KEY(" + ACTOR_COLUMN_ID + ") REFERENCES " + TABLE_ACTORS + "(" + ACTOR_COLUMN_ID + ")," +
//            "FOREIGN KEY(" + MOVIE_COLUMN_ID + ") REFERENCES " + TABLE_MOVIES + "(" + MOVIE_COLUMN_ID + "))";

    //constructor
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory,
                       int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ACTORS_TABLE);
        db.execSQL(CREATE_MOVIES_TABLE);
 //       db.execSQL(CREATE_MOVIE_ACTOR_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop older table if exists
    //    db.execSQL("DROP TABLE IF EXISTS " + TABLE_MOVIE_ACTOR);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MOVIES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACTORS);

        //create tables again
        onCreate(db);
    }

    //adding new movie
    void addMovie(Movie movie) {
        SQLiteDatabase db = this.getWritableDatabase();

        //adds values to the fields
        ContentValues values = new ContentValues();
        values.put(MOVIE_TITLE, movie.get_movie_title());
        values.put(MOVIE_GENRE, movie.get_movie_genre());
        values.put(MOVIE_YEAR, movie.get_movie_release_yr());
        values.put(MOVIE_LENGTH, movie.get_movie_length());

        //inserting row
        db.insert(TABLE_MOVIES, null, values);
        db.close(); //closes database connection
    }
}
