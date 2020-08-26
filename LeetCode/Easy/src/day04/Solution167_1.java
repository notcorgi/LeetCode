package day04;
//双指针法
public class Solution167_1 {
    public static void main(String[] args) {
        int[] b = {2, 2};
        for (int a : twoSum(b, 4)) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0, j = numbers.length - 1; j > i; ) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                if (numbers[i] + numbers[j] < target) {
                    i++;
                } else {
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }

}

