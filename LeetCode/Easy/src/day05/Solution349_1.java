package day05;

import java.util.HashSet;
import java.util.Set;

public class Solution349_1 {
    public static void main(String[] args) {
        int[] a = {3, 4, 3, 9};
        int[] b = {3, 3, 9, 10};
        for (int c : intersection(a, b)) {
            System.out.println(c);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int[] c = new int[set.size()];
        int i = 0;
        for (Integer integer : set) {
            c[i++] = integer;//自动拆箱
        }
        return c;
    }
}
