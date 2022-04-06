package Mang;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int [][] arr = {
                {10,3,52,6},
                {2,43,3,50},
                {3,25,22,1},
                {44,55,66,77}
        };
        int max = arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if( max<arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("gia tri lon nhat mang 2 chieu nay la: "+max);
    }
}
