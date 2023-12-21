import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private List<Movie> movies;

    // Constructor
    public MovieManager() {
        this.movies = new ArrayList<>();
    }

    // Method to add a movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Method to display all movies
    public void displayMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println("-------------------------");
        }
    }

    // Method to mark a movie as watched
    public void markMovieAsWatched(int index) {
        if (index >= 0 && index < movies.size()) {
            Movie movie = movies.get(index);
            movie.markAsWatched();
        } else {
            System.out.println("Invalid movie index.");
        }
    }
}

