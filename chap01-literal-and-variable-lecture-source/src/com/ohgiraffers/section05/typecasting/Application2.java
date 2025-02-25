package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 필기.
         *  강제형변환
         *  바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
         *  예) (바꿀자료형) 값; //int inum = (int) lnum; //명시적 형변환:틀린거 아는데 바꿀거다.
         * */

        /* 필기.
         *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
         *  1. 강제 형변환 규칙
         *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
         *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
         *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         * */

        /* 목차. 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
        long lnum = 8; //손해보는걸 감수해도 int로 바꾸고 싶다
//        int inum = lnum; //에러뜨는 이유는 8비트짜리를 4비트에 넣으려고 해서.
        int inum = (int) lnum; // 데이터 손실 가능성을 인지한 뒤, 직접 강제 형변환해줘야 한다.
        short snum = (short)inum;
        byte bnum = (byte) snum;
        System.out.println("bnum = " + bnum);
//        byte의 범위는 -128~127인데 128을 넣고 싶을때는 8적힌곳에 128 넣어보자.

        double dnum = 8.0;
        float fnum = (float) dnum;

        /*목차. 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
        float fnum2 = 4.0f; //동일한 범위 내에서 같은 변수명 사용못하니까 fnum2로 붙여줌
        long lnum2 = (long) fnum2;
        System.out.println("lnum2 = " + lnum2);
        int inum2 = (int) fnum2;
        System.out.println("inum2 = " + inum2);

        /* 목차. 1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.*/
        //char를 byte나 short로
        char ch1 = 'a'; //int로 변하는 것은 같은 2바이트이므로 자동형변환이다
        byte bnum2 = (byte) ch1;
        System.out.println("bnum2 = " + bnum2);

        /* 같은 2byte인데 강제형변환을 해야하는 이유: 부호 비트(sign bit)로 인해 값의 범위가 다르기 때문. */
        short snum2 = (short) ch1;
        System.out.println("snum2 = " + snum2);

        /* 설명. 추가적으로 정수를 char 자료형에 강제 형변환해서 대입하기 테스트 */
        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2;            //음수도 강제 형변환 하면 대입할 수 있다.

        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);

        /* 목차. 1-4. 논리형은 강제 형변환 규칙에서도 제외된다. */
        /* 필기. 강제 형변환을 해도 전부 에러난다. */
        boolean isTrue = true;
//      byte b = (byte) isTrue;
//      short s = (short) isTrue;
//      int i = (int) isTrue;
//      float f = (float) isTrue;
//      double d = (double) isTrue;
//      char c = (char) isTrue;

    }
}
