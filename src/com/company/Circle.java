package com.company;

import java.util.Scanner;

public class Circle extends Parameters{
    public Circle(double height, double length, double radius, double a, double b, double c) {
        super(height, length, radius, a, b, c);
    }

    public void getParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zvolte poloměr kruhu");
        radius = sc.nextInt();
    }

    public double calculateObvod() {
        return (2 * 3.14 * radius);
    }

    public double calculateObsah() {
        return (3.14 * radius * radius);
    }
}
