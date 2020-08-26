package day04;

public class Solution69_1 {
    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
    public static int mySqrt(int x) {
        int l=0;
        int r=x;
        int ans=-1;
        while (l<=r){
            int mid=(l+r)/2;
            if((long)mid*mid<=x){  //小于等于x均有可能是结果值
                l=mid+1;
                ans=mid;
            }else {
                    r=mid-1;
            }
        }
        return ans;
    }
}
