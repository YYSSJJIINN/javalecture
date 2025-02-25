package com.ohgiraffers.section03.copy;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  배열의 복사에는 크게 두 가지 종류가 있다.
         *  1. 얕은복사(shallow copy) : stack의 주소값만 복사
         *  2. 깊은복사(deep copy) : heap의 배열에 저장된 값을 복사
         * */

        /* 설명. 먼저 얕은 복사에 대해 알아보자 */
        /* 필기.
         *  얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
         *  따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
         *  하나의 레퍼런스변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게 되면
         *  다른 레퍼런스변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.
         * */

        /*설명. 원본 배열 생성*/
        int[] originArr = {1, 2, 3, 4, 5};

        /*설명. originArr에 저장된 배열의 주소를 copyArr에 그대로 저장*/
        int[] copyArr = originArr;

        System.out.println("originArr.hashCode() = " + originArr.hashCode());
        System.out.println("copyArr.hashCode() = " + copyArr.hashCode());

        for(int i = 0; i < originArr.length; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
        
        copyArr[2] = 33;

        System.out.println("copyArr[2] = " + copyArr[2]);
        System.out.println("originArr[2] = " + originArr[2]);
    }
}
