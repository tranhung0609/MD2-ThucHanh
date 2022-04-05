package Mang;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập chiều dài phần tử");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhập quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Mảng vừa nhập: ");
        for (int k : array) {
            System.out.println(k + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max + " ở vị trí " + index);
    }
}
