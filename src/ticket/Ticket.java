package ticket;

import java.text.NumberFormat;
import java.util.Locale;

public class Ticket {
    //instance fields
    protected double cost;
    protected String owner;
    protected int seatNumber;

    //class Field
    private static int seatGen = 1;

    //constructor

    //Default Constructor
    public Ticket(){
        //this.cost = 50.0;
        //this.owner = "J. Doe";
        //this.seatNumber = seatGen++;
        this(50.0, "Owner");
    }

    //Parameterized Constructor = cost, name, seat num
    public Ticket(double cost, String owner){
        this.cost = cost;
        this.owner = owner;
        this.seatNumber = seatGen++;
    }

    //Getters(accessor)
    public double getCost() {
        return cost;
    }

    public String getOwner() {
        return owner;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    //Setter(Mutator)
    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType(){
        return "General Admission";
    }

    @Override
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return "\nT|========================"
                + "\nI| SEAT # " + seatGen
                + "\nC| COST: " + formatter.format(cost)
                + "\nK| TYPE: " + getType()
                + "\nE|"
                + "\nT|========================";
    }
}
