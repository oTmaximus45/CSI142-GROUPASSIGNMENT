import java.util.ArrayList;
import java.util.Scanner;

public class TicketUtils {

    // Selection Sort by price
    public static void selectionSortByPrice(ArrayList<Ticket> tickets) {
        for (int i = 0; i < tickets.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tickets.size(); j++) {
                if (tickets.get(j).getPrice() < tickets.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            Ticket temp = tickets.get(i);
            tickets.set(i, tickets.get(minIndex));
            tickets.set(minIndex, temp);
        }
    }

    // Insertion Sort by holder name
    public static void insertionSortByName(ArrayList<Ticket> tickets) {
        for (int i = 1; i < tickets.size(); i++) {
            Ticket key = tickets.get(i);
            int j = i - 1;
            while (j >= 0 && tickets.get(j).getHolderName().compareToIgnoreCase(key.getHolderName()) > 0) {
                tickets.set(j + 1, tickets.get(j));
                j--;
            }
            tickets.set(j + 1, key);
        }
    }

    // Linear Search by name
    public static int linearSearchByName(ArrayList<Ticket> tickets, String name) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getHolderName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

   // Binary Search by price (requires sorted list)
   public static int binarySearchByPrice(ArrayList<Ticket> tickets, double price) {
    int low = 0, high = tickets.size() - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        double currentPrice = tickets.get(mid).getPrice();
        
        if (currentPrice == price) return mid;
        else if (currentPrice < price) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}


  //ticket Search by holdername

    public static void search(ArrayList<Ticket>tickets){
    Scanner scan = new Scanner(System.in);
        for (int i = 0; i<tickets.size(); i++){
        System.out.print( "Ticket name: " + tickets.get(i).getHolderName() + "\n"); 
        }
    }
}
