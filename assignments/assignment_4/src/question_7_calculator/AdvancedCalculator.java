package question_7_calculator;

public class AdvancedCalculator extends OrdinaryCalculator {
    public double Power(double A, double B) {
        return Math.pow(A, B);
    }

    public double Root(double A) {
        return Math.sqrt(A);
    }
    /*
    @Override
    public void Display() {
        System.out.println("I am a color display");
    }
    */
}
