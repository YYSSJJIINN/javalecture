package com.ohgiraffers.section01.intenum;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 정수 열거패턴(enum 아님!)과 이의 단점을 이해할 수 있다.*/

        /*목차. 1. 그저 정수 리터럴을 저장하고 있는 필드에 불과하다. */
        int subject1 = Subjects.JAVA;   //정수 0
        int subject2 = Subjects.HTML;   //정수 3

        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다");
        } else {
            System.out.println("두 과목은 다른 과목이다.");
        }

        /*목차. 2. 이름충돌방지를 위해 접두어를 사용해서 구분해야 한다.*/
        /*설명.
        * Subjects를 보면 이미 JAVASCRIPT 과목이 존재한다.
        * 그런데 만약 백엔드와 프론트엔드에서 사용되는 JAVASCREPT를 각각 구별하고 싶다면?
        * 아래와 같이 단지 구별을 위해 접두어를 붙여서 구분해줘야한다.
        * -BACKEND_JAVASCRIPT = 5;
        * -FRONTEND_JAVASCRIPT = 6;
        * */

        /*목차. 3. 문자열로 출력하기 매우 까다롭다.*/
        /*설명.
        * 프로그램을 짜다 보면 경우에 따라서 0, 1과 같은 정수값 대신에 "JAVA", "MYSQL"과 같은 문자열을
        * 상수 값으로 사용해야 하는 경우가 존재한다.
        * 이러한 경우 상수 필드가 많아질수록 문자열로 출력하는 과정이 번거로워진다.
        * */
        int num = 0;
        String subjectToString = "";

        switch(num) {
            case Subjects.JAVA : subjectToString = "JAVA"; break;
            case Subjects.MYSQL : subjectToString = "MYSQL"; break;
            case Subjects.JDBC : subjectToString = "JDBC"; break;
        }

        System.out.println("subjectToString = " + subjectToString);

        /*목차. 4. 같은 그룹에 속한 상수들을 순회(반복문 사용)할 수 없다.*/
        /*설명. 따라서 하나의 클래스에 선언된 전체 상수의 개수 조차도 확인할 수 없다.*/

        /*목차. 5. 타입 안전성을 보장할 수 없다. (정수를 사용하기 때문)*/
        printSubject(Subjects.MYSQL);       //원하는 MYSQL 문자열을 얻을 수 있음.
        printSubject(2);      //MYSQL문자열을 원했으나, 정수만 보면 어떤 문자열이 출력될지 모름.
        printSubject(22);
    }

    public static void printSubject(int subjectNumber) {

        String subject = "";

        switch(subjectNumber) {
            case Subjects.JAVA : subject = "JAVA"; break;
            case Subjects.MYSQL : subject = "MYSQL"; break;
            case Subjects.JDBC : subject = "JDBC"; break;
        }
    }
}
