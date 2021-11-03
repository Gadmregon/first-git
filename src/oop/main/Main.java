package oop.main;

import oop.main.practic1.Vector;

import java.util.Scanner;

import static oop.main.practic1.Vector.mas;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Vector[] vs = Vector.mas(n);
        input.close();
        System.out.println(vs[0].toString());
        System.out.println(vs[1].toString());
        System.out.println(vs[0].sumV());
        System.out.println(vs[1].sumV());
        System.out.println(vs[0].sSum(vs[1]));
        System.out.println(vs[0].cos(vs[1]));
        System.out.println(vs[0].add(vs[1]));
        System.out.println(vs[0].subtract(vs[1]));
        System.out.println(vs[0].crossProduct(vs[1]));
    }
}
