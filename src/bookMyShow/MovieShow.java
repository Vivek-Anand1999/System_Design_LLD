package bookMyShow;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovieShow {
    private String movieName;
    private LocalDate showDate;
    private LocalTime showTime;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "MovieShow{" +
                "movieName='" + movieName + '\'' +
                ", showDate=" + showDate +
                ", showTime=" + showTime +
                ", location='" + location + '\'' +
                '}';
    }
}
