package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/9/24 21:18
 */
public class MainTest {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "C", "D");
        strings.sort(String::compareToIgnoreCase);

        System.out.println(strings);
    }
}
