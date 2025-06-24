import java.util.Scanner ;
public class Minmax {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements in array:");
    int size = sc.nextInt();
    int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
      }
       if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];          
  }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
 }
}