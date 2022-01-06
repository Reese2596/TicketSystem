package Client;

import ticket.Ticket;
import ticket.TicketVIP;

public class TicketTester {

    public static void main(String[] arg){
        //create a ticket
        Ticket t = new Ticket();
        System.out.println(t);
        //System.out.println(t.getClass());
        Ticket t2 = new Ticket();
        System.out.println(t2);
    }
}
