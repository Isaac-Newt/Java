package question_7_calculator;

public class OrdinaryCalculator implements Calculator {
    // Define abstract methods
    @Override
    public int Addition(int A, int B) {
        return A + B;
    }

    @Override
    public int Subtraction(int A, int B) {
        return A - B;
    }

    @Override
    public int Multiplication(int A, int B) {
        return A * B;
    }

    @Override
    public int Division(int A, int B) {
        return A / B;
    }

    // Define Display as not overridable
    public static void Display() {
        System.out.println("I am a B&W Display");
    }
}
