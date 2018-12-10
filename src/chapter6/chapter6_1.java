package chapter6;

public class chapter6_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int num = getPentagonalNumber(i);
            if (i%10==0){
                System.out.println();
            }else {
                System.out.print(num+" ");
            }
        }

    }

    public static int getPentagonalNumber(int n) {
        int m = n * (3 * n - 1) / 2;
        return m;
    }
}
