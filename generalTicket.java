public class generalTicket extends Ticket {
    private String seating; // Seating info for general ticket

    // Constructor
    public GeneralTicket(String ticketType, double price, String eventDate, String seating,String ticketHolder) {
        super(ticketType, price, eventDate,ticketHolder);
        this.seating = seating;
    }

    // Getters and Setters
    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    //@Override method to print ticket details
    @Override
    public void getTicketDetails() {
        System.out.print("General Ticket: " + getTicketType());
        System.out.print("Price: P" + getPrice());
        System.out.print("Event Date: " + getEventDate());
        System.out.print("Seating: " + getSeating());
    }
    //void method printing a sentence declaring the ticket details in sequence
    System.out.print( "You have the + getTicketType() + " which cost " + getPrice() + "for the seat at"  + getSeating();
}
