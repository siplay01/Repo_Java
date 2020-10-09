package practice;

public class Calculations {
    public static void main(String[] args) {

        MathLibrary ml = new MathLibrary();

        double sum = ml.add(1,1);
        System.out.println(sum);

        double res = ml.divide(10,5);
        System.out.println(res);


    }
}
