package homework;

public class Homework_3 {

        public static void main(String[] args) {

        // 1.  Store your full name in a variable, and display the following:

            // 1.1  Display length of the first name.
            String fullName = "Dwayne Johnson";
            String[] nameArr = fullName.split(" ");
            String firstName = nameArr[0];
            String lastName = nameArr[1];

            System.out.println("Full name: " + fullName);
            System.out.println("Length of the first name " + firstName + " is " + firstName.length() + " characters.");

            // 1.2 Does your last name starts with "K" (Ignoring cases)
            String letterK = "K";
            String firstLetLName = lastName.substring(0,1);
            boolean isKFirst = letterK.equalsIgnoreCase(firstLetLName);
            System.out.println("Last name " + lastName + " starts with '" + letterK + "' is " + isKFirst);

            // 1.3  Print the last letter of the first name
            int lenFName = firstName.length();
            char lastLetFName = firstName.charAt(lenFName-1);
            System.out.println("The letter '" + lastLetFName + "'" + " is the last letter of the first name " + firstName);

            // 1.4  Does your last name ends with "M" (Ignoring cases)
            String letterM = "M";
            String lastLetLName = lastName.substring(lastName.length()-1);
            boolean isMLast = letterM.equalsIgnoreCase(lastLetLName);
            System.out.println("Last name " + lastName + " ends with '" + letterM + "' is " + isMLast);

        // 2. String myStatement = "I am a good programmer";
        // Use string methods to do following tasks:

            // 2.1 Display the total number of words in the myStatement.
            String myStatement = "I am a good programmer";
            String[] myStArr = myStatement.split(" ");
            int numWords = myStArr.length;

            System.out.println("In the statement '" + myStatement + "' - " + numWords + " words.");

            // 2.2 Replace all the 'r' characters with 'f' characters.
            System.out.println("All 'r' replaced by 'f' - " + myStatement.replaceAll("r", "f"));

        // 3. Store a first name in a string variable.
            // 3.1 Calculate the length of the first name, without using length() method of String class.
            String myFirstName = "Kevin";
            int nameLength = myFirstName.indexOf('n')+1;
            System.out.println("Length of the name " + myFirstName + " is " + nameLength);

        // 4. String strNew = "hello dear, how are you?";
            // * Assign result (boolean) as true if length of strNew if greater than 10
            // * Else assign false.
            // * Print the result value.
            String strNew = "hello dear, how are you?";
            boolean isLenGreater10 = strNew.length() > 10;
            System.out.println("length of " + strNew + " greater than 10 is " + isLenGreater10);

        // 5. String threeWordsSentence =  "hApPY nEW yeAr";
            // * sout(threeWordsSentence);  // hApPY nEW yeAr
            // * // code
            // * sout(threeWordsSentence);  // Happy New Year
            String threeWordsSentence =  "hApPY nEW yeAr";

            System.out.println(threeWordsSentence);

            threeWordsSentence = threeWordsSentence.toLowerCase();
            String[] sentenceArr = threeWordsSentence.split(" ");
            String toCapital1 = sentenceArr[0].toUpperCase().charAt(0) + sentenceArr[0].substring(1,sentenceArr[0].length());
            String toCapital2 = sentenceArr[1].toUpperCase().charAt(0) + sentenceArr[1].substring(1,sentenceArr[1].length());
            String toCapital3 = sentenceArr[2].toUpperCase().charAt(0) + sentenceArr[2].substring(1,sentenceArr[2].length());
            threeWordsSentence = toCapital1 + " " + toCapital2 + " " + toCapital3;

            System.out.println(threeWordsSentence);

        // 6. Create abbreviation: String threeWordsSent = "Lab sessIONS clAsses";
            // * code
            // * LSC
            String threeWordsSent = "Lab sessIONS clAsses";
            String[] threeWSArr = threeWordsSent.split(" ");
            String[] arr1ToArr = threeWSArr[0].split("");
            String[] arr2ToArr = threeWSArr[1].split("");
            String[] arr3ToArr = threeWSArr[2].split("");
            arr1ToArr[0] = arr1ToArr[0].toUpperCase();
            arr2ToArr[0] = arr2ToArr[0].toUpperCase();
            arr3ToArr[0] = arr3ToArr[0].toUpperCase();
            String abbreviation = arr1ToArr[0] + arr2ToArr[0] + arr3ToArr[0];
            System.out.println("Abbreviation for sentence '" + threeWordsSent + "' is - " + abbreviation);
        }
}
