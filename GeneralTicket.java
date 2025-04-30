public class GeneralTicket extends Ticket {
    private String seating;

    public GeneralTicket(String ticketType, double price, String eventDate, String holderName, String seating) 
            throws NegativePriceException {
        super(ticketType, price, eventDate, holderName);
        this.seating = seating;
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative for ticket: " + ticketType);
        }
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    @Override
    public String getTicketDetails() {
        return super.getTicketDetails() + "\n" +
               "Seating: " + getSeating();
    }
}
