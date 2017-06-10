import java.io.*;
import java.util.*;

class PancakeSort {

  static int[] pancakeSort(int[] arr) {
    int n = arr.length - 1;
    for(int i=n;i>=0;i--){
      int mi = findMaxIndex(arr,i);
      if(mi!=i){
        flip(arr,mi);
        flip(arr,i);
      }
    }
    return arr;
  }

  static int findMaxIndex(int [] a,int k){
    int max = Integer.MIN_VALUE;
    int maxi = -1;
    for(int i=k;i>=0;i--){
      if(a[i]>max){
        max = a[i];
        maxi = i;
      }
    }
    return maxi;
  }
  static void flip(int [] a,int k){
    int low =0;
    int high =k;
    while(low<high){
      int temp = a[low];
      a[low++] = a[high];
      a[high--] = temp;
    }
  }
  public static void main(String[] args) {
    int [] arr = {1,5,4,3,2};
    arr = pancakeSort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

}