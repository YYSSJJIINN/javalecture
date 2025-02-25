package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. Stream에 대해 이해하고 사용할 수 있다.*/

        /* 필기.
         *  스트림(Stream)은 자바 8 부터 추가된 기능으로, 컬렉션에 저장된 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 기능이다.
         *  자바 8 이전에 배열 또는 컬렉션 다루는 방법은 `for`, `foreach` 를 사용하여 엘리먼트들을 꺼내서 다루는 방법이었다.
         *  스트림을 이용하면 배열 또는 컬렉션을 함수 여러 개를 사용해서 결과를 쉽게 얻을 수 있다.
         *  람다식과 함께 사용할 수 있으며 컬렉션에 들어있는 데이터에 대한 처리를 간결하게 표현할 수 있다.
         *  또한, 스트림을 사용하면 람다식을 활용해 코드 양도 줄이고 간결하게 표현도 가능하다.
         *  스트림은 내부 반복자를 사용하기 때문에 병렬처리가 쉽다는 장점이 있다.
         * */

        /*설명. Array.asList() : 매개변수로 전달된 요소들을 List로 변환*/
        List<String> strList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));
        //("hello", "world", "stream")를 Arrays.asList로 변환시켜줘

        /*설명. Stream이 존재하지 않을 때 : for문 또는 foreach문 사용*/
        System.out.println("========== foreach ==========");
        for(String str : strList) {
            System.out.println("str = " + str);
        }

        /*설명. Stream을 이용한 방식
        * 1. 배열 또는 컬렉션으로스트림 생성.
        * 2. 가공
        * 3. 결과(최종 연산 수행)
        * */
        System.out.println("========== stream ==========");
        //1단계 : 풀소유 - 축약하지 않으 상태
//         strList.stream();  //컬렉션에 선언되어 있는 stream은 .stream();을 붙여주는것으로 끝난다.
//        strList.stream().forEach(); //터미널 해주기 위해 .forEach()를 붙여줌.
        strList.stream().forEach((str) -> {
            System.out.println("str = " + str);
        });

        //2단계 : 람다 표현식 축약
        strList.stream().forEach((str) -> System.out.println("str = " + str));

        //3단계 : 스트림을 생성한 소스가 컬렉션일 경우, stream() 메서드 생략 가능
        strList.forEach(str -> System.out.println("str = " + str));

        //4단계 : 메서드 참조 표현식으로 수정
        strList.forEach(System.out::println);
    }
}
