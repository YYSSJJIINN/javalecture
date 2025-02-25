package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체 배열에 대해 이해할 수 있다. */
        /* 필기.
         *  객체배열은 레퍼런스변수에 대한 배열이다.
         *  생성한 인스턴스도 배열을 이용해서 관리하면
         *  동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
         *  또한 반환값은 1개의 값만 반환할 수 있기 때문에
         *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
         * */

        /*설명. 자동차 5대를 나타내는 인스턴스를 생성한 후, 모든 인스턴스가 최고 속도로 달리게 메서드를 호출한다.*/
        Car car1 = new Car("페라리", 340);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 430);
        Car car5 = new Car("포터", 140);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        /*설명.
        * 동일한 타입의 인스턴스를 여러개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용 가능하다.
        * Car 타입의 인스턴스 주소를 보관할 5칸 짜리 배열을 할당한다.
        * */
        Car[] cars = new Car[5];

        cars[0] = new Car("페라리", 340);
        cars[1] = new Car("람보르기니", 350);
        cars[2] = new Car("롤스로이스", 250);
        cars[3] = new Car("부가티베이론", 430);
        cars[4] = new Car("포터", 140);

        for(int i = 0; i <cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        //향상된 for문
        //int[] Arr = new Arr {1, 2, 3, 4, 5}
        Car[] cars2 = {
                new Car("페라리", 340),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 250),
                new Car("부가티베이론", 430),
                new Car("포터", 140)
        };

        /*
        * for(낱개타입 변수명 : 세트) {
        *     변수명.xxxx
        * }
        * */
        for(Car c : cars2) {
            c.driveMaxSpeed();
        }
    }
}
