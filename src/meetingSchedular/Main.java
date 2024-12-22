package meetingSchedular;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MeetingRoom meetingRoom1 = new MeetingRoom(10, 101);
        MeetingRoom meetingRoom2 = new MeetingRoom(8, 102);

        User user = new User();
        List<String> attendees = new ArrayList<>();
        attendees.add("A");
        attendees.add("B");
        attendees.add("C");
        attendees.add("D");

        LocalDateTime startTime = LocalDateTime.of(2024,12,6,9,0);
        LocalDateTime endTime = LocalDateTime.of(2024,12,6,10,0);
        user.bookMeeting(meetingRoom1, "dsa", startTime, endTime, 5, attendees);
        user.bookMeeting(meetingRoom1, "dsa", startTime, endTime, 5, attendees);



    }
}
