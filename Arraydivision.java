public class Arraydivision {
   public static void main(String args[]) {
int[] arr = {8,4,2,1,3,5,7,6};
divisionArray(arr,0,arr.length-1);
   } 
    public static void divisionArray(int[] arr,int start,int end) {
     for(int i=start;i<=end;i++) {
     System.out.print(arr[i]+" ");
    }
     System.out.println();
      if(start < end) {
      int mid = start+(end-start)/2;
      divisionArray(arr,start,mid);
      divisionArray(arr,mid+1,end); 
  }
}
}