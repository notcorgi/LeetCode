package day06;
//普通方法
public class Solution11 {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(minArray(a));
    }

    public static int minArray(int[] numbers) {
        int ans = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return ans;
    }
}
