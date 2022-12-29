package src.arrays1D;

public class WaterContainerProblem {

    public static void main(String[] args) {

        int[] arr = new int[]{21,5,7,54,21,12,12};
        int maxArea = waterproblem(arr);
        System.out.println(maxArea);
    }

    private static int waterproblem(int[] arr) {

        int maxArea = Integer.MIN_VALUE;
        int beg = 0;
        int end = arr.length-1;   //
        while (beg < end) {
            int width = end - beg;
            int height = Math.min(arr[beg], arr[end]);
            int area = width*height;
            maxArea = Math.max(maxArea,area);

            if (arr[beg] < arr[end]) {
                beg++;
            } else {
                end--;
            }

        }

        return maxArea;
    }
}
