public class Arrayduplicate {
   public static void main(String[] args) {
   int[] array = {1, 2, 3, 2, 4, 5, 1};
     System.out.println("Duplicate elements are:");
     for(int i = 0; i < array.length; i++) {
     for(int j = i + 1; j < array.length; j++) {
     if(array[i] == array[j]) {
     System.out.println(array[i]);
     break;
     }
    }
   }
}
}
