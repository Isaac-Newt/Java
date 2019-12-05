package lambda_expressions;

import java.util.function.BiFunction;

// 4 calculator functions built with anonymous classes

public class Calculator {

    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t + u;
            }
        };
        
        BiFunction<Integer, Integer, Integer> subtract = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t - u;
            }
        };
        
        BiFunction<Integer, Integer, Integer> multiply = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t * u;
            }
        };
        
        BiFunction<Integer, Integer, Integer> divide = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t, Integer u) {
                return t / u;
            }
        };
        
        // Test the methods
        System.out.println(add.apply(8, 4));
        System.out.println(subtract.apply(8, 4));
        System.out.println(multiply.apply(8, 4));
        System.out.println(divide.apply(8, 4));
        
    }

}
