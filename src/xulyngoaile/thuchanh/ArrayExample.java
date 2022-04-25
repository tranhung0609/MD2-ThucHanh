package xulyngoaile.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i = 0; i < 100; i++) {
            array[i]=rd.nextInt();
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập chỉ số của một phần tử bất kì");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt qua giới hạn của mảng");
        }
    }
}
