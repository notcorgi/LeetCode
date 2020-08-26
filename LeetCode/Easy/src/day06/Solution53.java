package day06;
//普通遍历法
public class Solution53 {
    public static void main(String[] args) {
        int[] a={1}; //n=10  len=n-1
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] nums) {
            for(int i=0;i<nums.length;i++){
                if(i!=nums[i]){
                    return i;
                }
            }
            return nums.length;
    }
}
