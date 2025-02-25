package com.ohgiraffers.section06.singleton;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */
        /* 필기.
         *  singleton pattern 이란
         *  애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
         *  하나의 인스턴스를 공유해서 사용하며 메모리 낭비를 방지할 수 있게 함 (매번 인스턴스 생성 하지 않음)
         *  장점
         *  1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
         *     두 번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다.
         *  2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
         *  단점
         *  1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
         *     (유지보수와 테스트에 문제점이 있음)
         *  2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
         *  */

        /* 필기.
         *  싱글톤 구현 방법
         *  1. 이른 초기화 (Eager Initialization)        //미리미리 해둔
         *  2. 게으른 초기화 (Lazy Initialization)        //시켰을 때 하는
         * */

        /*목차. 1. 이른 초기화 구현*/
        //생성자를 사용하여 인스턴스를 생성할 수 없고, getInstance()메서드를 호출해야만 이미 만들어진 인스턴스를 생성할 수 있다.
//        EagerSingleton eager = new EagerSingleton();

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        //두 인스턴스의 hashcode가 동일한 것을 확인 가능 : 동일한 인스턴스다.
        System.out.println("eager1.hashCode() = " + eager1.hashCode());
        System.out.println("eager2.hashCode() = " + eager2.hashCode());

        /*목차. 2. 게으른 초기화 구현*/
        //이른 초기화와 마찬가지로 접근 제어자 때문에 외부에서 생성자를 호출하는 방식으로 인스턴스 생성 불가.
//        LazySingleton lazy = new LazySingleton();

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode());
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode());

        /*필기.
        * 이른 초기화를 사용하면 클래스를 로드하는 속도가 느려지지만,
        * 처음 인스턴스를 반환해달라는 요청에서 속도가 비교적 빠르다는 장점을 가진다.
        * 반면, 게으른 초기화는 클래식을 로드하는 속도는 빠르지만,
        * 인스턴스를 반환해댈라는 첫 번째 요청에 대해 처리하는 속도가 두번째 요청보다 느리다는 특징을 가지고 있다.
        * ===================================================
        * 동시성을 고려한 다양한 싱글턴 패턴 구현 방직은 많지만,
        * 이는 난이도가 매우 높고 신입 레벨에서 설계할 내용이 아니기 때문에
        * 개념적으로는 이 정도만 다루고 넘어가도록 한다.
        * */
    }
}
