package chapter3;

import java.util.Scanner;

public class chapter3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        detRoots(a,b,c);
    }

    public static void detRoots(double a, double b, double c) {
        double r1, r2;
        if (b * b - 4 * a * c > 0) {
            r1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2;
            r2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / 2;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (b * b - 4 * a * c == 0) {
            r1 = -b / 2 * a;
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }

    }


}
