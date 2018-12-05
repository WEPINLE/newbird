package chapter2;

import java.util.Scanner;

public class chapter2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet " + "is " + 0.305 * feet + " meters");
    }
}
