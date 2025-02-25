package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /* 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다. */
        int inum = 10;
        long lnum = 100;

        /* 자바에서는 같은 자료형끼리만 연산이 가능하다.
         * 따라서 서로 자료형이 다른 두 자료를 연산할 때 자료형이 같아지도록 형변환을 해 주어야 한다.
         * */

        /* 방법1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴받는다. */
//        int isum = inum + lnum;		//그냥은 안된다. 두 자료형의 연산 결과는 큰 쪽 자료형인 long이 되고, long형 값은 int형 변수에 담길 수 없다.
        int isum = (int) (inum + lnum);

        System.out.println("isum : " + isum);

        /* 방법2. long 형 값을 int로 강제 형변환 한다. */
        int isum2 = inum + (int) lnum;

        System.out.println("isum2 : " + isum2);

        /* 방법3. 결과 값을 long형 자료형으로 받는다(자동 형변환 이용) */
        long lsum = inum + lnum;

        System.out.println("lsum : " + lsum);

        int inum5 = 25;
        long lnum5 = 325;

        int result5 = inum5 + (int)lnum5;
        System.out.println("result5 = " + result5);

        int inum6 = 24;
        long lnum6 = 478;

        long result6 = inum6 + lnum6;
        System.out.println("result6 = " + result6);

        short snum7 = 65;
        long lnum7 = 78;

        long result7 = snum7 + lnum7;
        System.out.println("result7 = " + result7);

        byte bnum8 = 35;
        int unum8 = 50;

        byte result8 = (byte) (bnum8 + unum8);
        System.out.println("result8 = " + result8);
        
        char ch9 = 'a';
        int inum9 = 89;
        
        int result9 = inum9 + (int) ch9;
        System.out.println("result9 = " + result9);


        int inum10 = -97;
        char ch11 = (char) inum10;
        System.out.println("ch11 = " + ch11);

        char ch12 = 'C';
        int inum12 = (int) ch12;
        System.out.println("inum12 = " + inum12);

        byte num1 = 127;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 overflow= " + num1);

        int inum34 = 128;
        System.out.println("inum34 = " + inum34);

        inum34++;
        System.out.println("inum34 overflow= " + inum34);

        short snum35 = 32767;
        System.out.println("snum35 = " + snum35);

        snum35++;
        System.out.println("snum35  overflow = " + snum35);

        short snum36 = -32768;
        System.out.println("snum36 = " + snum36);

        snum36--;
        System.out.println("snum36 underflow = " + snum36);
    }
}
