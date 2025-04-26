import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(new Ticket("Maun Festival", 250, "27-12-2025", "Monkey D. Luffy" ));
        ticketList.add(new Ticket("Gabs Carnival", 300, "19-04-2025", "Derek John"));
        ticketList.add(new Ticket("Francistown Expo", 200, "03-05-2025", "Nala Kim"));
        ticketList.add(new Ticket("Kgalagadi Bash", 180, "05-10-2025", "Nico Robin"));
        ticketList.add(new Ticket("Palapye Music Show", 275, "13-12-2025", "Drew Phillips"));

        System.out.println("=== Original Tickets ===");
        printList(ticketList);

        // Sort using Selection Sort
        TicketUtils.selectionSortByPrice(ticketList);
        System.out.println("\n=== After Selection Sort (by Price) ===");
        printList(ticketList);

        // Sort using Insertion Sort
        TicketUtils.insertionSortByID(ticketList); // This is just to show both methods work
        System.out.println("\n=== After Insertion Sort (by Price) ===");
        printList(ticketList);

        // Linear Search
        String searchEvent = "Gabs Carnival";
        int index = TicketUtils.linearSearch(ticketList, searchEvent);
        System.out.println("\nLinear Search for \"" + searchEvent + "\": Index = " + index);

        // Binary Search (requires sorted list)
        double searchPrice = 275;
        int binaryIndex = TicketUtils.binarySearch(ticketList, searchPrice);
        System.out.println("Binary Search for Price " + searchPrice + ": Index = " + binaryIndex);
    }

    public static void printList(List<Ticket> list) {
        for (Ticket t : list) {
            System.out.println(t);
        }
    }
}
