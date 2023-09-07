package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new LinkedHashSet<>();
        Iterator<Integer> i = sourceList.iterator();
        while (i.hasNext()) {
            int b = i.next();
            if (b % 2 == 0) {
//
                while (b % 2 == 0) {
                    result.add(b);
                    b = b / 2;
                    if (b % 2 != 0) {
                        result.add(b);
                    }

                }

            } else {
                result.add(b);
                result.add(2 * b);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[]{2, -1, 3, 8, -5, 12};
        List<Integer> list1 = Arrays.asList(a);

        HashSetCreator hsc = new HashSetCreator();
        hsc.createHashSet(list1);

        System.out.println(hsc.createHashSet(list1));
        // Input
        //sourceList = [2, -1, 3, 8, -5, 12]
        //Output
        //[2, 1, -1, -2, 3, 6, 8, 4, -5, -10, 12]
    }
}
