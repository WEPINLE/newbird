package chapter3;

import java.util.Scanner;

public class chapter3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int t = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int i = scanner.nextInt();
        int sum = t+i;

        calWeek(t);
        calWeek(sum);
    }

    public static void calWeek(int i){
        switch (i){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
