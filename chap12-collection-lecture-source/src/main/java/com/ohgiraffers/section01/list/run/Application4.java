package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Stack
         *  Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
         *  스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
         *  후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다.
         * */

        /*설명. Stack 인스턴스 생성*/
        Stack<Integer> integerStack = new Stack<>();

        /*설명.
        * Stack에 값을 넣을 때는 push() 메서드를 사용한다.
        * 물론, List 인터페이스를 구현한 Vector에 add()메서드가 존재하긴 하지만,
        * Stack이라는 자료구조를 100%활용하려면 push()를 사용하는 것을 권장한다.
        * */
        integerStack.push(11);
        integerStack.push(22);
        integerStack.push(33);
        integerStack.push(44);
        integerStack.push(55);

        /*설명. toString()이 오버라이딩 되어 있음.*/
        System.out.println("integerStack = " + integerStack);

        /*설명.
        * 스택에서 요소를 찾을 때 search() 메서드를 사용할 수 있다.
        * 인덱스가 아닌, 가장 위에서부터 찾았을 때의 순번을 출력해준다.
        * 이 때, 인덱스 개념이 아니기 때문에 가장 최상단에 있는 요소를 1부터 시작한다.
        * (찾고자 하는 요소가 없을 경우 -1을 반환)
        * */
        System.out.println("integerStack.search(3) = " + integerStack.search(3));   //-1
        System.out.println("integerStack.search(3) = " + integerStack.search(33));  //3

        /*설명.
        * Stack에서 요소를 꺼내는 메서드는 크게 2가지로 볼 수 있다.
        * - pop() : 해당 스택의 가장 상단에 있는 요소를 반환한 후 제거.
        * - peek() : 해당 스택의 가장 상단에 있는 요소를 반환만 함. 통에 담겨져 있는 걸 맨 위에서 쳐다만 보는 느낌.
        * */
        System.out.println("integerStack.peek() = " + integerStack.peek()); //peek는 제일 위에 있는 애를 반환해서 출력만 할 뿐 빼내지는 않음.
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);

        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());

        /*설명. 스택에 요소가 없어 비어있는 경우, pop()을 호출하면 EmptyStackException예외가 발생할 수 있다.*/
//        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);
    }
}
