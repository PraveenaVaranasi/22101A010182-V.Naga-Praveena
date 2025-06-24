import java.util.Scanner;
public class Arraysumaverage{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements in the array:");
    int n = sc.nextInt();
    int[] array = new int[n];
    int sum = 0;
    System.out.print("Enter " + n + " elements:");
    for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
   }
     double average = (double)sum / n;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);   
 }
}