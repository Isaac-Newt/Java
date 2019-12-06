package exercise_5_lambdas;

import java.util.function.BiFunction;

// 4 calculator functions using lambda expressions

public class CalculatorLambda {

    public static void main(String[] args) {
        
        BiFunction<Integer, Integer, Integer> add = (Integer t, Integer u) -> {
            return t + u;
        };
        
        BiFunction<Integer, Integer, Integer> subtract = (Integer t, Integer u) -> {
            return t - u;
        };
        
        BiFunction<Integer, Integer, Integer> multiply = (Integer t, Integer u) -> {
            return t * u;
        };
        
        BiFunction<Integer, Integer, Integer> divide = (Integer t, Integer u) -> {
            return t / u;
        };
        
        // Test the methods
        System.out.println(add.apply(8, 4));
        System.out.println(subtract.apply(8, 4));
        System.out.println(multiply.apply(8, 4));
        System.out.println(divide.apply(8, 4));
        
    }

}
