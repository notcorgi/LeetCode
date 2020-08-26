package day05;

public class Solution367 {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
    public static boolean sqrt(int a){
        if(a==1||a==0)
            return true;
        int l=0,r=a;
        while (l<=r){
            int mid=(l+r)/2;
            if(mid>a*1.0/mid){
                r=mid-1;
            }else if(mid<a*1.0/mid){
                l=mid+1;
            }else return true;
        }
        return false;
    }
}
