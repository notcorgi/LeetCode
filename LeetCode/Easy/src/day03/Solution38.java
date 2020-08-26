package day03;

public class Solution38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++)
            System.out.println(countAndSay(i));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "" + 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            String string = countAndSay(n - 1);
            int len = string.length();
            int count = 0;         //count类似于另一指针
            for (int i = 1; i <= len; i++) {
                if (i == len) {
                    return stringBuffer.append(i - count).append(string.charAt(count)).toString();
                } else {
                    if (string.charAt(i) != string.charAt(count)) {
                        stringBuffer.append(i - count).append(string.charAt(count));
                        count = i;
                    }
                }
            }
            return "";   //必须有，实则不会使用到
        }
    }
}
