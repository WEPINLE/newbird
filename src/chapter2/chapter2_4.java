package chapter2;

import java.util.Scanner;

public class chapter2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds is " + 0.454 * pounds + " kilograms");
    }
}
