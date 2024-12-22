package meetingSchedular;

import java.time.LocalDateTime;
import java.util.List;

public class Meeting {
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int requiredCapacity;
    private List<String> attendees;

    public Meeting(String title, List<String> attendees, int requiredCapacity, LocalDateTime startTime, LocalDateTime endTime) {
        this.title = title;
        this.attendees = attendees;
        this.requiredCapacity = requiredCapacity;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    public int getRequiredCapacity() {
        return requiredCapacity;
    }

    public void setRequiredCapacity(int requiredCapacity) {
        this.requiredCapacity = requiredCapacity;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", requiredCapacity=" + requiredCapacity +
                ", attendees=" + attendees +
                '}';
    }
}
