package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. */

        /* 필기. 변수 사용 방법:
        *  1. 변수를 준비한다. -> 선언 변수준비=그릇준비
        *  2. 변수에 값을 대입한다. -> 값 대입 & 초기화 값을 대입=그릇에 15cm 서브웨이 샌드위치 담기
        *  3. 변수를 사용한다. -> 참조 or call
        * */

        /* 목차. 1. 변수를 준비한다. */

        // 숫자를 취급하는 자료형
        // 정수 - 4가지
        // 8비트 2의 8승
        byte bnum;      // 1byte (= 8bit) 2의8승 256가지의 경우의 수 음수-128부터 양수127까지
        short snum;     // 2byte (= 16bit)
        int inum;       // 4byte (= 32bit)
        long lnum;      // 8byte (= 64bit)2의32승 약42억

        // 실(부동소수점) - 2가지
        float fnum;     // 4byte 등록 되어있지 않고 떠다닌다
        double dnum;    // 8byte 표현할 수 있는 값의 범위가 훨씬 넘다

        // 문자를 취급하는 자료형
        char ch1;        // 2byte
        char ch2;       // 그릇이 두개가 생긴게 됐음

        // 논리 값을 취급하는 자료형
        boolean isTrue; // 1byte

        /* 필기. 이상, 위에서 본 8개의 자료형을 기본자료형(primary type) 이라고 한다. */

        // 문자열을 취급하는 자료형(참조자료형)
        String str;

        /* 목차. 2. 변수의 값을 (올바르게) 대입한다. */ //그릇 보다 더 음식을 담으라는 뜻이 아님.
                                                        // = 내가 가진 그릇보다 더 큰 데이터를 담으려 하면 기존에 있던 데이터가 손실 될 수도 있다.
        bnum = 1;
        snum = 2;
        inum = 4;
            lnum = 8;       // 아무 문제 없는 것 같아 보이지만, 사실 숫자 뒤에 대문자 'L'을 붙여줘야 한다.
        lnum = 8L;

        fnum = 3.14f;       // 실수 뒤에 f를 붙이지 않으면 Java는 그 실수를 float가 아닌 double 형으로 간주한다.
        dnum = 3.14;

        ch1 = 'a';
        ch2 = 97;

        isTrue = true;      // 밑줄 쳐진 이유는 메모리 낭비하지 말라고 훈수 차 뜬 것임.
        isTrue = false;     // boolean 변수에는 한 번에 true 혹은 false 한 가지 값만 대입할 수 있다.

        str = "안녕하세요~";

        /* 필기.
        *  숫자로 된 형태의 값을 그대로 사용하는 자로형은 byte, short, int, double이다.
        *  일반적으로 사용하는 겂을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 '대표 자료형'이라고 하며,
        *  정수형은 int, 실수형은 double이 대표 자료형이다
        *  정수의 경우는 일상 생활속에서 많이 사용되는 숫자의 범위는 byte와 short로 표현할 수 없는 경우가 많다.
        *  따라서 int를 대표자료형으로 여기며, 특수한 경우가 아닌 이상 byte와 short는 잘 사용하지 않는다.
        *  실수의 경우는 '정확도'를 기준으로 4byte 자료형보다 8byte 자료형이 더 정확한 실수를 표현할 수 있기 때문에
        *  double을 대표 자료형으로 사용하고 있고 float는 특수한 목적이 있는 경우에만 사용한다.
        *  (원주율을 3.14 보다 3.141592...로 표현하는 것이 더 정확한 실수인 것과 같은 개념)
        * */

        /* 목차. 3. 변수를 사용한다. */
        /* 목차. 3-1. 변수에 저장한 값 출력하기 */
        /* 설명. 위에서 선언 후 초기화 한 변수들을 출력해보자 */
        System.out.println("========== 변수에 저장된 값 출력 ==========");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        System.out.println("ch1의 값 : " + ch1);
        System.out.println("ch2의 값 : " + ch2);

        System.out.println("isTrue의 값 : " + isTrue);

        System.out.println("str의 값 : " + str);

        /* 목차. 3-2. 변수를 이용해서 연산하기 */
        /* 필기. 변수에 저장된 값을 이용해서 연산을 할 수도 있다. */
        int point = 100;
        int bonus = 20;
        System.out.println("포인트와 보너스의 합은? : " + (point + bonus));

        /* 목차. 3-3. 대입연산자의 왼쪽과 오른쪽 편에 사용하기 */
        /* 필기.
         *  대입연산자(=)의 왼편에는 공간이라는 의미, 오른 편에는 값이라는 의미이다.
         *  따라서 point라는 공간에 point가 가지고 있는 값에 + 100한 값을 대입하라는 의미이다.
         * */
        point = point + 100;

        System.out.println("point = point + 100 ? " + point);

        System.out.println("str = " + str);
        System.out.println("bonus = " + bonus);
        System.out.println("point의 값은? = " + point);
    }
}
