public class VIPTickets extends Ticket {
    private String vipAccess; // Additional VIP benefit

    // Constructor
    public VIPTicket(String ticketType, double price, String eventDate, String vipAccess) {
        super(ticketType, price, eventDate);
        this.vipAccess = vipAccess;
    }

    // Getters and Setters
    public String getVipAccess() {
        return vipAccess;
    }

    public void setVipAccess(String vipAccess) {
        this.vipAccess = vipAccess;
    }

    @Override
    public void getTicketDetails() {
        System.out.println("VIP Ticket: " + getTicketType());
        System.out.println("Price: P" + getPrice());
        System.out.println("Event Date: " + getEventDate());
        System.out.println("VIP Access: " + vipAccess);
    }
}
