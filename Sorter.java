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
}