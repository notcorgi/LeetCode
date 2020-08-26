package Day02;

public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;  //代表前面几个空位
        if (len==1)
            return 1;
        for (int i=1;i<len;i++){
            if(nums[i]==nums[i-1]){
                index++;
            }
            else {
                nums[i-index]=nums[i];
            }
        }
        return len-index;
    }
}
