package homework;

public class Homework_6 {
    public static void main(String[] args) {

        // case 1
        int[] testArr = {22, 11, 33, 44, 55};
        System.out.println("Average of the given array is: " + arrayAvg(testArr));

        /// case 2
        String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"};
        String nameToSearch = "philip";
        indexOfName(names, nameToSearch);
    }

    // 1. Create a method to find average of an int-array
    public static int arrayAvg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    // 2. Create a method (NO return) that will print the index of given name in the given array
    public static void indexOfName(String[] strArr, String name) {
        int indexOfName = -1;
        for (int i = 0; i < strArr.length; i++) {
            if (name.equalsIgnoreCase(strArr[i])) {
                indexOfName = i;
            }
        }
        System.out.println("Index of the given name in the array is: " + indexOfName);
    }
}