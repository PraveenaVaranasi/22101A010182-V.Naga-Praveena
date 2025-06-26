public class Mergsort{
   public static void main(String[] args) { 
      divideByTwo(64);
   }
    public static void divideByTwo(int n) {
     System.out.println(n);
     if(n>1) {
       divideByTwo(n/2);
}
 }
 }
