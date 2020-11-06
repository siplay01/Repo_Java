package homework;

import java.util.*;

public class Homework_10 {

    public static void main(String[] args) {
        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */

        System.out.println(
                "===========================\n" +
                "    -= Assignment 1 =-\n" +
                "===========================");
        List<String> words = Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy");

        wordCount(words).forEach((key, value) -> System.out.println(key + " - " + value));

        /**
         * Question 2:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         */

        System.out.println(
                "===========================\n" +
                "    -= Assignment 2 =-\n" +
                "===========================");

        sameValueKeys(userInput());
    }

    public static Map<String, Integer> wordCount(List<String> stringList) {

        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Integer> returnMap = new HashMap<>();

        for (String word : stringList) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (String s : wordCount.keySet()) {
            if (wordCount.get(s) >= 2) {
                returnMap.put(s, wordCount.get(s));
            }
        }
        return returnMap;
    }

    public static void sameValueKeys(Map<Integer, String> intStrMap) {

        int[] keyArr = setToIntArr(intStrMap.keySet());
        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < keyArr.length; i++) {
            String temp = intStrMap.get(keyArr[i]).toLowerCase();
            String str = "";
            Set<Integer> keys = new HashSet<>();
            if (!duplicates.contains(temp)){
                for (int y = i + 1; y < keyArr.length; y++) {
                    if (temp.equalsIgnoreCase(intStrMap.get(keyArr[y]))) {
                        duplicates.add(temp);
                        str = temp;
                        keys.add(keyArr[i]);
                        keys.add(keyArr[y]);
                    }
                }
            }
            if (!str.equals("")) {
                System.out.println("'" + str + "' with keys -> " + keys);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("All keys have different values");
        }
    }

    public static int[] setToIntArr(Set<Integer> set) {

        int[] array = new int[set.size()];
        int k = 0;
        for (int key : set) {
            array[k++] = key;
        }
        return array;
    }

    public static int inputValidation() {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next();
            }
            number = sc.nextInt();
            if (number<=0) {
                System.out.println("Please enter a positive number!");
            }
        } while (number <= 0);
        return number;
    }

    public static Map<Integer, String> userInput() {

        Map<Integer, String> intStrMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of HashMap:");
        int length = inputValidation();

        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + (i + 1) + " Key number: ");
            int key = inputValidation();
            System.out.println("Enter a Value for Key number: " + key);
            String val = scanner.nextLine();
            intStrMap.put(key, val);
        }
        return intStrMap;
    }
}