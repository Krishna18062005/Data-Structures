import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={1,23,41,42,44,66,777,888,999};
      int ans=BinarySearch(arr,888,0,8);
      System.out.println("Element founded at index :"+ans);
  }
  public static int BinarySearch(int[] ar,int key,int start,int end){
    
    while(start<=end){
      int mid=(start+end)/2;
      System.out.println(start+" "+end);
      if(ar[mid]==key) return mid;
      else if(ar[mid]>key) end=mid-1;
      else start=mid+1;
    }
    return -1;
  }
}
