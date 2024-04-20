package com.kodtodya.practice.pattern;

public class Pattern2 {

    // Expected output:
    // * * * * *  -> line#0
    // * * * *    -> line#1
    // * * *      -> line#2
    // * *        -> line#3
    // *          -> line#4
    private static final int PATTERN_SIZE = 10;

    public static void main(String[] args) {

        int lineNo = 0;
        while (lineNo < PATTERN_SIZE) {
            int index = PATTERN_SIZE - lineNo;
            while (index > 0) {
                System.out.print("*\t");
                index--;
            }

//            int index = 0;
//            while (index < PATTERN_SIZE - lineNo) {
//                System.out.print("*\t");
//                index++;
//            }

            System.out.println();
            lineNo++;
        }
    }
}
