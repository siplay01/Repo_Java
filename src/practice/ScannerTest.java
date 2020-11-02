package practice;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;

        System.out.print("Enter your name: ");
        userName = scanner.nextLine();

        System.out.println("Your name is: " + userName.substring(0,1).toUpperCase() + userName.substring(1).toLowerCase());
    }
}