package day03;
//转化为数值进行计算，再转化回数组   ps超出long的范围就报错
public class Solution66_1 {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
//        System.out.println(plusOne(nums).toString());
        int[] nums1=plusOne(nums);
        for(int i:nums1){
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        long sum = 0,s = 1;

        for(int i=len-1;i>=0;i--){
            sum=sum+digits[i]*s;
            s=s*10;
        }
        String string=sum+1+"";
        int[] ints=new int[string.length()];
        for(int i=0;i<string.length();i++){
            ints[i]=string.charAt(i)-'0';
        }
        return ints;
    }
}
