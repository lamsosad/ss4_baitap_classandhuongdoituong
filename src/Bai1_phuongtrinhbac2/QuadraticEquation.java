package Bai1_phuongtrinhbac2;

public class QuadraticEquation {
    double a, b, c;

    public  QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);

    }

    public double getRoot1() {
        return -this.b + Math.sqrt(getDiscriminant()) / 2 * this.a;
    }

    public double getRoot2() {
        return -this.b - Math.sqrt(getDiscriminant()) / 2 * this.a;
    }

    public String display() {
        return "Phuong trinh co dang: " + a + "x2 + " + b + "x + " + c + " = 0";
    }

}
