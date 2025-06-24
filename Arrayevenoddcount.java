import java.util.Scanner;
public class Arrayevenoddcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }
}
