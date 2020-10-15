package homework.Homework_8;

public class Printer {

    private int tonerLevel = 100;
    private int pagesLevel = 100;

    public  void addToner(int amountOfToner) {
        if (tonerLevel < 100 && amountOfToner <= (100 - tonerLevel)) {
            tonerLevel += amountOfToner;
            System.out.println("Toner successfully added");
        } else {
            System.out.println("Your Enter is wrong");
            System.out.println("You can add up to " + (100 - tonerLevel) + " of ink");
        }
    }

    public void addPages(int amountOfPages) {
        if (pagesLevel < 100 && amountOfPages <= (100 - pagesLevel)) {
            pagesLevel += amountOfPages;
            System.out.println("Paper successfully added");
        } else {
            System.out.println("Your Enter is wrong");
            System.out.println("You can add up to " + (100 - pagesLevel) + " pages of paper.");
        }
    }

    public void printSingle(int amount) {
        if (amount <= tonerLevel && amount <= pagesLevel) {
            tonerLevel -= amount;
            pagesLevel -= amount;
            System.out.println(amount + " single pages is printed.");
            checkToner();
        } else {
            System.out.println("Error22");
        }
    }

    public void printDouble(int amount) {
        if (amount%2 == 0) {
            if (amount <= tonerLevel && (amount/2) <= pagesLevel) {
                tonerLevel -= amount;
                pagesLevel -= (amount/2);
                System.out.println(amount/2 + " double pages is printed.");
                checkToner();
            } else {
                System.out.println("Not enough paper or ink");
            }
        } else {
            if (amount <= tonerLevel && (amount/2)+1 <= pagesLevel) {
                tonerLevel -= amount;
                pagesLevel -= ((amount/2)+1);
                System.out.println(((amount/2)+1) + " double pages is printed.");
                checkToner();
            } else {
                System.out.println("Not enough paper or ink");
            }
        }
    }

    public void printerSummary() {
        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Paper count in tray: " + pagesLevel);
    }

    public void checkToner() {
        if (tonerLevel < 10) {
            System.out.println("Add toner");
        }
    }
}
