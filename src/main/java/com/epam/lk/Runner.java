package com.epam.lk;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        int n=2, m=3, l=4;

        Matrix p = Matrix.createMatrix(n, m);

        Matrix q = Matrix.createMatrix(m, l);

        System.out.println("First Matrix is: " + p);

        System.out.println("Second Matrix is: " + q);

        Matrix result = Matrix.multiplication(p, q);

        System.out.println("Matrix product is: " + result);
    }
}
