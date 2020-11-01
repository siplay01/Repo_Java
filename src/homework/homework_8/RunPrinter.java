package homework.homework_8;

import java.util.Scanner;

public class RunPrinter {

    public static void main(String[] args) {

        Printer printer = new Printer();

        System.out.println("Printer is ready.");
        printer.printerSummary();
        System.out.println("Enter amount of pages you want to print:");

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        System.out.println("Chose printing option:");
        System.out.println("S - Single side print");
        System.out.println("D - Double side print");

        Scanner scanner1 = new Scanner(System.in);
        String choice = scanner1.next();
        
        if (choice.equalsIgnoreCase("s")) {
            printer.printSingle(amount);
            printer.printerSummary();
        } else if (choice.equalsIgnoreCase("d")) {
            printer.printDouble(amount);
            printer.printerSummary();
        } else {
            System.out.println("Invalid Enter");
        }
    }
}
