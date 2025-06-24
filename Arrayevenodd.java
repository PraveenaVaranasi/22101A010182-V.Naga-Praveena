import java.util.Scanner;
public class Arrayevenodd {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements in the array:");
    int n = sc.nextInt();
    int[] array = new int[n]; 
     int evenCount=0,oddCount=0;
System.out.print("Enter the elements of the array:");
for(int i=0;i<array.length;i++) {
 array[i] = sc.nextInt();
}
for(int i=0;i<array.length;i++) {
if(n % 2 == 0) {
 evenCount++;
} 
else{
oddCount++;
}
}
System.out.println("\nTotal Even Numbers:" +evenCount);
System.out.println("\nTotal Odd Numbers:" +oddCount);   
   }
}
