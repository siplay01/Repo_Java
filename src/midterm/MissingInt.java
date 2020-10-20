package midterm;

import java.util.Arrays;

public class MissingInt {

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
}
