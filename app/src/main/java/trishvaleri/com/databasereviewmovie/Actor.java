package trishvaleri.com.databasereviewmovie;

/**
 * Created by Trish Valeri on 4/27/2016.
 */
public class Actor {

    private int _actor_id;
    private String _first_name;
    private String _last_name;

    //empty constructor
    public Actor() {

    }

    //constructor
    public Actor(int actor_id, String first_name, String last_name) {
        this._actor_id = actor_id;
        this._first_name = first_name;
        this._last_name = last_name;
    }

    //sets actor id
    public void set_actor_id(int actor_id) {
        this._actor_id = actor_id;
    }
    //gets actor id
    public int get_actor_id() {
        return this._actor_id;
    }
    //sets first name
    public void set_first_name(String first_name) {
        this._first_name = first_name;
    }
    //gets first name
    public String get_first_name() {
        return this._first_name;
    }
    //sets last name
    public void set_last_name(String last_name) {
        this._last_name = last_name;
    }
    //gets last name
    public String get_last_name() {
        return this._last_name;
    }
}
