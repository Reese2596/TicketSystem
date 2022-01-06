package ticket;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketVIPTest {

    public static TicketVIP VIPt = new TicketVIP();
    public static TicketVIP VIPt2 = new TicketVIP(150, "J. Doe","Free Parking");

    @Test
    public void testGetVIP(){
        assertEquals("VIP",VIPt.getType());
        assertEquals("VIP",VIPt2.getType());
    }

    @Test
    public void testGetFreebies(){
        assertEquals("Free Parking", VIPt.getFreebies());
        assertEquals("Free Parking",VIPt2.getFreebies());
    }

}