package bai_tap_quan_ly_oop.bai_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("Chương trình quản lý cán bộ");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2.Tìm kiếm theo tên");
            System.out.println("3.Hiển thị thông tin");
            System.out.println("4.Thoát khỏi chương trình");
            String line = sc.nextLine();

            switch (line) {
                case "1": {
                    System.out.println("a. Kỹ Sư");
                    System.out.println("b. Công nhân");
                    System.out.println("c. Nhân Viên");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Nhập tên");
                            String ten = sc.nextLine();
                            System.out.println("Nhập tuổi");
                            int tuoi = sc.nextInt();
                            System.out.println("Nhập giới tính");
                            String gioiTinh = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String diaChi = sc.nextLine();
                            System.out.println("Nhập ngành đào tạo ");
                            String nganhDaoTao = sc.nextLine();
                            CanBo kySu = new KySu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
                            System.out.println(kySu.toString());
                            break;
                        }

                        case "b": {
                            System.out.println("Nhập tên");
                            String ten = sc.nextLine();
                            System.out.println("Nhập tuổi");
                            int tuoi = sc.nextInt();
                            System.out.println("Nhập giới tính");
                            String gioiTinh = sc.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String diaChi = sc.nextLine();
                            System.out.println("Nhập cấp bậc ");
                            int capBac = sc.nextInt();
                            CanBo congNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, capBac);
                            System.out.println(congNhan.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Nhập tên");
                            String ten = sc.nextLine();
                            System.out.println("Nhập tuổi");
                            int tuoi = sc.nextInt();
                            System.out.println("Nhập giới tính");
                            String gioiTinh = sc.nextLine();
                            System.out.println("Nhập địa chỉ");
                            String diaChi = sc.nextLine();
                            System.out.println("Nhập công việc ");
                            String congViec = sc.nextLine();
                            CanBo nhanVien = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
                            System.out.println(nhanVien.toString());
                            break;
                        }
                        default:
                            System.out.println("Không hợp lệ");
                            break;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Nhập tên cần tìm kiếm");
                    String ten = sc.nextLine();
                    qlcb.timKiemTheoTen(ten).forEach(canBo -> {
                        System.out.println(canBo.toString());
                    });
                    break;
                }

                case "3": {
                    qlcb.hienThi();
                    break;
                }

                case "4": {
                    return;
                }
                default:
                    System.out.println("Không hợp lệ");
                    continue;
            }
        }
    }
}
