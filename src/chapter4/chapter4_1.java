//编写程序，提示用户输人从五边形中心到顶点的距离，计算五边形的面积

package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.PI;

public class chapter4_1 {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center to a vertex: ");
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println("The area of the pentagon is " + new DecimalFormat("00.00").format(calArea(d)));
    }

    public static double calArea(double r) {
        double s = 2 * r * (Math.sin(PI / 5));
        double area = (5 * s * s) / (4 * (Math.tan(PI / 5)));
        return area;
    }
}
