package com.ohgiraffers.section07.kindsofvariable;

public class kindsOfVariable {

    /*수업목표. 다양한 변수들을 이해하고 사용할 수 있다.*/

    /*필기. 클래스 영역에 작성하는 변수  를 필드(field)라고 한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) ==전역변수(클래스 전역에서 사용가능한 변수라는 의미)
    * */

    /*필기. non-static field*/
    private int globalNum;
    /*static field를 '클래스 변수'라고 부른다.*/
    private static int staticNum;

    //Kinds Of Variable클래스의 메서드
    public void testNethod(int num) {

        /*필기. 메서드 영역에서 작성되는 변수를 '지역변수'라고 부른다.
        * 메서드의 괄호 안에 선언하는 변수를 '매개변수'라고 부른다.
        * 따라서 매개 변수도 일종의 지역변수라고 생각하면 된다.
        * 지역변수와 매개변수 모두 메서드 호출시 JVM의 Stack영역 중 일부를 할당받아 생성된다.
        * */
        int localNum;

        //매개변수는 이미 메서드 호출 시 리터럴 값이 넘어오기 때문에 초기화를 할 필요가 없다.
        System.out.println(num);
        //지역변수는 선언 후 사용(호출)하기 위해서는 반드시 초기화 해줘야 한다.
//        System.out.println(localNum);     //초기화를 안해줘서 컴파일 에러 당함.

        //인스턴스 변수 또는 클래스 변수는 전역(global)이기 때문에 클래스 내 다른 메서드 어느 부분에서라도 참조 가능하다.
        System.out.println(globalNum);
        System.out.println(staticNum);
    }

    public void testMethod2() {

        //지역변수는 본인이 선언된 메서드 블럭 내에서만 유효한 생명주기를 갖기 때문에 외부에서 참조할 수 없다.
//        System.out.println(localNum);

        //그러나 여전히 전역 변수들은 클래스 내부 어떤 메서드에서도 참조 가능하다.
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}
