package day03;

public class Solution35 {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(searchInsert(nums,6));
    }
    public static int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if (nums[i]>=target){
                    return i;
                }
            }
            return nums.length;
        }

}
