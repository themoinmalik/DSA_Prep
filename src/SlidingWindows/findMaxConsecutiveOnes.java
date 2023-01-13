package src.SlidingWindows;

public class findMaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int ans = countMax(arr, k);
        System.out.println(ans);
    }

    private static int countMax(int[] arr, int k) {
        int j = 0;
        int i = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int zeroCount = 0;

        for (j = 0; j < n; j++) {

            if (arr[j] == 0) {
                zeroCount++;
            }
            if (zeroCount > k) {
                while (zeroCount > k) {
                    if (arr[i] == 0) {
                        zeroCount--;
                    }
                    i++;
                }
            }

                max = Math.max(max, j - i + 1);

        }
        return max;
    }
}
