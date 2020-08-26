package day04;
//普通遍历方法
public class Solution69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
    public static int mySqrt(int x) {
        for(int i=0;i<=x;i++){
           int j=i+1;
            if(((long)i*i<=x)&&(x<(long)j*j)){  //尽量防止超出类型范围    int i*int i结果为int 应转化为long
                return i;
            }
        }return 0;
    }
}
