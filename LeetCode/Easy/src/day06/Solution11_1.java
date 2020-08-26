package day06;
//ew
import java.sql.Array;
import java.util.Arrays;

//普通方法
public class Solution11_1 {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(minArray(a));
    }

    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
