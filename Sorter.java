import java.util.Arrays;

public class Sorter {
    public static void selectionSort(Ticket[] arr) {

        //Sort in ascending order according to price
        for (int i = 0; i < arr.length - 1; i++) {
           
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
            if (arr[j].getPrice() < arr[minIndex].getPrice()) {
            minIndex = j;
                }
            }

            Ticket temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void insertionSort(int[] arr) {
        // Start from the second element, as arr[0] is "sorted" by default
        for (int i = 1; i < arr.length; i++) {
        Ticket key = arr[i];
        int j = i - 1;
        // Move elements that are bigger than 'key' one position ahead
        while (j >= 0 && arr[j].getPrice > key.getPrice()) {
        arr[j + 1] = arr[j];
        j--;
        }
        // Place 'key' in the correct position
        arr[j + 1] = key;
        }
    }
}
