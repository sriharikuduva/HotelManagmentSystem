import java.util.Date;

public abstract class RoomCharge {
    public Date issueAt;
    public boolean addInvoiceItem(Invoice invoice);

    public Date getIssueAt() {
        return issueAt;
    }
    public void setIssueAt(Date issueAt) {
        this.issueAt = issueAt;
    }
}