package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화되는 자료형별 기본값을 이해할 수 있다. */
        /* 설명.
         *  기본적으로 배열을 선언하고 할당하게 되면
         *  배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
         *  heap영역은 값이 없는 빈 공간이 존재할 수 없다.
         * */

        /* 필기.
         *  값의 형태 별 기본값
         *  정수 : 0
         *  실수 : 0.0
         *  논리 : false
         *  문자 : \u0000
         *  참조 : null
         * */

        int[] iarr = new int[5];        //5칸 할당. 값을 초기화하진 않은 상태

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "]의 값 = " + iarr[i]);      //값을 초기화하지 않아서 우선 다 0인 상태
        }

        /*필기. 배열의 축약형
         * Java에서 지정한 기본값 외의 값으로 직접 배열 내 값을 초기화 하고 싶은 경우, 블록{}을 이용한다.
         * 블록을 사용하는 경우에는 new 연산자를 사용하지 않아도 되며, 값의 개수만큼 자동으로 크기가 설정된다.
         * */
        //배열의 축약형 초기화 : 분리 불가능
        int[] iarr2 = {11, 22, 33, 44, 55};

        //배열의 명시적 초기화 : 분리 가능
        int[] iarr3 = new int[]{111, 222, 333, 444, 555};

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr2[" + i + "]의 값 = " + iarr2[i]);
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr3[" + i + "]의 값 = " + iarr3[i]);
        }

        /* 설명. Java의 배열은 기본자료형 뿐만 아니라 참조자료형도 배열로 만들 수 있다. (모든 데이터 타입 가능) */
        String[] sarr = {"apple", "banna", "grape", "orange"};

        for (int i = 0; i < sarr.length; i++) {      //길이는 4
            System.out.println("sarr[" + i + "]의 값 = " + sarr[i]);
        }
    }
}

