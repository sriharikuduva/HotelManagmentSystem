import java.util.List;

public class Guest extends Person {
    private int totalRoomsCheckedIn;
    private List<RoomBooking> bookingList;

    public int getTotalRoomsCheckedIn() {
        return totalRoomsCheckedIn;
    }
    public void setTotalRoomsCheckedIn(int totalRoomsCheckedIn) {
        this.totalRoomsCheckedIn = totalRoomsCheckedIn;
    }

    public List<RoomBooking> getBookingList() {
        return bookingList;
    }
    public void setBookingList(List<RoomBooking> bookingList) {
        this.bookingList = bookingList;
    }
}