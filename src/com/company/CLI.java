package com.company;

import java.io.IOException;
import java.util.Scanner;

public class CLI{
    public void start() throws IOException {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(0,0,0,0,0,0);
        Square square = new Square(0,0,0,0,0,0);
        Circle circle = new Circle(0,0,0,0,0,0);
        Triangle triangle = new Triangle(0,0,0,0,0,0);
        Load load = new Load(0,0,0,0,0,0);
        System.out.println("Zvolte tvar:");
        System.out.println("1) Obdélník");
        System.out.println("2) Čtverec");
        System.out.println("3) Kruh");
        System.out.println("4) Trojúhelník");
        int input = sc.nextInt();
        if (input == 1) {
            rectangle.getParameters();
            System.out.println("Obsah obdélníku je:" + " " + rectangle.calculateObsah());
            System.out.println("Obvod obdélníku je:" + " " + rectangle.calculateObvod());
        }
        if (input == 2) {
            square.getParameters();
            System.out.println("Obsah čtverce je:" + " " + square.calculateObsah());
            System.out.println("Obvod čtverce je:" + " " + square.calculateObvod());
        }

        if (input == 3) {
            circle.getParameters();
            System.out.println("Obsah kruhu je:" + " " + circle.calculateObsah());
            System.out.println("Obvod čtverce je:" + " " + circle.calculateObvod());
        }
        if (input == 4) {
            triangle.getParameters();
            System.out.println("Obsah trojúhelníku je:" + " " + triangle.calculateObsah());
            System.out.println("Obvod trojúhelníku je:" + " " + triangle.calculateObvod());
        }
        if (input == 5) {
            load.load();
        }
    }
}
