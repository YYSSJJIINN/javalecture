package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* 필기.
         *  배열의 사용 방법
         *  1. 배열의 선언
         *  2. 배열의 할당
         *  3. 배열의 인덱스 공간에 값 대입
         * */

        /* 목차. 1. 배열의 선언 */
        /* 필기.
         *  자료형[] 변수명;
         *  자료형 변수명[]; 로 선언할 수 있다.
         * */

        /*필기. 배열의 선언은 Stack 영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다..*/
        int[] iarr;
        char carr[];

//        iarr = new int[];     //배열 할당 시, 크기를 지정해주지 않으면 에러가 발생됨(메모리에 얼만큼 여유 공간을확보 해야하는지 모름)
        iarr = new int[5];       //int타입 5개 공간 -> 4byte * 5 = 20byte의 여유공간을 예약해둠
        carr = new char[10];

        /*필기.
        * 선언한 레퍼런스 변수(iarr 및 carr)에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 Heap 영역에 공간을 할당하고, 그 공간의 주소값을 반환하는 연산자다.
        * 이 때 발생한 주소를 레퍼런스 변수(iarr 및 carr)에 저장하고 이것을 참조해서 값을 찾아가기 때문에
        * 참조 자료형(reference type) 혹은 유도 자료형이라고 부르는 것이다.*/

        /*필기. Heap 메모리는 이름으로 접근하는 것이 아닌, 주소값으로 접근하는 영역이다.
        * Stack에 저장된 주소로 Heap 영역에 할당된 배열을 찾아갈 수 있다.
        * -> 자료형@주소값(16진법)
        * */
        System.out.println("iarr = " + iarr);       //iarr = [I@23fc625e
        System.out.println("carr = " + carr);       //carr = [C@4f023edb

        /* 필기.
         *  hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한(=중복이 안된다) 정수값을 반환한다.
         *  동일객체(일란성)인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체(이란성)를 동일객체 취급하기 위한 용도로 overrding 해서 사용한다.
         * */
        /* 설명. 이 부분은 뒤에서 다루게 되니, 그 전까지는 쉽게 주소값이라고 생각하고 사용하면 된다. */
        /* 필기. hashCode() 메소드 호출 및 그 반환값 -> 주소값비스무리한거(10진수) */
        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        System.out.println("carr.hashCode() = " + carr.hashCode());

        /*필기. 배열의 길이를 알 수 있는 기능을 필드(field)로 제공하고 있다.
        * 필드(field)라는 용어 또한 뒤에서 다루게 될 것이다. (일종의 변수라고 이해하고 넘어가자)
        * 참고로 String의 문자열 길이는 length()라는 메서드를 호출할 수 있었다.
        * 배열 -> .length;
        * 문자열 ->.length();
        * */
        System.out.println("iarr.length = " + iarr.length);     //배열의 길이
        System.out.println("carr.length = " + carr.length);     //배열의 길이

        /*설명. Scanner를 통해 입력받은 정수로 배열의 길이를 지정하고 배열을 할당해보자.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력해주세요 :");
        int length = sc.nextInt();

        double[] darr = new double[length];

        System.out.println("darr의 주소 = " + darr.hashCode());
        System.out.println("darrd의 길이 = " + darr.length);

        /*설명. 한 번 지정된 배열의 길이는 원칙적으로 변경할 수 없다.
        * 따라서 아래 코드는 실제로 배열의 길이를 변경한 것이 아니고,
        * 길이가 30인 새로운 배열의 생성해서 그 주소값을 다시 darr에 덮어쓴 것이다.*/
        darr = new double[30];

        System.out.println("길이 수정 후 darr의 주소 = " + darr.hashCode());
        System.out.println("길이 수정 후 길이 = " + darr.length);

        /*설명. 한 번 할당된 배열은 지울 수 없다.
        * 다만, 레퍼런스 변수를 null로 변경하여 더 이상 주소를 참조할 수 없게 된 배열은
        * 일정 시간이 지난 후 Heap의 old 영역으로 이동하여 GC(가비지 컬렉터)가 소멸시킨다.
        * 한 번 찾아갈 수 있는 주소값을 잃어버린 darr변수는 다시 참조할 수 없다.
        * 이 때 발생하는 런타임 예외를 NullPointerException(null값 참조 예외)라고 부르며 줄여서 NPE라고도 한다.
        * 이는 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때, 참조연산자(.)를 사용하게 되면 발생하는 예외다.
        * */
        darr = null;

        System.out.println("가리킬 주소가 없는 darr의 주소 = " + darr.hashCode());     //NPE 발생
        System.out.println("가리킬 주소가 없는 darrdml 길이 = " + darr.length);        //NPE 발생
    }
}
