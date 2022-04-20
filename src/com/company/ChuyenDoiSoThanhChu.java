package com.company;

import java.util.Scanner;

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
            System.out.println("零");
        } else if (number < 20) {
            String word = donVi(number);
            System.out.println(word);
        } else {
            String word;
            if (hangTram == 0) {
                word = hangChuc(hangChuc) + " " + donVi(hangDonVi);
            } else if (hangChuc == 1) {
                word = donVi(hangTram) + "百" + donVi(number % 100);
            } else {
                word = donVi(hangTram) + "百" + hangChuc(hangChuc) + "" + donVi(hangDonVi);
            }
            System.out.println(word);
        }
    }

    public static String hangChuc(int number) {
        String hangChucWord = "";
        switch (number) {
            case 2:
                hangChucWord = "二十　";
                break;
            case 3:
                hangChucWord = "三十";
                break;
            case 4:
                hangChucWord = "四十";
                break;
            case 5:
                hangChucWord = "五十";
                break;
            case 6:
                hangChucWord = "六十";
                break;
            case 7:
                hangChucWord = "七十";
                break;
            case 8:
                hangChucWord = "八十";
                break;
            case 9:
                hangChucWord = "九十";
                break;
        }
        return hangChucWord;
    }

    public static String donVi(int number) {
        String donViWord = "";
        switch (number) {
            case 1:
                donViWord = "一";
                break;
            case 2:
                donViWord = "二";
                break;
            case 3:
                donViWord = "三";
                break;
            case 4:
                donViWord = "四";
                break;
            case 5:
                donViWord = "五";
                break;
            case 6:
                donViWord = "六";
                break;
            case 7:
                donViWord = "七";
                break;
            case 8:
                donViWord = "八";
                break;
            case 9:
                donViWord = "九";
                break;
            case 10:
                donViWord = "十";
                break;
            case 11:
                donViWord = "十一";
                break;
            case 12:
                donViWord = "十二";
                break;
            case 13:
                donViWord = "十三";
                break;
            case 14:
                donViWord = "十四";
                break;
            case 15:
                donViWord = "十五";
                break;
            case 16:
                donViWord = "十六";
                break;
            case 17:
                donViWord = "十七";
                break;
            case 18:
                donViWord = "十八";
                break;
            case 19:
                donViWord = "十九";
                break;
        }
        return donViWord;
    }
}
