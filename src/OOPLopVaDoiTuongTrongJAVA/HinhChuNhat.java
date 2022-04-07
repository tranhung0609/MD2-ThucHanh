package OOPLopVaDoiTuongTrongJAVA;


import java.util.Scanner;

public class HinhChuNhat {
    double wight;
    double height;

    public HinhChuNhat(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public HinhChuNhat() {
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double DienTich(double height, double wight) {
        return (height*wight);
    }
    public  static double ChuVi(double height, double wight){
        return (height+wight)*2;
    }

    public static void main(String[] args) {
        Scanner Hcn= new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập chiều dài");
        double Height= Hcn.nextDouble();
        System.out.println("Nhập chiều rộng");
        double Wight=Hcn.nextDouble();
        System.out.println("Diện tích là");
        System.out.println(HinhChuNhat.DienTich((double) Height, (double) Wight));
        System.out.println("Chu Vi HCN là: ");
        System.out.println(HinhChuNhat.ChuVi((double) Height,(double) Wight));
    }
}

