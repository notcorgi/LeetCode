package day03;

import java.util.ArrayList;
import java.util.List;

public class Solution66 {
    public static void main(String[] args) {
        int[] nums={9};
        int[] nums1=plusOne(nums);
        for(int i:nums1){
            System.out.println(i);
        }
    }
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        int count=1;
        int[] nums=new int[len+1];
        for(int i=len-1;i>=0;i--){
           if(digits[i]!=9){
               if(count==1){
               nums[i+1]=digits[i]+1;
               count=0;
               }else {
                   nums[i+1]=digits[i];
                   count=0;
               }
           }
           else {
               if(count==0){
                   nums[i+1]=digits[i];
                   count=0;
               }else {
                   nums[i+1]=0;
                   if(i==0){
                       nums[i]=1;
                   }
               }
           }
        }
        if(nums[0]!=1){
            int[] nums2=new int[nums.length-1];
            for(int i=1;i<nums.length;i++){
                nums2[i-1]=nums[i];
            }
            return nums2;
        }else return nums;
    }
}
