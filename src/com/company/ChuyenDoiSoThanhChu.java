package com.company;

import java.util.Scanner;

//public class ChuyenDoiSoThanhChu {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number 1 - 999:");
//        int number = sc.nextInt();
//
//        int hangTram = number / 100;
//        int hangChuc = number / 10;
//        int hangDonVi = number % 10;
//
//        if (number < 0 || number > 999) {
//            System.out.println("Nhap sai");
//        } else if (number == 0) {
//            System.out.println("không");
//        } else if (number < 20) {
//            String word = donVi(number);
//            System.out.println(word);
//        } else {
//            String word;
//            if (hangTram == 0) {
//                word = hangChuc(hangChuc) + "" + donVi(hangDonVi);
//
//            }
//        }
//    }
//}
public class ChuyenDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1 - 999:");
        int number = scanner.nextInt();

        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDonVi = number % 10;

        if (number < 0 || number > 999) {
            System.out.println("Nhập quá số quy định");
        } else if (number == 0) {
            System.out.println("Không");
        } else if (number < 20) {
            String word = donVi(number);
            System.out.println(word);
        } else {
            String word;
            if (hangTram == 0) {
                word = hangChuc(hangChuc) + " " + donVi(hangDonVi);
            } else if (hangChuc == 1) {
                word = donVi(hangTram) + " trăm " + donVi(number % 100);
            } else {
                word = donVi(hangTram) + " trăm " + hangChuc(hangChuc) + " " + donVi(hangDonVi);
            }
            System.out.println(word);
        }
    }

    public static String hangChuc(int number) {
        String hangChucWord = "";
        switch (number) {
            case 2:
                hangChucWord = "hai mươi";
                break;
            case 3:
                hangChucWord = "ba mươi";
                break;
            case 4:
                hangChucWord = "bốn mươi";
                break;
            case 5:
                hangChucWord = "năm mươi";
                break;
            case 6:
                hangChucWord = "sáu mươi";
                break;
            case 7:
                hangChucWord = "bảy mươi";
                break;
            case 8:
                hangChucWord = "tám mươi";
                break;
            case 9:
                hangChucWord = "chín mươi";
                break;
        }
        return hangChucWord;
    }

    public static String donVi(int number) {
        String donViWord = "";
        switch (number) {
            case 1:
                donViWord = "một";
                break;
            case 2:
                donViWord = "hai";
                break;
            case 3:
                donViWord = "ba";
                break;
            case 4:
                donViWord = "bốn";
                break;
            case 5:
                donViWord = "năm";
                break;
            case 6:
                donViWord = "sáu";
                break;
            case 7:
                donViWord = "bảy";
                break;
            case 8:
                donViWord = "tám";
                break;
            case 9:
                donViWord = "chín";
                break;
            case 10:
                donViWord = "mười";
                break;
            case 11:
                donViWord = "mười một";
                break;
            case 12:
                donViWord = "mười hai";
                break;
            case 13:
                donViWord = "mười ba";
                break;
            case 14:
                donViWord = "mười bốn";
                break;
            case 15:
                donViWord = "mười năm";
                break;
            case 16:
                donViWord = "mười sáu";
                break;
            case 17:
                donViWord = "mười bảy";
                break;
            case 18:
                donViWord = "mười tám";
                break;
            case 19:
                donViWord = "mười chín";
                break;
        }
        return donViWord;
    }
}
