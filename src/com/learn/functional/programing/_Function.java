
package com.learn.functional.programing;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class _Function {
    public static void main(String[] args) {

        int result  = incrementFunction.apply(500);
        System.out.println(result);
        result = multiplyFunction.apply(result);
        System.out.println(applyThenFunction.apply(4));
        System.out.println(biFunction.apply(1,10));

        System.out.println("return from othert class::"+new _FunctionTest().functionTest.apply("abc"));
        System.out.println(doubleFunction.apply(5));

    }

    static Function<Integer, Integer>  incrementFunction = (number) -> {
        System.out.println("Recieved number: "+number);
        return number + 1;
    };
    static Function<Integer, Integer> multiplyFunction = number -> number * 10;
    static Function<Integer, Integer> applyThenFunction = incrementFunction.andThen(multiplyFunction);
    static BiFunction<Integer, Integer, Integer> biFunction = (number, multiplyBy) -> (number + 1) * multiplyBy;
    static Function<Integer, Double> doubleFunction = number -> number * 10.0;
}
