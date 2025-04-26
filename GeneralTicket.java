public class GeneralTicket extends Ticket {
    private String seating; // Seating info for general ticket

    // Constructor
    public GeneralTicket(String ticketType, double price, String eventDate, String seating) throws InvalidException{
        super(ticketType, price, eventDate);
        this.seating = seating;
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    // Getters and Setters
    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    public String getTicketDetails() {
        System.out.print("General Ticket: " + getTicketType());
        System.out.print("Price: P" + getPrice());
        System.out.print("Event Date: " + getEventDate());
        System.out.print("Seating: " + getSeating());
    }
}
