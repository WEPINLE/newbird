package chapter3;

import java.util.Scanner;

public class chapter3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        cramer(a, b, c, d, e, f);
    }

    public static void cramer(double a, double b, double c, double d, double e, double f) {
        if (a * d - b * c == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / (a * d - b * f);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " y is " + y);
        }
    }
}
