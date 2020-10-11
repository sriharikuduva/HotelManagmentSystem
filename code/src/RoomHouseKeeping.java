import java.util.Date;

public class RoomHouseKeeping
{
    private String description;
    private Date startDatetime;
    private int duration;
    private HouseKeeper houseKeeper;

    public void addHouseKeeping(Room room) {
        room.addLog(this);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }
    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public HouseKeeper getHouseKeeper() {
        return houseKeeper;
    }
    public void setHouseKeeper(HouseKeeper houseKeeper) {
        this.houseKeeper = houseKeeper;
    }
}