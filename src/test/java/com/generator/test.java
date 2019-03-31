package com.generator;

import java.util.Random;

/**
 * Created by dongyl on 2/13/17.
 */
public class test {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a=" + a);//a=100
        System.out.println("b=" + b);//b=200
        Random r = new Random();
        int xx = r.nextInt();
        Long xxx = r.nextLong();
        System.out.println(xx+"..."+xxx);
    }

    static void method(int a, int b) {
        a = a * a;
        b = a+a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
//        PrintStream printStream = new PrintStream(System.out) {
//            @Override
//            public void println(String x) {
//                if ("a=10".equals(x)) {
//                    x = "a=100";
//                } else if ("b=20".equals(x)) {
//                    x = "b=200";
//                }
//                super.println(x);
//            }
//        };
//        System.setOut(printStream);
    }
}
