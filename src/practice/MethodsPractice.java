package practice;

public class MethodsPractice {

    public static void main(String[] args) {

        String phrase = "Practice makes perfect!";

        System.out.println("In the phrase - " + phrase);
        System.out.println("The character at index 0 is " + phrase.charAt(0)); // charAt()
        System.out.println("The character at index 10 is " + phrase.charAt(10)); // charAt()
        System.out.println("Total characters - " + phrase.length()); // length()
        System.out.println("The phrase Starts with 'The' is " + phrase.startsWith("The")); // startsWith()
        System.out.println("The phrase Ends with '!' is " + phrase.endsWith("!")); // endsWith()
        System.out.println("Clarification - " + (phrase = phrase.replace("P","Perfect p"))); // replace( String )
        System.out.println("All to UpperCase: " + phrase.toUpperCase());
        System.out.println("All to LowerCase: " + phrase.toLowerCase());
        System.out.println("Capitalization: " + phrase.replace('p','P')); // replace( char )

    }
}
