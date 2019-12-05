package lambda_expressions;

public class Main {

    public static void main(String[] args) {
        
        Functional_Interface lambdaExp = () -> {
            System.out.println("Hello World");
        };
        
        lambdaExp.myFunction();
        
    }

}
