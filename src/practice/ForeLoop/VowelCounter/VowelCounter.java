package practice.ForeLoop.VowelCounter;

public class VowelCounter {

    public int countVowels1(String s) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] temp = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : temp) {
            for (char value : vowels)
                if (value == c) count++;
        }
        return count;
    }

    public int countVowels2(String s) {

        char[] temp = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : temp) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        return count;
    }

    public int countVowels3(String s) {

        char[] temp = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : temp) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }

    public int countVowels4(String s) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char vowel : vowels) {
                if (s.toLowerCase().charAt(i) == vowel) count++;
            }
        }
        return count;
    }
}