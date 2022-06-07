package org.example;

public class Main {
    public static void main(String[] args) {
        int p = 0;
        while (p < 10) {
            System.out.println(p);
            p++;
            if (p == 8) {
                continue;
            }
    int [] grades ={12,24,24};
            System.out.println(grades[1]);
            String [] names ={"tito", "kajela","to-the-world"};
            names[2] = "muchoki";
            System.out.println(names[1]);
        }
    }
}