public class Reversearray {
  public static void main(String[] args) {
  public static void reverseArrayInPlace() {
int start = 0;
   int end = arr.length - 1;
   while(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
}
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArrayInPlace(originalArray);

        System.out.println("Reverse Array (In-Place): ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
} 