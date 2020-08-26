package Day02;

public class Solution27 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,1,2,3};
        System.out.println(removeElement(nums,2));
    }
    public static int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==val){
                index++;
            }
            else {
                nums[i-index]=nums[i];
            }
        }
        return nums.length-index;
    }
}
