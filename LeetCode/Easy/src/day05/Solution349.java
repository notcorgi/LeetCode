package day05;

import java.util.ArrayList;
import java.util.List;

public class Solution349 {
    public static void main(String[] args) {
        int[] a = {3, 4, 3, 9};
        int[] b = {3, 3, 9, 10};
        for (int c : intersection(a, b)) {
            System.out.println(c);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int a : nums1) {
            for (int b : nums2) {
                if (a == b) {
                    if (!list.contains(a)) {
                        list.add(a);
                        break;
                    }
                }
            }
        }
        int[] c = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            c[i++] = integer;
        }

        return c;
    }
}
