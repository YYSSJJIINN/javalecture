package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다. */

        /* 필기.
         *  java.util.Random 클래스
         *  java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         *  nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환
         * */

        /* 필기.
         *  원하는 범위의 난수를 구하는 공식
         *  random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        Random random = new Random();   //Random 클래시 타입의 객체 random을 생성
                                        //new가 들어가면 100%참조자료형

        /* 목차. 1. 0~9까지의 난수 발생*/
        int random1 = random.nextInt(10);     //반환형 int였음. 반환형을 담을 그릇 필요함. 나중에 추가하는 int random1
        System.out.println("Random 1: " + random1);

        /* 목차. 2. 1 ~ 10까지의 난수 발생 */
        int random2 = random.nextInt(10) + 1;
        System.out.println("Random 2: " + random2);

        /* 목차. 3. 10 ~ 15까지의 난수 발생 */
        int random3 = random.nextInt(6) + 10;
        System.out.println("Random 3: " + random3);

        /* 목차. 4. -128 ~ 127까지의 난수 발생 */
        int random4 = random.nextInt(256) - 128;
        System.out.println("Random 4: " + random4);

        //객체를 생성하자마자 바로 메서드를 호출할 수도 있다.
        int random5 = new Random().nextInt(256) - 128;
        System.out.println("Random 5: " + random5);

        int random6 = new Random().nextInt(0, 9);   //오리진과 바운드 두 숫자 사이에서 랜덤으로
        System.out.println("Random 6: " + random6);

        /* 설명.
        *  클래스의 full-name 말고 클래스명만 작성할 때 import를 해야한다고 배웠다.
        *  하지만 java.util 패키지에 속한 Random 클래스는 import를 해야했고,
        *  java.lang 패키지에 속한 Math 클래스는 import를 사용하지 않아도 사용할 수 있었다.
        *  System, String 또한 지금까지 우리가 계속해서 사용해온 클래스인데, 모두 importm하지 않고 사용할 수 있었던
        *  이유는 System과 String 모두 java.lang패키지에 속했기 때문이다.
        *  Java 개발 시 워낙 자주 사용하는 패키지이다 보니 import 하지 않고 사용할 수 있도록 설계되었다.
        *  컴파일러가 'import java.lang.*;' <- 이 코드를 자동으로 추가해서 컴파일 하기 때문이다.
        * */

    }
}
