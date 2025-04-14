public class generalTicket extends Ticket {
    private String seating; // Seating info for general ticket

    // Constructor
    public GeneralTicket(String ticketType, double price, String eventDate, String seating) {
        super(ticketType, price, eventDate);
        this.seating = seating;
    }

    // Getters and Setters
    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    @Override
    public void getTicketDetails() {
        System.out.println("General Ticket: " + getTicketType());
        System.out.println("Price: P" + getPrice());
        System.out.println("Event Date: " + getEventDate());
        System.out.println("Seating: " + seating);
    }
}
