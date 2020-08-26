package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution350 {
    public static void main(String[] args) {
        int[] a = {3, 4, 3, 9};
        int[] b = {3, 3, 9, 10};
        for (int c : intersection(a, b)) {
            System.out.println(c);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
//       Integer[] integers=new Integer[nums2.length];
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
//           integers[i]=nums2[i];
            list.add(nums2[i]);

        }
        for (int a : nums1) {
            for (Integer integer : list) {
                if (a == integer) {
                    list.remove(integer);
                    list1.add(integer);
                    break;
                }
            }
        }
        int[] c = new int[list1.size()];
        for (int j = 0; j < list1.size(); j++) {
            c[j] = list1.get(j);
        }
        return c;
    }
}
