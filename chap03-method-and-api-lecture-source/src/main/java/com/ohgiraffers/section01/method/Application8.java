package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* 수업목표. static 메서드를 호출할 수 있다.*/

        /* 설명. static 메서드
        *  우리가 지금까지 다룬 main() 메서드를 보면 public과 void 키워드 사이에
        * static이라고 하는 키워드를 확인할 수 있다.
        * static 키워드에 대해서는 뒤 챕터에서 더욱 자세하게 다시 다룰 예정이지만,
        * static 메서드를 호출하는 방법부터 먼저 연습해보자.
        * static이 선언된 메서드이건, 그렇지 않은 non-static 메서드이건 메서드의 동작 흐름은 동일하다
        * 즉, 호출만 조금 다르다.
        * =======================================================================
        * static 메서드를 호출하는 방법:
        * 클래스명.메서드명();      // 이렇게 호출한다.
        * */

        int result = Application8.addTwoNumbers(10, 20);
        System.out.println(result);

        /* 필기. 동일한 클래스 내에 작성된 static 메서드는 클래스명을 생략할 수 있다. */
        int result2 = addTwoNumbers(30, 20);
        System.out.println(result2);
    }

    public static int addTwoNumbers(int first,int second) {
        return first + second;
    }
}
