package com.epam.lk;

public class Matrix {
    int a[][];

    public Matrix(int n, int m) {
        a = new int[n][m];
    }

    public int getColumnSize() {
        return a.length;
    }

    public int getRowSize() {
        return a[0].length;
    }

    public int getElement(int i, int j) {
        return a[i][j];
    }

    private void setElement(int i, int j, int value) {
        a[i][j] = value;
    }

    public static Matrix createMatrix(int n, int m) {
        Matrix matrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix.setElement(i, j, (int) (Math.random() * m * m));
            }
        }
        return matrix;
    }


    public static Matrix multiplication(Matrix p, Matrix q) {
        int v = p.getColumnSize();
        int h = q.getRowSize();
        int temp = p.getRowSize();
        Matrix result = new Matrix(v, h);
        for (int i = 0; i < v; i++)
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < temp; k++) {
                    value += p.getElement(i, k) * q.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        return result;
    }


    public String toString() {
        String s = "\nMatrix : " + a.length +
                "x" + a[0].length + "\n";
        for (int[] vector : a) {
            for (int value : vector)
                s += value + " ";
            s += "\n";
        }
        return s;

    }
}



