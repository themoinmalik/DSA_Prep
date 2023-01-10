package src.SlidingWindows;

public class LargestSubArrayOfSumK {

    public static void main(String[] args) {

        int[] a = new int[]{2, 1, 4, 3, 2, 5};
        int k = 7; // sum.. =


        int ans = largestSubArray(a,k);
        System.out.println(ans);

    }

    private static int largestSubArray(int[] a, int k) {

        int sum = 0;
        int i = 0;
        int ind = 0;
        int min = Integer.MAX_VALUE;    // for max use MIn_Value

        for (int j =0 ;j<a.length;j++) {
            sum = sum+a[j];

            if (sum>k) {
                while (sum> k) {
                    sum = sum-a[i];
                    i++;
                }
            }
            if (sum == k) {
                min  = Math.min(min,j-i+1);     // use Math.max for maximum size of subArray
                sum = sum-a[i];
                i++;
            }
        }

        return min;
    }
}
