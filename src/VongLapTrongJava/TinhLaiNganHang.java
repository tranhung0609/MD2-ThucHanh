package VongLapTrongJava;

import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        double money;
        int month;
        double laiNganHang;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số tiền đầu tư");
        money = sc.nextDouble();

        System.out.println("Nhập số tháng gửi");
        month = sc.nextInt();

        System.out.println("Nhập lãi xuất hàng năm theo tỷ lệ phần trăm");
        laiNganHang = sc.nextDouble();

        double TongLaiSuat = 0;
        for (int i = 0; i < month; i++) {
            TongLaiSuat += money * (laiNganHang / 100) / 12 * month;

            System.out.println("Tổng lãi suất: " + TongLaiSuat);
        }
    }
}
