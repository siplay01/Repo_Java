package homework.Homework_8;

public class RunPrinter {

    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.printerSummary();   // T: 100, P:100
        printer.printSingle(33);
        printer.printerSummary();   // T: 90, P:90
        printer.printDouble(25);
        printer.printerSummary();  // T: 80, P:85

        printer.addPages(12);
        printer.addToner(90);
        printer.printerSummary();
        printer.printDouble(83);
        printer.printerSummary();
    }
}
