package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계연산중 하나인 map에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  Stream<R> map(Function<? super T, ? extends R> mapper);
         *  스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
         * */

        IntStream intStream = IntStream.range(1, 10);   //1~10까지의 숫자

        intStream
                .filter(i -> i % 2 == 0)
                .map(i -> i * 5)
                .forEach(result -> System.out.println(result));
        //filter를 통과한건 2, 4, 6, 8, 10인데 출력값에 50이 없으므로 10은 통과하지 못한 것이다.
    }
}
