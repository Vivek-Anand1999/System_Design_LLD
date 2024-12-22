package bookMyShow;

public class User {
    private Movies movie;

    public User(Movies movie) {
        this.movie = movie;
    }

    public void searchMovie(String movieNme) {
        MovieShow movie1 = movie.getMovie(movieNme);
        System.out.println(movie1);
    }

    public void bookedMovie(String movieNme, String location) {
        boolean isavailable = movie.bookMovie(movieNme, location);
        if (isavailable) {
            System.out.println("Movie is Booked");
        } else {
            System.out.println("Movie is not Booked");
        }
    }
}