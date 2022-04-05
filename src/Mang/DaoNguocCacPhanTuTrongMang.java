package Mang;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số lượng phần tử muốn nhập");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số lượng quá 20");
            }
        }
        while (size > 20);
        int i = 0;
        array= new int[size];
        while (i < array.length) {
            System.out.println("Enter elements " + (i + 1) + "");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
    }
}
