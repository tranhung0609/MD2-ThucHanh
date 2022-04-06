package Mang;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 87, 9, 2, 3};
        int index = giaTriNhoNhat(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int giaTriNhoNhat(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = 1;
                break;
            }
        }
        return index;
    }
}