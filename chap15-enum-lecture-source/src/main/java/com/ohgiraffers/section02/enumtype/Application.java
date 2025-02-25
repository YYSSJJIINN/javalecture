package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 열거형(Enum)을 이용해 상수 열거 패턴의 단점을 해결하는 것을 이해할 수 있다.*/

        /*목차. 1. 열거 타입으로 선언된 인스턴스는 '싱글턴'으로 관리되며 인스턴스가 하나만 생성되는 것을 보장한다.*/
        /*설명.
        * 아래 구문을 출력해보면 "여기1" 이후에 enum 타입의 기본생성자가 6번 호출되는 것을 확인할 수 있는데,
        * 이는 클래스(Subjects)가 로드될 때 한 번에 초기화 된 것이므로 이른 초기화 전략을 사용한 것이다.*/
        System.out.println("========== main() 시작 ==========");
        System.out.println("여기 1");
        Subjects subject1 = Subjects.JAVA;
        System.out.println("여기 2");
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;

        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        if(subject1 == subject3) {
            System.out.println("두 JAVA는같은 JAVA입니다.");   //enum 타입은 싱글턴 인스턴스라서.
        } else {
            System.out.println("두 는 다른 입니다.");
        }
        /*설명. 단일 인스턴스임을 보장하기 때문에 동일비교 ==연산이 가능하다.*/
        System.out.println(subject1 == Subjects.JAVA);

        /*목차. 2. 이름 충돌 방지를 위해서 접두사를 쓰지 않아도 Enum 타입별로 네임스페이스를 가지게 된다.
        * 설명.
        * 동일한 이름의 상수가 필요한 경우, 네임스페이스를 다르게 구성한다.
        * public enum Backend { JAVA, MYSQL, JDBC, JAVASCRIPT}
        * public enum Frantend { HTML, CSS,JAVASCRIPT }
        * */

        /*목차. 3. toString() 메서드를 이용해 문자열 변경하기 매우 용이하다.*/
        /*설명. name() vs. toString()
        * - name() :
        * enum의 이름을 그대로 문자열로 반환함.
        * 상수의 정확한 이름을 얻고자 할 때 사용되며, 오버라이드(재정의)할 수 없는 final 메서드임.
        * -toString() :
        * 곁에서 보기에는 기본적으로 name()과 같은 값을 반환하는 것처럼 보임.
        * 사용자가 필요에 따라 오버라이드(재정의)할 수 있어 반환값을 조작할 수 있음.
        * */
        /*설명. 앞에서 보았던 정수 열거 패턴처럼 귀찮게 switch문을 사용하지 않아도 됨.*/
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.HTML.toString());

        System.out.println(Subjects.JAVA.name());
        System.out.println(Subjects.HTML.name());

        /*목차. 4. values() 메서드를 이용해 상수값 배열을 반환하고 이를 이용해 반복 처리를 할 수 있다.*/
        Subjects[] subjects = Subjects.values();
        System.out.println("subjects = " + subjects);

        for(Subjects s : subjects) {
            System.out.println("s = " + s);
        }

        for(Subjects s : subjects) {
            System.out.println(s.toString());
            System.out.println(s.ordinal());
            System.out.println(s.name());
        }

        /*목차. 5. 타입 안전성을 보장한다.*/
        printSubject(Subjects.HTML);
//        printSubject(3);  //컴파일 에러 : Enum 타입은 인스턴스이기 때문에 기본자료형인 int정수는 사용 못함.
    }

    public static void printSubject(Subjects sub) {
        System.out.println(sub.toString());
    }
}
