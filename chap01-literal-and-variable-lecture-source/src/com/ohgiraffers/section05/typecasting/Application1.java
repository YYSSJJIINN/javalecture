package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 자동 형변환 규칙에 대해 이해할 수 있다. */

        /* 필기. 데이터 형변환(Data Type-casting):
        *  데이터 형변환이 필요한 이유:
        *  Java에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우에만 실행할 수 있다.
        *  즉, 같은 데이터 타입끼리만 연산을 실행할 수 있다.
        * */

        /* 필기. 형변환의 종류와 규칙:
        *  1. 자동형변환(묵시적 형변환, implicit) : 컴파일러가 자동으로 수행해주는 타입 변환
        *       1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. 손해가 없기 때문에.
        *            반면에 큰거에서 작은거로 바꾸려 할 땐 손해(삭제되는 자료)가 있으니 고려해야할 점이 많다.
        *            ex)10이 10.0으로 변하는건 손해가 없음
        *       1-2. 정수는 실수로 자동 형변환 된다.    정수 뒤에 n.0만 붙이면 실수가 되니까 별로 어렵지않다.
        *       1-3. 문자형은 int형으로 자동 형변환 된다.
        *            ex)a97 에서 A65
        *       1-4. 논리형은 형변환 규칙에서 제외된다. 부울리언
        *  2. 강제형변환(명시적 형변환, explicit) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *     손해 보는거 알아도 형변환이 필요하다고 명시해야함.
        *       2-1. 자동 형변환이 적용되지 않는 경우, 강제 형변환이 필요하다.
        * */

        /* 목차. 1. 자동형변환 규칙 테스트*/
        /* 목차. 1`1.작은 자료형에서 큰 자료형으로는 자동 형변환 된다.*/
        /* 필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우이기 때문에 데이터 손실이 발생하지 않아
        *  컴파일러가 자동으로 처리해준다.
        * */

        /* 필기. 점점 더 큰 자료형으로 데이터를 옮겨도 문제없이 자동형변환 처리된다.*/
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 필기. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산해야 한다. */
        int num1 = 10; //
        long num2 = 20; //

//        int result1 = num1 + num2; //num1은 int라 4바이트고, num2는 long이라 8바이트짜리라서 오류가 뜸
                                    // 자동으로 큰 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result1 = num1 + num2;// int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동 수행한 후 연산한다.
        System.out.println("result1 = " + result1);

        /* 필기. 실수 또한 정수와 마찬가지로 작은 쪽에서 큰 자료형 쪽으로 자동으로 형변환 되어 계산된다. */
        float fnum = 4.0f;
        double dnum = fnum; //dnum에는 현재 4.0f가 아니라 4.0

        double result2 = fnum + dnum;
        System.out.println("result2 = " + result2);

        /* 목차. 1-2. 정수는 실수로 자동 형변환 된다.*/
        /* 설명.
        *  정수를 실수로 변경할 때 소수점 자리수가 없어도 실수 형태로 표현이 가능하다.
        *  이 때 데이터 손실이 발생하지 않기 때문에 자동형변환이 가능하다.
        *  실제 값을 저장하는 매커니즘을 가진 것과 달리, 실수형은 지수부와 가수부를 따로 저으이해서 수를 표현하기 때문에
        *  바이트 크기보다 훨씬 더 많은 값을 표현할 수 있다.
        * */
        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);

        float result3 = eight + four;       // long 타입 변수 eight은 실수와의 연산을 위해 자동으로 float로 변환되어 연산된다.
        System.out.println("result3 = " + result3);

        /* 목차. 1-3. 문자형은 int형으로 자동 형변환 된다. */
        char ch1 = 'a';
        int charNum = ch1;
        System.out.println("charNum = " + charNum); //97

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);         //'A' 작은따옴표는 문자.

        /* 목차. 1-4. 논리형은 형변환 규칙에서 제외된다. */
        /* 필기. 어느 자료형이든 boolean을 형변환 해서 담을 수 없다. */
//        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;
//        long l = isTrue;
//        char c = isTrue;
//        float f = isTrue;
//        double d = isTrue;
    }
}
