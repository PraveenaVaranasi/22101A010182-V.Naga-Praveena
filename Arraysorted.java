public class Arraysorted {
 public static void main(String[] args) {
 int[] array = {96,76,54,43,32};
 boolean sorted = true;
 for(int i = 0; i < array.length - 1; i++) {
 if(array[i] > array[i + 1]) {
 sorted = false;
 break;
  }
 }
if(sorted)
System.out.println("The array is sorted in ascending order.");
else
System.out.println("The array is NOT sorted in ascending order.");
    }
}
