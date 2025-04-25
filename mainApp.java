import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(new Ticket("Maun Festival", 250));
        ticketList.add(new Ticket("Gabs Carnival", 300));
        ticketList.add(new Ticket("Francistown Expo", 200));
        ticketList.add(new Ticket("Kgalagadi Bash", 180));
        ticketList.add(new Ticket("Palapye Music Show", 275));

        System.out.println("=== Original Tickets ===");
        printList(ticketList);

        // Sort using Selection Sort
        TicketUtils.selectionSort(ticketList);
        System.out.println("\n=== After Selection Sort (by Price) ===");
        printList(ticketList);

        // Sort using Insertion Sort
        TicketUtils.insertionSort(ticketList); // This is just to show both methods work
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