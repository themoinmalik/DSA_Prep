package src.twoPointers;

public class minOfThreeArrays {

    public static void main(String[] args) {


        int[] A = new int[]{1,4,5,8,10};
        int[] B = new int[]{6,9,15};
        int[] C = new int[]{2,3,6,6};


        int ans = checkMinDiff(A,B,C);
        System.out.println(ans);


    }

    private static int checkMinDiff(int[] a, int[] b, int[] c) {


        int i=0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;

        for (i=0;i<a.length-1;i++) {

            int can = Math.max(Math.max(a[i],b[j]),c[k]) - Math.min(Math.min(a[i],b[j]),c[k]);
            ans = Math.min(ans,can);

            if (c[k]<=b[j]) {
                k++;
            } else if (a[i]<b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }


        }

        return ans;
    }
}
