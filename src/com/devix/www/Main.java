package com.devix.www;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        try {
            System.out.println(method(10.0, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(main.method(10));
        } catch (Exception e) {
            System.out.println("Exceptopm occoure: " + e);
        }
    }


    double method(int i) throws Exception {
        return i / 0;
    }

    boolean method(boolean b) {
        return !b;
    }

    double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }
}
