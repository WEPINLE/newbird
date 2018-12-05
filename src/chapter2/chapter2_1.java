package chapter2;

import java.util.Scanner;

public class chapter2_1 {
    public static void main(String[] args) {
        System.out.print(" Enter a degree in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        System.out.println(c+" Celsius is "+convertToFahrenheit(c)+" Fahrenheit");


    }

    public static double convertToFahrenheit(double c) {
        double h = (9.0 / 5) * c + 32;
        return h;
    }
}
