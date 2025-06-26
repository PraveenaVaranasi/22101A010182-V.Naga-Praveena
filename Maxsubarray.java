import java.util.Scanner;
public class Maxsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k (subarray size): ");
        int k = sc.nextInt();
        if (k > n) {
            System.out.println("k cannot be larger than array size.");
            return;
        }
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
