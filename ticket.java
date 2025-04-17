public abstract class ticket {
    private String ticketType;
    private double price;
    private String eventDate;
    private String ticketHolder;
    
    // Constructor
    public Ticket(String ticketType, double price, String eventDate) {
        this.ticketType = ticketType;
        this.price = price;
        this.eventDate = eventDate;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    // Abstract method to get ticket details
    public abstract void getTicketDetails();
}

