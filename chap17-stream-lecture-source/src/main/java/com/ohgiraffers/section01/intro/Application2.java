package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. Stream의 병렬처리에 대해 이해할 수 있다.*/

        List<String> subjects = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css", "javascript"));

        /*설명. 스트림을 사용하지 않은 경우 : 모든 작업(task)은 main 스레드가 처리한다. */
        System.out.println("========== foreach ==========");
        for(String s : subjects) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }
        for(String s : subjects) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        /*설명. 일반적인 스트림을 사용해도 main스레드만 작업을 처리한다.*/
        System.out.println("========== normal stream ==========");
//        subjects.forEach(str -> System.out.println(str + " : " + Thread.currentThread().getName()));
//        subjects.forEach(str -> System.out.println(str + " : " + Thread.currentThread().getName()));
        subjects.forEach(Application2::myPrint);
        subjects.forEach(Application2::myPrint);

        /*설명. 병렬 스트림을 생성해 작업을 수행하면 main 스레드 외 다른 스레드도 작업을 수행한다.(성능상 유리함)*/
        System.out.println("========== paralle stream 병렬 스트림 ==========");
        subjects.parallelStream().forEach(Application2::myPrint);
        subjects.parallelStream().forEach(Application2::myPrint);
    }

    private static void myPrint(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
