public class MovieManagementApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 2010);
        Movie movie2 = new Movie("The Shawshank Redemption", "Drama", 1994);

        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);

        movieManager.displayMovies();

        // Mark the first movie as watched
        movieManager.markMovieAsWatched(0);

        movieManager.displayMovies();

    }
}
