package homework;

import java.text.DecimalFormat;
import java.util.Random;

public class Homework_4 {
    public static void main(String[] args) {

        // 1.  * Create variable to store student-score and total-possible-score;
            //      * Based on the percentage, display grade to student:
            //      * Grade A: 91-100
            //      * Grade B: 81-90
            //      * Grade C: 71-80
            //      * Grade D: 61-70
            //      * Grade E: 51-60
            //      * Grade F: less than or equal to 50
            // calculate percentage
            // your percentage: XX.yy and your grade is: A
            Random random = new Random();
            DecimalFormat myFormatter = new DecimalFormat("00");

            double studentScore = random.nextInt(160);     //  (score/max)*100
            double maxScore=160;
            double totalPS = (studentScore/maxScore)*100;

            if (totalPS >= 91 && totalPS < 100) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: A");
            } else if (totalPS >= 81 && totalPS < 90) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: B");
            } else if (totalPS >= 71 && totalPS < 80) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: C");
            } else if (totalPS >= 61 && totalPS < 70) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: D");
            } else if (totalPS >= 51 && totalPS < 60) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: E");
            } else if (totalPS <= 50) {
                System.out.println("Your percentage: " + myFormatter.format(totalPS) + " and your grade is: F");
            } else {
                System.out.println("Input error");
            }

        // 2. * store value in an int variable
            // * if number is divisible by 3, print "divisible by 3"
            // * if number is divisible by 5, print "divisible by 5"
            // * if number is divisible by 3 and 5, print "divisible by both"
            // * if not divisible by 3 or 5, print the number
            int var = (int) (Math.random() * 1000);
            int devBy3 = var%3;
            int devBy5 = var%5;

            if (devBy3 == 0 && devBy5 != 0) {
                System.out.println(var + " is divisible by 3");
            } else if (devBy5 == 0 && devBy3 != 0) {
                System.out.println(var + " is divisible by 5");
            } else if (devBy3 == 0 && devBy5 == 0) {
                System.out.println(var + " divisible by both");
            } else {
                System.out.println(var + " is not divisible by 3 or 5");
            }

        // 3. * Checking car mode (P, D, N, R)   // switch
            // * if car mode is P and "you can park car"
            // * if car mode is D drive car
            //      * if drive type is Snow, display "You are on Snow mode"
            //      * if drive type is Sport, display "You are on Sport mode"
            //      * if drive type is Eco, display "You are on Eco mode"
            // * if car mode is N you can "put car in car wash"
            // * if car mode is R you can "revere the car"
            char[] charArr = {'P','D', 'N', 'R'};
            int charArrLen = charArr.length;
            int randChar = (int)(Math.random() * charArrLen);
            String[] strArr = {"Snow", "Sport", "Eco"};
            int strArrlen = strArr.length;
            int randStr = (int)(Math.random() * strArrlen);
            char gear = charArr[randChar];
            String cMode = strArr[randStr];

            switch (gear) {
                case 'P':
                    System.out.println("you can park car");
                    break;
                case 'D':
                    if (cMode.equalsIgnoreCase("Snow")) {
                        System.out.println("You are on Snow mode");
                    } else if (cMode.equalsIgnoreCase("Sport")) {
                        System.out.println("You are on Sport mode");
                    } else if (cMode.equalsIgnoreCase("Eco")) {
                        System.out.println("You are on Eco mode");
                    }
                    break;
                case 'N':
                    System.out.println("put car in car wash");
                    break;
                case 'R':
                    System.out.println("revere the car");
                    break;
            }

    }
}
