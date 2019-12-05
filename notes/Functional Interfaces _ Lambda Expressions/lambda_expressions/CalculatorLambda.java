package lambda_expressions;

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
        
        // Lambda expressions need not have a return statement
        BiFunction<Integer, Integer, Integer> divideLazy = (Integer t, Integer u) -> t / u;
        
        // Test the methods
        System.out.println(add.apply(8, 4));
        System.out.println(subtract.apply(8, 4));
        System.out.println(multiply.apply(8, 4));
        System.out.println(divide.apply(8, 4));
        System.out.println(divideLazy.apply(8, 4));
        
    }

}
