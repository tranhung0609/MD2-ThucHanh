package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Mảng là : ");
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println();
        System.out.println("Nhập phần tử muốn xóa: ");
        input = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (input != arr[i]) {
                System.out.println("Trong mảng không có phần tử muốn xóa");
                break;
            } else {
                while (input == arr[i]) {
                    System.arraycopy(arr, i + 1, arr, i, arr.length - 1 - i);
                    arr[arr.length - 1] = 0;
                }
            }
        }
        System.out.println("Mảng sau khi xóa là: " + Arrays.toString(arr));
    }
}
