package homework;

import java.text.DecimalFormat;

public class Homework_1 {

    public static void main(String[] args) {
        /**
         Store below scenario value in an appropriate dataType variable, and print the same in console.
         1. number of hours in a day (byte)
         2. max no. of days in an year
         3. total number of employees in an organization
         4. population in a country
         5. interest rate
         6. balance in a bank account
         7. does the sun rise from the west? Store answer
         8. initials of your name (^Use: char) Hello World ---- HW  --- need 2 char variable
         9. Your full name
         */

        DecimalFormat myFormatter = new DecimalFormat("###,###,###");

        // 1. number of hours in a day
        byte noOfHours = 24;
        System.out.println("There are " + noOfHours + " hours in a day.");

        // 2. number of days in a year
        short daysNonLeap = 365;
        short daysLeap = 366;
        System.out.println("There are " + daysNonLeap + " days in a leap year and " + daysLeap + " days in a non-leap year.");

        // 3. total number of employees in an organisation
        int totalEmployees;
        totalEmployees = (int) (Math.random() * daysNonLeap);
        System.out.print("Today our company as big as " + totalEmployees + " employees");

        // 4. population in a country
        long countryPopulation = 329877505L;
        String outputDecFormat = myFormatter.format(countryPopulation);
        System.out.println(" and The United States population is " + outputDecFormat + " people.");

        // 5. interest rate
        float interestRate = 3.070f;
        System.out.println("The best interest Rate is " + interestRate + "%");

        // 6. balance in a bank account
        double accBalance = 225.13;
        System.out.println("Your account balance: $" + accBalance);

        // 7. does the sun rise from the west? Store answer
        boolean isSunRiseInWest = false;
        System.out.println("This is " + isSunRiseInWest + " that the sun rises from the west.");

        // 8. initials of your name
        char firstNameInit = 'D';
        char lastNameInit = 'T';
        System.out.println("My initials are " + firstNameInit + lastNameInit);

        // 9. Your full name
        String firstName = "Donald";
        String lastName = "Trump";
        String fullName = firstName + " " + lastName;
        System.out.println("My full name is " + fullName);

    }
}
