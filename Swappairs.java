import java.util.Scanner;
public class Swappairs {
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the element: ");
    for(int i=0;i<n;i++){
    arr[i] =sc.nextInt();
}
int left = 0;
int right = n-1;
while(left < right){
  int temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
left++;
right--;
 }      
System.out.println("Array values after swapping from start to end: ");
for(int value : arr) {
   System.out.print(value + " ");
   }
 } 
}