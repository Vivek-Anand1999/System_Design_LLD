package meetingSchedular;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private String name;

    public void bookMeeting(MeetingRoom roomNo, String title, LocalDateTime startTime, LocalDateTime endTime, int requiredCapacity, List<String> attendees) {
        if (roomNo.isAvailable(startTime, endTime) && roomNo.getCapacity() > requiredCapacity) {
            Meeting meeting = new Meeting(title, attendees, requiredCapacity, startTime, endTime);
            roomNo.addMeetingAtCalender(meeting);
            System.out.println("Meeting booked successfully");
            SendNotification.sendNotifications(attendees);
        } else {
            System.out.println("Meeting not available");
        }
    }
}
