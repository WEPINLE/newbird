package chapter6;

import java.util.Scanner;

public class chapter6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(long n) {
        int m = 0;
        while (n != 0) {
            m += n % 10;
            n /= 10;
        }
        return m;
    }
}
