public class ticket {
    private String ticketType;
    private double price;
    private String eventDate;
    private String holderName;
    
    // Constructor
    public Ticket(String ticketType, double price, String eventDate,String holderName) {
        this.ticketType = ticketType;
        this.price = price;
        this.eventDate = eventDate;
        this.holderName=holderName;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }
    public String getHolderName(String holderName){
        this.holderName=holderNme;
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

// method to get ticket details
    public String getTicketDetails(){
        return "ticket Details:\n" + 
               "name:  "+ getHolderName();"\n"
               "eventDate:   "+ getEventDate();"\n"
               "ticket type:  " + getTicketType();"\n"
               "price:   "+  getPrice();"\n"
}

