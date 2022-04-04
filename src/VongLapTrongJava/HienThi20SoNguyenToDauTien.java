package VongLapTrongJava;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int number, count = 0, N = 2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố mà bạn muốn in ra");
        number=sc.nextInt();

        while (count < number){
            if(isPrime(N)){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int n){
        boolean check =true;
        if(n<2){
            check = false;
        } else {
            int i =2;
            while (i<=Math.sqrt(n)){
                if(n%i==0){
                    check=false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
