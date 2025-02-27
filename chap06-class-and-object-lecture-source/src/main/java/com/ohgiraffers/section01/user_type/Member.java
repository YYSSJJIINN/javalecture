package com.ohgiraffers.section01.user_type;

public class Member {

    /* 설명.
     *  지금까지 우리는 클래스 내부에 메소드만 작성 해봤다.
     *  하지만 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수 도 있다.
     *  이것을 전역변수(global<->지역변수)(필드 == 인스턴스변수 == 속성) 라고 부른다.
     * */

    /* 설명.
     *  앞에서 사용했던 홍길동, 20 이런 값들은 한 명 회원을 구성하고 있는 값들이다.
     *  이런 값들의 명칭은 이름, 나이 라고 하는 명사로 표현될 수 있는데 이것을 속성(attribute어트리뷰트)이라고 한다.
     *  어떠한 속성들을 가지고 있는지를 현 위치에 정의를 할 것이다.
     *  정의하는 방법은 간단하다. 변수를 선언하는 것과 동일하다.
     * */

        String id;      //4
        String pwd;     //4
        String name;    //4
        int age;        //4
        char gender;    //2
        String[] hobbies;       //4 []이므로 배열. new가 없으므로 null값이다. = 지금 당장은 배열없음.
}
