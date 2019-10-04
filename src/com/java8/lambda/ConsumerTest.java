package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/9/24 20:43
 */
public class ConsumerTest {

    public static void main(String[] args) {

        forEach(Arrays.asList(1,2,3),(Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){

        for (T t:list) {
            consumer.accept(t);
        }
    }
}
