package homework;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework_11 {

    public static void main(String[] args) {

        /**
         * Question 1:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
        String[] array = {"green", "blue", "red", "yellow", "grey", "green", "red",
                "grey", "green", "red", "yellow", "yellow", "grey", "blue", "yellow",
                "grey", "green", "blue", "yellow", "grey", "green", "blue", "green",
                "green", "green", "green", "yellow", "grey", "yellow", "grey", "yellow",
                "grey", "yellow", "grey"};
        maxCount(array);

        /**
         * Question 2:
         * Create a method that will take an int as input.
         * return the timeline (houram/pm) with interval of 2 hour from the current hour.
         */
        // System.out.println(generateTimline(5));
        // 10pm 12am 2am 4am 6am

        // System.out.println(generateTimline(8)); // executing method at 9am
        // 11am 1pm 3pm 5pm 7pm 9pm 11pm 1am
        System.out.println(generateTimeline(5));
    }

    public static void maxCount(String[] array) {

        Map<String, Integer> tempMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (tempMap.get(array[i]) == null) {
                for (int y = i + 1; y < array.length; y++) {
                    if (array[i].equalsIgnoreCase(array[y])) {
                        if (tempMap.get(array[i]) == null) {
                            tempMap.put(array[i], 2);
                        } else {
                            tempMap.put(array[i], tempMap.get(array[i]) + 1);
                        }
                    }
                }
            }
        }

        int maxVal = 0;
        for (String s : tempMap.keySet()) {
            for (String z : tempMap.keySet()) {
                if (!s.equalsIgnoreCase(z)) {
                    if (tempMap.get(s) >= maxVal) {
                        maxVal = tempMap.get(s);
                    } else if (maxVal < tempMap.get(z)) {
                        maxVal = tempMap.get(z);
                    }
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> element : tempMap.entrySet()) {
            if (element.getValue() == maxVal) {
                result.add(element.getKey());
            }
        }
        System.out.println(result);
    }

    public static List<String> generateTimeline(int num) {

        List<String> timeList = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("ha");

        for(int i = 0; i < num; ++i) {
            cal.add(Calendar.HOUR, 2);
            Date date = cal.getTime();
            timeList.add(format.format(date));
        }
        return timeList;
    }
}
