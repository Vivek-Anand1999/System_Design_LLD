package bookMyShow;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<MovieShow> moviesShows;

    public Movies() {
        moviesShows = new ArrayList<>();
    }

    public String addMovie(String movieName, String location) {
        MovieShow show = new MovieShow();
        show.setMovieName(movieName);
        show.setLocation(location);
        show.setShowDate(LocalDate.now());
        show.setShowTime(LocalTime.now());
        moviesShows.add(show);
        return "Show Added";
    }

    public String removeMovie(String movieName) {
        if (moviesShows == null) return "Movie Not Found";
        moviesShows.removeIf(show -> show.getMovieName().equalsIgnoreCase(movieName));
        return "Show Removed";
    }

    public void printMovies() {
        if (moviesShows == null) return;
        moviesShows.forEach(show -> System.out.println(show));
    }

    public MovieShow getMovie(String movieName) {
        if (moviesShows == null) return null;
        for (MovieShow show : moviesShows) {
            if (show.getMovieName().equalsIgnoreCase(movieName)) return show;
        }
        return null;
    }

    public boolean bookMovie(String movieName, String location) {
        if (moviesShows == null) return false;
        for (MovieShow show : moviesShows) {
            if (show.getMovieName().equalsIgnoreCase(movieName) && show.getLocation().equalsIgnoreCase(location)) {
                return true;
            }
        }
        return false;
    }
}
