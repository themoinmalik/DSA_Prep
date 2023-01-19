package src.twoPointers;

public class WaterContainer {


    public static void main(String[] args) {

        int[] arr = new int[]{1,11,8,6,2,5,4,8,3,7,9};

        int ans = containerWithMostWater(arr);

        System.out.println(ans);
    }

    private static int containerWithMostWater(int[] arr) {

        int i =0;
        int j = arr.length-1;
        int area = Integer.MIN_VALUE;
        int gap = arr.length-1;
        while (i<j) {

            int min = Math.min(arr[i],arr[j]);
            area = Math.max(min*gap,area);

            if (arr[i]<arr[j]) {
                i++;
                gap--;
            } else if (arr[i]>arr[j]) {
                j--;
                gap--;
            } else if (arr[i]==arr[j]) {
                i++;
                j--;
                gap = gap-2;
            }
        }

        return area;
    }
}
