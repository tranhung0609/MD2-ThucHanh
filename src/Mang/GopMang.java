package Mang;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 6};
        int[] array2 = {5, 4, 5, 5};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        System.out.printf("Mảng sau khi gộp: "+ "\n");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
