import java.util.Date;

public class RoomService extends RoomCharge {
    public boolean isChargeable;
    public Date requestTime;

    public boolean isChargeable() {
        return isChargeable;
    }
    public void setChargeable(boolean chargeable) {
        isChargeable = chargeable;
    }

    public Date getRequestTime() {
        return requestTime;
    }
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }
}