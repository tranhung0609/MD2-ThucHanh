package Mang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int sL = sc.nextInt();
        int[] arr = new int[sL];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử mà bạn muốn tìm: ");
        int viTriPhanTu = sc.nextInt();

        boolean phanTuCanTim = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==(viTriPhanTu)) {
                System.out.println(" Phần tử bạn cần tìm có trong danh sách " + viTriPhanTu + " ở: " + i);
                phanTuCanTim = true;
                break;
            }
        }
        if (!phanTuCanTim){
            System.out.println(" Không tìm thấy ");
        }
    }
}
