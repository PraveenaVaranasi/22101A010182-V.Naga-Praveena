public class Arraysum {
  public static void main(String args[]) {
  int[] array1 = {10,20,30,40,50};
  int[] array2 = {13,24,35,56,78};
  int[] sumArray = new int[5];
  for(int i=0;i<5;i++) {
    sumArray[i] = array1[i] + array2[i];
     System.out.println(sumArray[i]+ " " );
}
 }
}