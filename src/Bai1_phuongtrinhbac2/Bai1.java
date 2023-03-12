package Bai1_phuongtrinhbac2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        double a = input.nextDouble();
        System.out.print("Nhap vao so b: ");
        double b = input.nextDouble();
        System.out.print("Nhap vao so c: ");
        double c = input.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        System.out.println(pt.display());
        System.out.println("Phuong trinh co nghiem: " +"X1= "+ pt.getRoot1() + " va " +"X2= "+ pt.getRoot2());
    }
}
