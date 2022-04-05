package Mang;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doF;
        double doC;
        int chon;

        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển từ độ F sang độ C");
            System.out.println("2. Chuyển từ C  độ  sang độ f");
            System.out.println("0. Thoát");
            System.out.println("Nhập số mà bạn muốn chọn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:{
                    System.out.println("Nhập độ F");
                    doF = sc.nextDouble();
                    System.out.println("Độ F sang độ C: " + doFtodoC(doF));
                    break;
            }
                case 2: {
                    System.out.println("Nhập độ C: ");
                    doC = sc.nextDouble();
                    System.out.println("Độ C sang độ F: " + doCtodoF(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
    public static double doCtodoF(double doC) {
        return (9.0 / 5) * doC + 32;
    }
    public static double doFtodoC(double doF){
        return (5.0/9)*(doF-32);
    }
}
