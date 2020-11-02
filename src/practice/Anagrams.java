package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {

        String[] aArr = a.toLowerCase().split("");
        String[] bArr = b.toLowerCase().split("");
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        return Arrays.equals(aArr,bArr);
    }
}
