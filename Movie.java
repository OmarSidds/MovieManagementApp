public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private boolean isWatched;

    // Constructors
    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.isWatched = false;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void markAsWatched() {
        this.isWatched = true;
    }

    @Override
    public String toString() {
        return "Movie: " + title + "\nGenre: " + genre + "\nRelease Year: " + releaseYear + "\nWatched: " + isWatched;
    }
}


