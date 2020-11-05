package practice.ForeLoop.FirstPerfectSquare;

public class RunFirstPerfectSquare {

    public static void main(String[] args) {

        FirstPerfectSquare fps = new FirstPerfectSquare();

        int[] numbers = {111, 32, 43, 54, 64, 144, 11, 82, 91, 23};
        fps.firstPerfectSquare1(numbers);
        fps.firstPerfectSquare2(numbers);
        fps.firstPerfectSquare3(numbers);
        fps.firstPerfectSquare4(numbers);
    }
}
