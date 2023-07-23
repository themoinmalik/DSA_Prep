package src.pwskils.assingment;

import java.util.HashMap;

public class Assignment1 {
    public static int solution(int[] arr, int t) {

      int i = 0;
      int j = arr.length-1;

      while(i <=j) {
        int mid = (i+j)/2;

        if(arr[mid] == t) {
          return mid;
        }

        if (arr[i] <= arr[mid]) {  // left array ... 4
          if (t >= arr[i] && t < arr[mid]) {
            j = mid-1;
          }else {
            i = mid+1;
          }
          
        }else {
          if (t > arr[mid] && t <= arr[j]) {
            i = mid+1;
          }else {
            j = mid-1;
          }
        }
      }
      return -1;       
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int t = 0;
        int ans = solution(arr,t);
        System.out.println(ans);    
    }
}