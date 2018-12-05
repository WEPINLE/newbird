package chapter2;

import java.util.Scanner;

public class chapter2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(calSum(i));
    }

    public static int calSum(int i) {
        int sum = 0;
        while (i!=0){
            sum += i%10;
            i/=10;
        }return sum;
    }
}
