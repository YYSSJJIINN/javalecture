package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. Scanner의 next()와 nextLine()에 대해 구분해서 사용할 수 있다.*/

        /*필기. nextLine() vs. next()
        * nextLine() : 공백을 포함한 한 줄 입력을 위한 개행문자(엔터) 전까지 읽어서 문자열로 반환(공백문자 포함 O)
        * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환(공백문자 포함X)
        * */

        /* 목차. 1. Scanner 객체 생성*/
        Scanner sc = new Scanner(System.in);

        /* 목차. 2. 문자열 입력 받기*/
        /* 목차. 2-1. nextLine() */
        System.out.print("인사말을 입력해주세요 : ");

        String greeting1 = sc.nextLine();                    //"안녕하세요, 반갑습니다." 입력
        System.out.println("greeting1 = " + greeting1);      //"안녕하세요, 반갑습니다." 출력


        /* 목차. 2-2. next() */
        System.out.print("인사말을 입력해주세요 : ");

        String greeting2 = sc.next();                       //"안녕하세요, 반갑습니다." 입력
        System.out.println("greeting2 = " + greeting2);     //"안녕하세요," 출력
    }
}
