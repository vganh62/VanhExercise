package lec4;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * (a * c);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
        } else {
            System.out.println("Phuong trinh co 2 nghiem kep: ");
            System.out.println("x1 = x2 = " + (-b / (2 * a)));
        }
    }
}
