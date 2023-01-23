package src.BinarySearch;

public class FindMinInRotatedArray {

    public static void main(String[] args) {

        int[] a = new int[]{5, 7, 9, 2, 3};

        // Find min of the array...

        int ans = checkMin(a);
        System.out.println(ans);
    }

    private static int checkMin(int[] a) {

        int i =0;
        int j = a.length-1;
        int min = Integer.MAX_VALUE;
        int mid = 0;

        while (i<=j) {

            mid = (i+j)/2;

            if (a[mid] < a[mid+1] && a[mid] < a[mid-1]) {
                min = a[mid];      // number of times array is rotated ->  min = mid;
                return min;
            }

            if (a[mid] > a[mid+1]) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return min;
    }
}
