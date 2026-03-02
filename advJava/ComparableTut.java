import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String name; 
    private int year; 

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int compareTo(Movie theOtherMovie) {
        return this.year - theOtherMovie.year; 
    }

    public String getName() {
        return name;
    }


    public int getYear() {
        return year;
    }
}

public class ComparableTut {
    public static void main(String[] args) {
        
        // Create a list of movies
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", 1970));
        movies.add(new Movie("Movie 2", 1980));
        movies.add(new Movie("Movie 3", 1990));

        Collections.sort(movies);

        System.out.println("Movies after sorting by year:");
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getYear());
        }
    }
}