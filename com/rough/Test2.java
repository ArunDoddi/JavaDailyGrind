package com.rough;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(-(-1));
        int[] nums = {1,2,3};
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(numsList);
        List<Integer> ls = new LinkedList<>();
        ls.add(2);
        ls.add(3);
        ls.add(0,1);
        System.out.println(ls);
    }
}
