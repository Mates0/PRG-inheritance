package com.company;

import java.util.Scanner;

public class Square extends Parameters{
    public Square(double height, double length, double radius, double a, double b, double c) {
        super(height, length, radius, a, b, c);
    }

    public void getParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte délku strany čtverce");
        length = sc.nextInt();
    }

    public double calculateObvod() {
        return (4 * length);
    }

    public double calculateObsah() {
        return (length * length);
    }
}
