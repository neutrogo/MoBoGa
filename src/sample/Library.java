package sample;

import java.util.ArrayList;

public class Library {
    ArrayList<Movie> myMovies = new ArrayList<>();
    ArrayList<Book> myBooks = new ArrayList<>();
    ArrayList<Game> myGames = new ArrayList<>();

    public Library()
    {
    }

    public ArrayList<Movie> getMovies()
    {
        return myMovies;
    }

    public ArrayList<Book> getBooks()
    {
        return myBooks;
    }

    public ArrayList<Game> getGames()
    {
        return myGames;
    }
}
