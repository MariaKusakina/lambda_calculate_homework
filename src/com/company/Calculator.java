package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    BinaryOperator<String> devideString = (x, y) -> {
        if(Integer.parseInt(y) == 0) {
            return "На ноль делить нельзя";
        } else {
            int i = Integer.parseInt(x) / Integer.parseInt(y);
            return String.valueOf(i);
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<String> printlnString = System.out::println;
}

