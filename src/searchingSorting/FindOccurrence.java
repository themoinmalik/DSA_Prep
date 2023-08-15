package src.searchingSorting;

public class FindOccurrence {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 4, 10, 10, 15, 20};
        int target = 20;

        int ans = checkDup(arr,target);    // ans = occurrence...
//       for (int i = 0;i<ans;i++) {
//           System.out.print(arr[i]+","); // index...
//       }

        System.out.println(ans);
    }

    private static int checkDup(int[] arr, int target) {

        int n = arr.length;
        int left = 0;

        int right = n-1;
        int count = 0;

        while (left<=right) {

            int mid = (right+left)/2;

            if (arr[mid]==target) {
                left = mid;
                arr[count++] = mid;
            }
            if (arr[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }

        }

        return count;

    }
}
