package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 얕은복사를 확용하여 매개변수와 리턴값으로 활용할 수 있다. */
        /* 필기.
         *  얕은 복사의 활용
         *  얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
         *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
         * */

        String[] names = {"홍길동", "유관순", "이순신"};     //레퍼런스 변수 names가 {}를 가리킴
        System.out.println("names.hashCode() = " + names.hashCode());

        /*설명.
        * 매개변수로 배열을 받아들이는 메서드가 있다고 했을 때,
        * 해당 메서드는 새로운 배열을 만든는 것이 아니라, 자신을 호출할 때 전달받은 주소값만으로
        * 연산을 실행하는데, 이 때 얕은 복사가 발생한다.
        * 즉, names가 원본 배열인 것이고, printArray()를 호출할 때 메서드가 받은 sArr은
        * 메서드 내에서만 존재하는 지역 변수이고, 메서드가 종료되면 사라진다.
        * 그러나 원본배열인 names는 사라지지 않는다.
        * */
        printArray(names);

        /*설명. 반환값으로 배열을 받을 때에도 얕은 복사가 일어난다는 것을 hashcode를 출력해 확인할 수 있다.*/
        String[] mainAnimals = getAnimals();        //getAnimals로 호출해서 mainAnimals로 받음
        System.out.println("mainAnimals.hashCode() = " + mainAnimals.hashCode());
        printArray(mainAnimals);
    }

    public static void printArray(String[] sArr) {

        System.out.println("1. sArr의 hashCode = " + sArr.hashCode());

        System.out.println("2. sArr의 모든 요소들의 값 = ");
        for(int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        System.out.println("getAnimals() 안에서 생성된 지역 레퍼런스 변수 animals의 hashcode = " + animals.hashCode());

        return animals;
    }
}
