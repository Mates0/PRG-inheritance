package com.company;

import java.util.Scanner;

public class Rectangle extends Parameters{
    public Rectangle(double height, double length, double radius, double a, double b, double c) {
        super(height, length, radius, a, b, c);
    }

    public void getParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte délku obdélníku");
        length = sc.nextInt();
        System.out.println("Zvolte výšku obdélníku");
        height = sc.nextInt();
    }

    public double calculateObvod() {
        return (2 * length + 2 * height);
    }

    public double calculateObsah() {
        return (length * height);
    }
}
