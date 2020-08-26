package day05;

public class Solution704 {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        System.out.println(search(a,9));
    }
    public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }else {
                if(nums[mid]<target){
                    l=mid+1;
                }else {
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
