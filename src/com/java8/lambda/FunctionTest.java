package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/9/24 20:49
 */
public class FunctionTest {

    public static void main(String[] args) {
        List<Integer> map = map(Arrays.asList("aaaa", "bbb", "cc"), (String s) -> s.length());
        System.out.println(map);
    }

    public static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> results = new ArrayList<>();
        for (T t:list) {
            results.add(function.apply(t));
        }
        return results;
    }
}
