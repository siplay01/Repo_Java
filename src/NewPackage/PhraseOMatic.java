package NewPackage;
public class PhraseOMatic {
        public static void main (String[] args) {

            String[] wordListOne = {"24/7","multi-Tier","30,000","B-to-B","win-win","front-end","web-based"};
            String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed"};
            String[] wordListThree = {"process","tipping-point","solution","architecture","core competency"};

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

            System.out.println("What we need is a " + phrase);
        }

}
