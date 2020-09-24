package practice;

import java.util.Scanner;

public class WhileWithIfElse {

    public static void main(String[] args) {

        System.out.println("Are you a boy or a girl?");
        Scanner input = new Scanner(System.in);
        String gender = input.nextLine();

        while (true){

            if (gender.equalsIgnoreCase("boy")) {
                System.out.println("Congratulations! You are a BOY");
                break;
            }
            else if (gender.equalsIgnoreCase("girl")) {
                System.out.println("Congratulations! You are a GIRL");
                break;
            }
            else {

                System.out.println("TRY AGAIN");
                System.out.println("==========");
                System.out.println("Are you a boy or a girl?");
                input = new Scanner(System.in);
                gender = input.nextLine();

            }
        }
    }
}
