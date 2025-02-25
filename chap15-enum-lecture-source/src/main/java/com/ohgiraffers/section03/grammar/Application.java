package com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

    public static void main(String[] args) {

        /*수업목표. Enum의 문법에 대해 이해하고 사용할 수 있다.*/

        UserRole1 admin = UserRole1. ADMIN;

        System.out.println("admin = " + admin);
        System.out.println("admin.nameToLowerCase() = " + admin.nameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal() + "#" + consumer.name() + " " + consumer.getDesc());

        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println(consumer == consumer2);  //싱글턴으로 관리되기 때문에 동일 비교시 true.

        System.out.println("다 가져오기=================================================================");

        /*설명. EnumSet을 활용해 여러 열거형 타입들을 Set으로 취급할 수 있다.*/
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();

//            System.out.println(iter.next());
//            System.out.println(iter.next().ordinal());
//            System.out.println(iter.next().name());
//            System.out.println(iter.next().getDesc());

        while(iter.hasNext()) {
            UserRole2 someRole = iter.next();

            System.out.println(someRole);
            System.out.println(someRole.ordinal());
            System.out.println(someRole.name());
            System.out.println(someRole.getDesc());
        }

        System.out.println("내가 선택 한 것만 가져오기================================================================");

        /*설명. 특정 상수만 골라서 Set에 추가할 수 있다.*/
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = users.iterator();

        while(userIter.hasNext()) {
            UserRole2 someRole = userIter.next();

            System.out.println(someRole);
            System.out.println(someRole.ordinal());
            System.out.println(someRole.name());
            System.out.println(someRole.getDesc());
        }

        System.out.println("내가 선택한 것 외에 다른 것들을 가져오기=================================================");

        /*설명. 특정 상수만 제외하여 Set에 추가할 수 있다.*/
        EnumSet<UserRole2> noGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST)); //내가 선택한 게스트 빼고 나머지를 보수
        Iterator<UserRole2> noGuestIter = noGuest.iterator();

        while(noGuestIter.hasNext()) {
            UserRole2 someRole = noGuestIter.next();

            System.out.println(someRole);
            System.out.println(someRole.ordinal());
            System.out.println(someRole.name());
            System.out.println(someRole.getDesc());
        }
    }
}
