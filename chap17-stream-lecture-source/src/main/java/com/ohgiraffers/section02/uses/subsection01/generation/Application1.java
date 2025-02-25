package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다.*/

        /*설명. 배열 -> 스트림 생성*/
        String[] sArr = new String[] {"java", "mysql", "jdbc"};

        Stream<String> strStream1 = Arrays.stream(sArr);
//        strStream1.forEach(s -> System.out.println(s)); //s에 각각 java, mysql, jdbc가 들어온다.
        strStream1.forEach(System.out::println);    //경고 줄 통해 lambda method선택
        //한 번 사용된 스트림은 다시 사용할 수 없기 때문에 윗 줄 주석.

        System.out.println("==========  ==========");
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 2);
        strStream2.forEach(System.out::println);

        /*설명. 컬렉션 -> 스트림 생성*/
        System.out.println("==========  ==========");
        List<String> strList = Arrays.asList("java", "mysql", "jdbc");

        Stream<String> strStream3 = strList.stream();
        strStream3.forEach(System.out::println);

        //위에 코드 2줄을 1줄로 축약
        strList.stream().forEach(System.out::println);

        //컬렉션일 경우 stream()생략 가능
        strList.forEach(System.out::println);

        /* 설명.
         *  Builder를 활용한 스트림 생성
         *  builder는 static<T>로 되어있는 메소드이며, 호출 시 타입파라미터를 아래와 같이 전달한다.
         * */
        System.out.println("==========  ==========");
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();

        builderStream.forEach(System.out::println);

        /* 설명. 반복자를 만들어주는 iterator()를 활용하여 수열 형태의 스트림을 생성할 수 있다. */
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2)
                .limit(10);
        intStream.forEach(value -> System.out.print(value + " "));
    }
}
