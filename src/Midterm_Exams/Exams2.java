package Midterm_Exams;

import java.util.Scanner;

public class Exams2 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("Enter r: ");
        double r = sc.nextDouble();

        double a = PI * r * r;
        System.out.println("พื้นที่ฐาน: " + a);

        double c = 2 * PI * r;
        System.out.println("ความสูง: " + c);

        double v = (4 / 3) * PI * r * r * r;
        System.out.println("ปริมาตรทรงกระบอก: " + v);

    }
}
