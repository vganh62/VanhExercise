package lec4;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        double maCore = sc.nextDouble();
        System.out.print("Enter Physics score: ");
        double phyCore = sc.nextDouble();
        System.out.print("Enter Chemistry score: ");
        double cheCore = sc.nextDouble();
        double averageScore = (maCore + phyCore + cheCore) / 3;
        if (averageScore >= 8) {
            System.out.println("Xuat sac");
        } else if (averageScore < 8 && averageScore >= 6.5) {
            System.out.println("Tot");
        } else if (averageScore < 6.5 && averageScore >= 5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Kem");
        }
    }
}
