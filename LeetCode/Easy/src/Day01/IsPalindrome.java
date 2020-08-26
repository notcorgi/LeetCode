//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
package Day01;
public class IsPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
//        System.out.println(str);
        char[] chars = str.toCharArray();
        for (int i=0, j=str.length()-1;i<=j;i++,j--){
            if (chars[i]!=chars[j]){
                return false;
            }
        }
        return true;
    }
}
