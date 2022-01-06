package ticket;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {

    private static final Ticket t = new Ticket();
    private static final Ticket t2 = new Ticket();
    @Test
    public void testGetSeatNum(){
        //Ticket t = new Ticket();
        assertEquals(1,t.getSeatNumber());

        //Ticket t2 = new Ticket();
        assertEquals(2, t2.getSeatNumber());
    }

    @Test
    public void testGetOwner(){
        assertEquals("Owner",t.getOwner());
        assertEquals("Owner",t2.getOwner());
    }

    @Test
    public void testGetType(){
        assertEquals("General Admission",t.getType());
        assertEquals("General Admission",t2.getType());
    }

    @Test
    public void testGetCost(){
        assertEquals(50.0, t.getCost(), 0.0);
        assertEquals(50.0, t2.getCost(), 0.0);
    }
}