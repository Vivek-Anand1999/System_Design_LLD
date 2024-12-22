package meetingSchedular;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    private int roomId;
    private int capacity;
    private List<Meeting> calenders;

    public MeetingRoom(int capacity, int roomId) {
        this.capacity = capacity;
        this.roomId = roomId;
        calenders = new ArrayList<>();
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public List<Meeting> getCalenders() {
        return calenders;
    }

    public void setCalenders(List<Meeting> calenders) {
        this.calenders = calenders;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public boolean isAvailable(LocalDateTime startTime, LocalDateTime endTime) {
        for (Meeting meeting : calenders) {
            if (startTime.isBefore(meeting.getEndTime()) && endTime.isAfter(meeting.getStartTime())) {
                return false;
            }
        }
        return true;
    }

    public void addMeetingAtCalender(Meeting meeting) {
        calenders.add(meeting);
    }


    @Override
    public String toString() {
        return "MeetingRoom{" +
                "roomId=" + roomId +
                ", capacity=" + capacity +
                ", calenders=" + calenders +
                '}';
    }
}
