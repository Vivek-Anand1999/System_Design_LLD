package bookMyShow;

public class Main {
    public static void main(String[] args) {
        Movies movies = new Movies();

        movies.addMovie("khan", "Bangalore");
        movies.addMovie("karzz", "Mumbai");
        movies.addMovie("salma", "bihar");
        movies.addMovie("balam", "Bangalore");
        movies.addMovie("krish", "bhagalpur");
        movies.addMovie("chor", "Bangalore");

        User user = new User(movies);
        user.searchMovie("khan");
        user.bookedMovie("krish","bhagalpur");

    }
}
