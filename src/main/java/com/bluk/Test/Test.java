package com.bluk.Test;

public class Test {

    private int a = 10;
    private int b = 30+10;

    int suma = a + b;
    int roznica = a - b;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Działanie:" + test.a + "+" + test.b +  "=" + test.suma);
        System.out.println("Działanie:" + test.a + "-" + test.b +  "=" +test.roznica);

    }





}
