package src.twoPointers;

public class RemoveDuplicate2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,2,5,5,8};

        int ans = removeDuplicate2(arr);
        System.out.println(ans);

    }

    private static int removeDuplicate2(int[] arr) {

        int j = 0;
        int n = arr.length;

        for (int i = 0;i<n;i++) {

            if (i<n-2 && arr[i] == arr[i+2]) {
                continue;
            }
                arr[j++] = arr[i];
        }

        return j;
    }
}
