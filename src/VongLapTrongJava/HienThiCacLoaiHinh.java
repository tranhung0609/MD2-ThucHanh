package VongLapTrongJava;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("In hình tam giác vuông");
            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}