package practice;

public class MathLibrary {

    public double add(double a, double b) {
      return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double multiple(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        double result = 0.00;
        if (b != 0) {
            result = a / b;
        }
        return result;
    }
}
