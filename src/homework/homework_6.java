package homework;

public class homework_6 {
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
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ave = sum / arr.length;
        return ave;
    }

    // 2. Create a method (NO return) that will print the index of given name in the given array
    public static void indexOfName(String[] strArr, String name) {
        int indexOfName = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (name.equalsIgnoreCase(strArr[i])) {
                indexOfName += i;
            }
        }
        if (indexOfName == 0) {
            System.out.println("not in the list: Error -1");
        } else {
            System.out.println("Index of the given name in the array is: " + indexOfName);
        }
    }
}
