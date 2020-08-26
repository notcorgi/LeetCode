package Day02;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public static final int I = 1;

    public static void main(String[] args) {
        String string = "III";
        System.out.println(romanToInt(string));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i=0;i<s.length()-1;i++){
            if (map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                sum+=map.get(s.charAt(i));
            }
            else {
                sum-=map.get(s.charAt(i));
            }
//            sum = map.get(chars[i])>=map.get(chars[i+1])? sum+map.get(chars[i]):sum-map.get(chars[i]);     //简便写法 三元运算符
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}
