package practice;

public class ReverseString {

    public static void main(String[] args) {

        String newStr = "Hello World!";
        int strLength = newStr.length();
        for (int i = strLength - 1; i >= 0 ; i--) {

            System.out.print(newStr.charAt(i));
        }
    }
}
