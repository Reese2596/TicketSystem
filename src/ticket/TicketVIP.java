package ticket;

public class TicketVIP extends Ticket {

    protected String freebies;

    public TicketVIP(){
        this.freebies = "Free Parking";
    }

    public TicketVIP(double cost, String owner, String freebies){
        super(cost, owner);
        this.freebies = freebies;
    }

    @Override
    public String getType() {
        return "VIP";
    }

    public String getFreebies() {
        return freebies;
    }

    public void setFreebies(String freebies) {
        this.freebies = freebies;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
