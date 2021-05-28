package com.company;

import java.util.Scanner;

public class Triangle extends Parameters{
    public Triangle(double height, double length, double radius, double a, double b, double c) {
        super(height, length, radius, a, b, c);
    }

    public void getParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte výšku trojúhleníku");
        height = sc.nextInt();
        System.out.println("Zvolte stranu a trojúhleníku");
        a = sc.nextInt();
        System.out.println("Zvolte stranu b trojúhleníku");
        b = sc.nextInt();
        System.out.println("Zvolte stranu c trojúhleníku");
        c = sc.nextInt();
    }

    public double calculateObvod() {
        return (a + b + c);
    }

    public double calculateObsah() {
        return (a * height / 2);
    }
}
