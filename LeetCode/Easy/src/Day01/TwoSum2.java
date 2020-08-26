//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
package Day01;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 0, 2, 6};
        int[] x = twoSum(nums, 9);
        for (int a : x) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                int[] a = {i,map.get(target-nums[i])};
                return a;
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
