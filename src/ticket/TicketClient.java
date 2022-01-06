package ticket;

import ticket.Ticket;

public class TicketClient {

    public static void main(String[] arg) {
        //create a ticket
        Ticket t = new Ticket();
        System.out.println(t.cost);
    }
}
