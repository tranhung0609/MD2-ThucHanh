package xulyngoaile.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException ex = new IllegalTriangleException();
        try {
            ex.calculate();
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra ngoại lệ: nhập sai dữ liệu");
        }
    }

    private void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh x");
        int x = sc.nextInt();
        System.out.println("Nhập vào cạnh y");
        int y = sc.nextInt();
        System.out.println("Nhập vào cạnh z");
        int z = sc.nextInt();

        if (x < 0 || y < 0 || z < 0)
            throw new InputMismatchException();
        cal(x, y, z);
    }

    private void cal(int x, int y, int z) {
        try {
            if (x + y <= z || y + z <= x || x + z <= y)
                throw new InputMismatchException();
            } catch(InputMismatchException e){
                System.out.println("Xảy ra lỗi điều kiện của tam giác");
            }
        }
    }
