package day03;

public class Solution67_1 {
    public static void main(String[] args) {
        System.out.println(addBinary("110","111"));
    }
    public static String addBinary(String a, String b) {
        int sum = Integer.parseInt(a,2)+Integer.parseInt(b,2);
        return Integer.toBinaryString(sum);
    }
}
