package chapter2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class chapter2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radiu of a cylinder: ");
        double r = scanner.nextDouble();
        System.out.println("Then enter the length of the cylinder: ");
        double h = scanner.nextDouble();
        double area = r * r * PI;
        double volume = area * h;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}
