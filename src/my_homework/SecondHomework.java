package my_homework;

import java.text.DecimalFormat;
import java.util.Random;

public class SecondHomework {
    public static void main(String[] args) {

        Random random=new Random();

        double fahrenheit = (random.nextInt(482)-32);
        double kelvin = (random.nextInt(646)-273);
        double celsius = (random.nextInt(100)-50);

        DecimalFormat myFormatter = new DecimalFormat(".00");

        // 1. Fahrenheit to Celsius
        double fahrToCel = (fahrenheit - 32) * 5 / 9;
        String outputDecFormat1 = myFormatter.format(fahrToCel);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + outputDecFormat1 + " degrees Celsius");


        // 2. Fahrenheit to Kelvin
        double fahrToKel = (fahrenheit - 32) * 5 / 9 + 273.15;
        String outputDecFormat2 = myFormatter.format(fahrToKel);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+ outputDecFormat2 + " Kelvins");


        // 3. Kelvin to Celsius
        double kelToCel = kelvin - 273.15;
        String outputDecFormat3 = myFormatter.format(kelToCel);
        System.out.println(kelvin + " Kelvins is equal to " + outputDecFormat3 + " degrees Celsius");


        // 4. Kelvin to Fahrenheit
        double kelToFahr = (kelvin - 273.15) * 9 / 5 + 32;
        String outputDecFormat4 = myFormatter.format(kelToFahr);
        System.out.println(kelvin + " Kelvins is equal to " + outputDecFormat4 + " degrees Fahrenheit");


        // 5. Celsius to Fahrenheit
        double celToFahr = (celsius * 9 / 5) + 32;
        String outputDecFormat5 = myFormatter.format(celToFahr);
        System.out.println(celsius + " degrees Celsius is equal to " + outputDecFormat5 + " degrees Fahrenheit");


        // 6. Celsius to Kelvin
        double celToKel = celsius + 273.15;
        String outputDecFormat6 = myFormatter.format(celToKel);
        System.out.println(celsius + " degrees Celsius is equal to " + outputDecFormat6 + " Kelvins");

    }
}
