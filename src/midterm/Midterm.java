package midterm;

import java.util.Arrays;

public class Midterm {

    /**
     * Question 1:
     * Create a method to return an int-array after removing a given int-value
     * from a given int array.
     */
    public int[] removeInt(int[] array, int remove) {

        int[] temp = new int[array.length];
        int count = 0;
        int duplicates = 0;

        for (int j : array) {
            if (j != remove) {
                temp[count] = j;
                count++;
            } else duplicates++;
        }
        int[] result = new int[temp.length-duplicates];
        for (int i = 0; i < temp.length-duplicates; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     */
    public int missingSmallestPositiveInt(int[] array) {

        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] temp = new int[max];
        int result = 0;


        for (int i = 1; i < max; i++) {
            int count = 0;
            for (int j : array) {
                if (j != i) {
                    count++;
                    temp[i - 1] = count;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == array.length) {
                result = i+1;
                break;
            }
        }
        return result;
    }

    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     */

    public void trafficTicketingSystem(int speed) {

        int points;
        int speedLimit = 70;

        if (speed <= 70) {
            System.out.println("Thank you for driving within the speed limit.");
        } else {
            points = (speed - speedLimit)/5;
            System.out.println("Driver got " + points + " point(s)");
            if (points > 12) {
                System.out.println("License suspended!");
            }
        }
    }
}