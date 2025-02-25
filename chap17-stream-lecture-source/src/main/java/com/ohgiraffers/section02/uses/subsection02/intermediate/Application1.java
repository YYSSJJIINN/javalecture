package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 스트림의 중계 연산 중 하나인 filter에 대해 이해하고 사용할 수 있다.*/

        /*필기.
        * Steam<T> filter(Predicate<? super T> prdicate);
        * 필터(filter)는 스트림에서 특졍 요소만 걸러내고자 할 때 자주 메서드다.
        * 매개변수로 Predicate를 받는데, 이는 boolean을 리턴하는 함수형 인터페이스다.
        * */

        IntStream intStream = IntStream.range(0, 10);
        //0~9까지 중에 2로 나눴을때 나머지가 0인(즉, 짝수) 것은 출력값인 0, 2, 4, 6, 8

        intStream.filter(num -> (num % 2) == 0)
                .forEach(num -> System.out.println(num));

        List<String> names = new ArrayList(Arrays.asList("김건우", "김나영", "박성현", "박송이", "양서진"));

        //(괄호)안에 name이라는 매개변수
        names.stream().filter(name -> name.charAt(0) == '박')
                .forEach(n -> System.out.println(n));
    }
}
