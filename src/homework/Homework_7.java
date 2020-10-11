package homework;

public class Homework_7 {
    public static void main(String[] args) {

        // Case 1
        Double[] array = {1182.01, 36., 478., 0.12, 604.23, 71., 2., 0.23, 347.87, 0.4, 0.5, 6.63, 26.0};
        System.out.println("Sum of array elements is " + sumOfArr(array));

        // Case 2
        int num = 21;
        System.out.println(primeOrNot(num));

        // Case 3
        String word = "Racecar";
        System.out.println(word + " is a palindrome - " + isAPalindrome(word));

        // Case 4
        String[] strArr = {"hello", "peace", "happy", "hello", "Happy", "hello"};
        duplicates(strArr);

        // Case 5
        String[] arr1 = {"hello", "peace", "happy", "hello", "Happy", "hello", "laugh"};
        String[] arr2 = {"hello", "grow", "laugh", "peace"};
        duplicatesTwoArr(arr1, arr2);
    }

    // 1. Create a method to add all the numbers in a array with double-values
    public static double sumOfArr(Double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum;
    }

    // 2. Create a method to verify if the input-int-number is prime or not
    public static String primeOrNot(int num) {
        int x = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                x += 1;
            }
        }
        return (x > 0) ? num + " is NOT a Prime" : num + " is a Prime";
    }

    // 3. Create a method to find if given string is palindrome.
    public static boolean isAPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return word.equalsIgnoreCase(reverse);
    }

    // 4. Write a method to print(no return) the duplicate values in a given String array.
    public static void duplicates(String[] array) {
        for (int x = 0; x < array.length; x++) {
            for (int i = x + 1; i < array.length; i++) {
                if (array[x].equalsIgnoreCase(array[i])) {
                    System.out.println("Duplicate: " + array[x]);
                    break;
                }
            }
        }
        System.out.println("== END of List ==");
    }

    // 5. Write a method to print(no return) the common values between two arrays (string arrays)
    public static void duplicatesTwoArr(String[] arr1, String[] arr2) {
        for (String word1 : arr1) {
            for (String word2 : arr2) {
                if (word1.equalsIgnoreCase(word2)) {
                    System.out.println("Duplicate: " + word1);
                    break;
                }
            }
        }
        System.out.println("== END of List ==");
    }
}