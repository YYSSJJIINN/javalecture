package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체배열(클래스 자료형 배열)을 매개변수와 리턴값으로 사용할 수 있다. */

        /* 설명.
         *  동일한 타입의 여러 개의 인스턴스를 인자로 전달하거나 리턴받는 경우에도
         *  객체 배열을 이용할 수 있다.
         * */

        /* 필기.
         *  시스템 요구사항
         *  1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
         *  2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
         *
         * 필기.
         *  제약사항
         *  1. MemberRepository에 static 필드로 회원 정보들을 관리한다.
         *  2. 회원 정보는 최대 10명까지 저장할 수 있다.
         * */

        //사용자로부터의 입력을 받을 수 있는 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //회원 정보 조회 및 등록이라는 주된 업무를 처리해주는 매니저 인스턴스(회원 관리) 생성
        MemberService memberManager = new MemberService();

        //while문을 사용해 반복되는 프로그램 작성
        while(true) {
            System.out.println("======회원 관리 프로그램======");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");

            System.out.println("원하시는 메뉴의 번호를 선택해 주세요 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1: memberManager.signUpMembers(); break;
                case 2: memberManager.showAllMembers();;break;
                case 9: System.out.println("프로그램을 종료합니다;return");
                default: System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }
    }
}
