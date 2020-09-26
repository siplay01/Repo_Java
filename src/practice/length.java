package practice;

public class length {

    public static void main(String[] args) {

        String[] listOfStr = {"Hello World!", "Good luck!", "Excuse me", "Thank you!", "I appreciate it", "Sounds great"};
        int lengthOfList = listOfStr.length;
        int random = (int) (Math.random() * lengthOfList);
        String randomStr = listOfStr[random];
        int lengthOfStr = randomStr.length();

        System.out.println("Length of '" + randomStr + "' is " + lengthOfStr + " characters");
    }
}
