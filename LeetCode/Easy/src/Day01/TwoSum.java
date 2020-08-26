//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
package Day01;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args){
        int[] nums={2,3,3,0,2,6};
        int[] x = twoSum(nums, 9);
        for (int a :x){
            System.out.println(a);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums);
        int a=-1,b=-1,c=-1,d=-1;
//        List<Integer> arrayList= new ArrayList<>();
        for (int x:nums2)
            System.out.println(x);
        for (int i = 0;i<=nums.length-1;){
            for (int j = nums.length-1;j>=i;){
                if (nums[i]+nums[j]<target){
                    i++;
                }
                else {
                    if(nums[i]+nums[j]>target){
                        j--;
                    }
                    else {
                        a=nums[i];
                        b=nums[j];
                        break;
                    }
                }
            }
            if (a==nums[i]) {
                break;
            }
        }
        for (int i=0;i<=nums2.length-1;i++){
            if (a==nums2[i]){
                    c=i;
            }
            if(b==nums2[i]){
                d=i;
            }
        }
        int[] x = {c,d};
        return x;
    }
}
