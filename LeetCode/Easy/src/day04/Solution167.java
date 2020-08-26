package day04;
//hashmap法
import java.util.HashMap;

public class Solution167 {
    public static void main(String[] args) {
        int[] b={2,2};
        for (int a:twoSum(b,4)){
            System.out.println(a);
        }

    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] a=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(hashMap.containsKey(target-numbers[i])){
                a[0]=hashMap.get(target-numbers[i])+1;
                a[1]=i+1;
            }
            hashMap.put(numbers[i],i);
        }return a;
    }
}
