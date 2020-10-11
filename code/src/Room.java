import metadata.RoomStatus;
import metadata.RoomStyle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room implements Search {
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;

    private List<RoomKey> keys;
    private List<RoomHouseKeeping> houseKeepingLog;

    public boolean isRoomAvailable();
    public boolean checkIn();
    public boolean checkOut();

    public void addLog(RoomHouseKeeping log) {
        houseKeepingLog.add(log);
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomStyle getStyle() {
        return style;
    }
    public void setStyle(RoomStyle style) {
        this.style = style;
    }

    public RoomStatus getStatus() {
        return status;
    }
    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public double getBookingPrice() {
        return bookingPrice;
    }
    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public boolean isSmoking() {
        return isSmoking;
    }
    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    public List<RoomKey> getKeys() {
        return keys;
    }
    public void setKeys(List<RoomKey> keys) {
        this.keys = keys;
    }

    public List<RoomHouseKeeping> getHouseKeepingLog() {
        return houseKeepingLog;
    }
    public void setHouseKeepingLog(List<RoomHouseKeeping> houseKeepingLog) {
        this.houseKeepingLog = houseKeepingLog;
    }

    public List<Room> search(RoomStyle style, Date startDate, int duration) {
        // return all rooms with the given style and availability
        return new ArrayList<>();
    }
}