package chapter3;

import java.util.Scanner;

public class chapter3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String figure = input.next();

        int count = 9;
        int sum = 0;
        int amount = Integer.parseInt(figure);
        while (amount != 0 && count != 0) {
            int number = amount % 10;
            sum = sum + count * number;
            count--;
        }
        int d10 = sum % 11;
        String output = "The ISBN is " + figure;
        if (d10 != 10) {
            output = output + d10;
        } else {
            output = output + 'X';
        }
        System.out.println(output);
    }

}
