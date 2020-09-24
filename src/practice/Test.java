package practice;
import java.util.Scanner;
public class Test {
   public static void main(String[] args) {

       int x = 1;
       int y = 1;

       boolean num = (x == y);

       System.out.println(num);

       char z = 'z';
       char z2 = 'z';
       char t1 = '1';

       boolean letter = (z == z2);

       System.out.println(letter);

       String word1 = "hello";
       String word2 = "hello";

       boolean word = (word1 == word2);

       System.out.println(word);

       boolean test1 = (t1 == x);
       System.out.println(test1);

       int num1 = 5;
       num1++;
       System.out.println(num1);


       String s1 = "Hello";              // String literal
       String s2 = "Hello";              // String literal
       String s3 = s1;                   // same reference
       String s4 = new String("Hello");  // String object
       String s5 = new String("Hello");  // String object
//       Here  s1 == s2 == s3 but s4 != s5
//
//       Where as
//
//       anyOfAbove.equals(anyOtherOfAbove); //true

   }
}