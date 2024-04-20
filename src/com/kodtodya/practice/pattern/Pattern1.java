package com.kodtodya.practice.pattern;

public class Pattern1 {

    // Expected output:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {

//        int lineNo = 0;
//        while(lineNo < PATTERN_SIZE) {
//
//            int index = 0;
//            while(index <= lineNo) {
//                System.out.print("*[line:"+ lineNo +",index:"+index+"]\t");
//                index++;
//            }
//            System.out.println();
//            lineNo++;
//        }
        int lineNo = -1;
        while(++lineNo < PATTERN_SIZE) {
            int index = -1;
            while(++index <= lineNo) {
                //System.out.print("*[line:"+ lineNo +",index:"+index+"]\t");
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
