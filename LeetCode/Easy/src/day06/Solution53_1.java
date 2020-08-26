package day06;
//二分法
public class Solution53_1 {
    public static void main(String[] args) {
        int[] a={1}; //n=10  len=n-1
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] nums) {
        int l=0,r=nums.length-1;
        int ans=nums.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(mid==nums[mid]){
                l=mid+1;
            }else {
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}
