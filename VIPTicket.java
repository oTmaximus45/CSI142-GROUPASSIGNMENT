public class VIPTicket extends Ticket {
    private String vipAccess; // Additional VIP benefit

    // Constructor
    public VIPTicket(String ticketType, double price, String eventDate, String holderName, String vipAccess) {
        super(ticketType, price, eventDate, holderName);
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
    public String getTicketDetails() {
        return super.getTicketDetails() + "\n" +
               "VIP Access: " + (vipAccess != null && !vipAccess.isEmpty() ? "Yes" : "No");
    }
}
