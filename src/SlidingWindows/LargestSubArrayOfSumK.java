package src.SlidingWindows;

public class LargestSubArrayOfSumK {

    public static void main(String[] args) {

        int[] a = new int[]{4,1,1,1,2,3,5};
        int k = 5; // sum.. =

        int ans = largestSubArray(a,k);
        System.out.println(ans);

    }

    private static int largestSubArray(int[] a, int k) {

        int sum = 0;
        int[] win_size = new int[a.length];
        int i = 0;
        int ind = 0;
        int max = 0;

        for (int j =0 ;j<a.length;j++) {
            sum = sum+a[j];

            if (sum == k) {
                max  = Math.max(max,j-i+1);
                sum = sum-a[i];
                i++;
            }
            if (sum>k) {
                while (sum> k) {
                    sum = sum-a[i];
                    i++;
                }
            }
            if (sum == k) {
                win_size[ind++] = j-i+1;
                sum = sum-a[i];
                i++;
            }
        }

        return max;
    }
}
