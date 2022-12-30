package src.arrays1D;

public class SlidingWindows {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,0,1,1,1,0,0,1,1,1,1,0};
        int b= 1;
        int ans  = maxOnes(arr, b);
        System.out.println(ans);
    }

    private static int maxOnes(int[] arr, int b) {

        int ans = 0;
        int i = 0, j= 0;

        while (j<arr.length) {
            if (arr[j]==0) b--;
            while (b<0) {
                if (arr[i] ==0) b++;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}
