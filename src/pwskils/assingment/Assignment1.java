package src.pwskils.assingment;

import java.util.HashMap;


public class Assignment1 {

    public static int solution(int[] arr) {

        HashMap<Integer,Integer > map = new HashMap<Integer,Integer>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0 )+1);        
        }
        for (int num : map.keySet()) {
          if (map.containsKey(num) && map.get(num) == 1) {          
            max = Math.max(num, max);   
          } 
        }
        return max;        
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4,6,8,8,2,9,9,9,9,10,10,4};
        int ans = solution(arr);
        System.out.println(ans);    
    }
}