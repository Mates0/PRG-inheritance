package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Load extends Parameters{

    public Load(double height, double length, double radius, double a, double b, double c) {
        super(height, length, radius, a, b, c);
    }

    public void load() throws IOException {
        ArrayList<String> array = new ArrayList<>();
        Load load = new Load(0,0,0,0,0,0);
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String content = "";
        String nextline = br.readLine();
        while (nextline != null) {
            array.add(nextline);
            content += nextline;
            nextline = br.readLine();
        }
        System.out.println(array);
        br.close();
    }
}
