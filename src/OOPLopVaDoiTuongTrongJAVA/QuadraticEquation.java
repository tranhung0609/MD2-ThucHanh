package OOPLopVaDoiTuongTrongJAVA;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
//    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
         return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation= new QuadraticEquation(1,2,-8);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println(" Phương trình có 2 nghiệm" + "\n"+ "X1 là: " + quadraticEquation.getRoot1() +"\n"+"và X2: " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println(-quadraticEquation.getB()/(2*quadraticEquation.getA()));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
