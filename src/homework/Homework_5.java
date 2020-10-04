package homework;

public class Homework_5 {

    public static void main(String[] args) {

        // 1. Write code/method to return abbreviation for any given string
            // * Example: String msg = "Outfit of the day"
            // * Expected: OOTD   // GM HAGDTY
            // * String msg = "have a great day to you"
            // *
            // * //code
            // *
            // * sout("Abbreviation : " + abr);
            String msg = "have happy and prosperous life";
            String[] words = msg.split(" ");
            String abr = "";
            for (String word: words) {
                abr += word.substring(0,1).toUpperCase() ;
            }
            System.out.println("Abbreviation: " + abr);     // HHAPL


        // 2. Change the string to title case
            String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
            System.out.println("Line (Before modification) : " + line);
            String[] lineArr = line.toLowerCase().split(" ");
            String modified = "";
            for (String array : lineArr) {
                modified += array.toUpperCase().charAt(0) + array.substring(1) + " ";
            }
            line = modified.trim();
            System.out.println("Line (After modification) : " + line);

        // 3. reverse a string
            String message = "happy holidays"; //syadiloh yppah
            String reverseMessage = "";
            System.out.println("Message : " + message);
            for (int i = message.length() - 1; i >= 0; i--) {
                reverseMessage += message.charAt(i);
            }
            System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah
    }
}
