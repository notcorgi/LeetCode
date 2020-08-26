package day03;
//正则表达式写法 较复杂 可查看58_1解法
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("ewrew"));
    }
    public static int lengthOfLastWord(String s) {
        if (s==null){
            return 0;
        }else {
            int i=0,j=0;
            String string="([a-zA-Z]+)";
            Pattern pattern=Pattern.compile(string);
            Matcher matcher=pattern.matcher(s);
            while (matcher.find()){
                i=matcher.start();
                j=matcher.end();
            }
            if(i==0&&j==0){
                return 0;
            }else return s.substring(i,j).length();
        }
    }
}
