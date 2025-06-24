public class Arraysorted  {
    public static boolean isSortedAscending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int[] array = {24,56,7,8,9};  
         if(isSortedAscending(array)) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }
    }
}
