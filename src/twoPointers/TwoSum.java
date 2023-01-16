package src.twoPointers;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{1,4,4,5,5,5,6,6,11};
        int target = 10;

        int ans = checkTwoAns(nums,target);
        System.out.println(ans);
    }

    private static int checkTwoAns(int[] nums, int target) {

        int j= nums.length-1;
        int i=0;
        int sum= 0;
        int count_i = 0;
        int count_j = 0;
        int count_dup = 0;
        int ans = 0;
        int diff_num = 0;
        int dup_num = 0;

        while (j>i) {

            sum = nums[i] + nums[j];

            if (sum < target) {
                i++;
            }
            if (sum > target ) {
                j--;
            }

            if (sum == target) {
                if (nums[i] != nums[j]) {
                    int const_at_i = nums[i];
                    while (nums[i] == const_at_i) {
                        count_i++;
                        i++;
                    }
                    int const_at_j = nums[j];
                    while (nums[j] == const_at_j) {
                        count_j++;
                        j--;
                    }
                     diff_num = count_i*count_j;
                }
                if (nums[i] == nums[j]) {
                    while (i<j) {
                        count_dup++;
                        i++;
                    }
                    dup_num = count_dup*count_dup;
                }

            }
        }

        return diff_num+dup_num;
    }
}
