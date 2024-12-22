package meetingSchedular;

import java.util.List;

public class SendNotification {
    public static void sendNotifications(List<String> attendees) {
        if (attendees.size() > 0) {
            for (String attendee : attendees) {
                System.out.println(attendee + " sending mail notification");
            }
        }
    }
}
