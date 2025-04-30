import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        
        try {
            // Create regular tickets
            tickets.add(new Ticket("Maun Festival", 250.0, "2023-11-15", "John Doe"));
            tickets.add(new Ticket("Gabs Carnival", 300.0, "2023-12-01", "Jane Smith"));
            
            // Create VIP ticket
            tickets.add(new VIPTicket("VIP Concert", 500.0, "2023-12-25", "Alice Wonder", "Backstage Pass"));
            
            // Create General ticket with exception handling
            try {
                tickets.add(new GeneralTicket("Sports Event", 150.0, "2023-11-20", "Bob Builder", "Section A"));
                // This would throw an exception:
                // tickets.add(new GeneralTicket("Invalid Event", -50.0, "2023-11-20", "Test User", "Section B"));
            } catch (NegativePriceException e) {
                System.err.println("Error creating ticket: " + e.getMessage());
            }

            // Display original tickets
            System.out.println("=== Original Tickets ===");
            printTickets(tickets);

            // Sort by price using Selection Sort
            TicketUtils.selectionSortByPrice(tickets);
            System.out.println("\n=== After Selection Sort (by Price) ===");
            printTickets(tickets);

            // Search using Binary Search (requires sorted by price)
            double searchPrice = 300.0;
            int priceIndex = TicketUtils.binarySearchByPrice(tickets, searchPrice);
            System.out.println("\nBinary Search for price " + searchPrice + ": " + 
                (priceIndex != -1 ? "Found at index " + priceIndex : "Not found"));

            // Sort by name using Insertion Sort
            TicketUtils.insertionSortByName(tickets);
            System.out.println("\n=== After Insertion Sort (by Holder Name) ===");
            printTickets(tickets);

            // Search using Linear Search
            String searchName = "Jane Smith";
            int nameIndex = TicketUtils.linearSearchByName(tickets, searchName);
            System.out.println("\nLinear Search for name '" + searchName + "': " + 
                (nameIndex != -1 ? "Found at index " + nameIndex : "Not found"));

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static void printTickets(ArrayList<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println(ticket.getTicketDetails());
            System.out.println("----------------------");
        }
    }
}
