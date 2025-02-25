package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashMap을 이용할 수 있다. */
        /* 필기.
         *  Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복하지 않게 하나의 null만 저장한다.)
         * */

        /* 필기.
         *  HashSet 클래스
         *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
         *  JDK 1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
         * */

        /*설명. HashSet 인스턴스 생성*/
        HashSet<String> hset = new HashSet<>();
        
        //new 연산자가 없어서
//        hset.add("java");
//        hset.add("mysql");
//        hset.add("jdbc");
//        hset.add("html");
//        hset.add("css");
        
        //new 연산자 사용
        hset.add(new String("java"));
        hset.add(new String("java"));   //중복되어서 set구조에 추가되지 않음
        hset.add(new String("oracle"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        System.out.println("hset = " + hset);
        System.out.println("hset.size() = " + hset.size());
        
        /*설명. contains() : 요소 포함 여부 확인*/
        System.out.println("hset.contains(\"java\") = " + hset.contains("java"));       //true
        System.out.println("hset.contains(\"oracle\") = " + hset.contains("oracle"));   //false
        System.out.println("hset.contain(new String(\"java\")) = " + hset.contains(new String("java")));     //true

        /*설명.
        * Set은 순서라는 개념이 없는 자료구조이기 때문에 반복문을 사용하는 등 저장된 객체를 하나 씩 꺼내는 기능이 없음.
        * 따라서 두 가지 방법으로 이를 해결할 수 있음.
        * */
        /*목차. 1. toArray() 메서드를 사용해 배열로 바꾼 후 for문 사용*/
        Object[] arr = hset.toArray();  //toArray()는 인텔리에서 추천한 오브젝트 배열로 받아줘야함.

        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }

        /*목차. 2. iterator() 메서드로 목록화 하여 while문 사용*/
        Iterator<String> strIter = hset.iterator();

        while(strIter.hasNext()) {  //strIter야, 너 다음꺼 가지고 있니?
            System.out.println(strIter.next());
        }

        /*설명. clear() : 해당 집합의 모든 요소 제거*/
        hset.clear();
        System.out.println("hset.isEmpty() = " + hset.isEmpty());
    }
}
