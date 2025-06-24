public class Arrayremoveelement {
    public static void main(String[] args) {
        int[] array = {7,8,9,8,5,7,8};
        int target = 8;
        System.out.println("Array after removing " + target + ":");
        for(int i = 0; i < array.length; i++) {
            if(array[i] != target) {
                System.out.print(array[i] + " ");
    }
   }
  }
}
