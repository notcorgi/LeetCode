package day03;

//简单正则表达式写法使用split给字符串分组
public class Solution58_2 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
    }

    public static int lengthOfLastWord(String s) {
        try {
            String[] string = s.split("\\s+");
            return string[string.length - 1].length();
        } catch (Exception e) {     //若无匹配则捕捉异常
        return 0;}
    }
}

