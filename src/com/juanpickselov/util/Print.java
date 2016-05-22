package com.juanpickselov.util;

import java.io.PrintStream;

public class Print {

    private static final String divider = "------------------------------------------------------------";

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

    public static void PrintDivider(int numLines) {
        if ((int) numLines == numLines) {
            for (int i = 1; i <= numLines; i++)
                System.out.println(divider);
        }
    }
}