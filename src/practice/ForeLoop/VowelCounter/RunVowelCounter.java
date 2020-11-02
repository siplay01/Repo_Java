package practice.ForeLoop.VowelCounter;

public class RunVowelCounter {
    public static void main(String[] args) {

            VowelCounter ct = new VowelCounter();

            String statement = "have a great day ahead";
            System.out.println("Method 1: " + ct.countVowels1(statement));
            System.out.println("Method 2: " + ct.countVowels2(statement));
            System.out.println("Method 3: " + ct.countVowels3(statement));
            System.out.println("Method 4: " + ct.countVowels4(statement));
    }
}
