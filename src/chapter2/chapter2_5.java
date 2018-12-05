package chapter2;

import java.util.Scanner;

public class chapter2_5 {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal: ");
        Scanner scanner = new Scanner(System.in);
        double subtotal = scanner.nextDouble();
        System.out.println("Enter the  gratuity rate: ");
        double gratuity = scanner.nextDouble();
        System.out.println("The gratuity is $"+subtotal*gratuity/100+" and total is $"+(subtotal*gratuity/100+subtotal));
    }
}
