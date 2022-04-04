package com.company;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        double usd = sc.nextDouble();
        double giaVN = usd * vnd;

        System.out.println("Giá tiền VND: " + giaVN);
    }
}
