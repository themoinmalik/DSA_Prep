package src.BinarySearch;

public class CheckFloor {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 9, 15, 15, 18, 21};
        int target = 20;

        int ans = checkFloor(arr, target);
        System.out.println(ans);
    }

    private static int checkFloor(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;
        int max = Integer.MIN_VALUE;

        while (left<=right) {

            int mid = (left+right)/2;


            if (arr[mid] == target || arr[mid] < target) {
                max = Math.max(arr[mid],max);
            }

            if (arr[mid] < target) {
                left = mid+1;
            } else  {
                right = mid-1;
            }
        }

        return max;
    }
}
