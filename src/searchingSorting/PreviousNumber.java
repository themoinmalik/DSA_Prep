package src.searchingSorting;

public class PreviousNumber {

    public static void main(String[] args) {

        int[] a = new int[]{2, 5, 10, 12, 15};
        int target = 8;

        int ans  = checkPrevNum(a,target);
        System.out.println(ans);
    }

    private static int checkPrevNum(int[] a, int target) {

        int i = 0;
        int j = a.length-1;
        int prev = 0;
        int next = 0;


        while (i<=j) {

            int mid = (i+j)/2;

            if (a[mid] == target) {
                return target;
            }

            if (a[mid] > target) {
                next = a[mid];      // ceil...
                j = mid-1;
            } else {
                prev = a[mid];       // floor...
                i = mid+1;
            }
        }

       if (target-prev < next - target) {
           return prev;
       }
       return next;
    }
}
