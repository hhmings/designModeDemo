package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/9/24 20:33
 */
public class PredicateTest {

    public static void main(String[] args) {

        List<String> filter = filter(Arrays.asList("a", "b", "c"), (String s) -> !s.isEmpty());
        System.out.println(filter);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
