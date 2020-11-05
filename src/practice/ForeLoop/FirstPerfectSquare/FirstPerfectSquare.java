package practice.ForeLoop.FirstPerfectSquare;

public class FirstPerfectSquare {

    public void firstPerfectSquare1(int[] array) {
        for (int j : array) {
            if ((int)Math.sqrt(j) * (int)Math.sqrt(j) == j) {
                System.out.println("Perfect square is " + j);
                break;
            }
        }
    }



    public void firstPerfectSquare2(int[] array) {
        int x = 0;
        for (int j : array) {
            if (x == 0) {
                for (int i = 1; i < j / 6; i++) {
                    if (i * i == j) {
                        System.out.println("Perfect square is " + j);
                        x++;
                    }
                }
            }
        }
    }


    public void firstPerfectSquare3(int[] array) {
        int x = 0;
        for (int i = 1; i < 20; i++) {
            if (x == 0) {
                for (int j : array) {
                    if (i * i == j) {
                        System.out.println("Perfect square is " + j);
                        x++;
                    }
                }
            }
        }
    }


    public void firstPerfectSquare4(int[] array) {
        boolean found = false;
        for (int i = 1; i < 20; i++) {
            for (int j : array) {
                if (i * i == j) {
                    System.out.println("Perfect square is " + j);
                    found = true;
                }
            }
            if (found) {
                break;
            }
        }
    }
}