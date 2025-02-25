package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Queue
         *  Queue는 선형 메모리 공간에 데이터를 저장하는
         *  선입선출(FIFO - First Input First Out)방식의 자료구조이다.
         *  Queue 인터페이스를 상속받는 하위 인터페이스들은
         *  Deque, BlockingQueue, BlockingDeque, TransferQueue등 다양하지만
         *  대부분의 큐는 LinkedList를 이용한다.
         * */

        /*설명. Queue 자체는 인터페이스이기 때문에 인스턴스를 생성할 수 없음.*/
//        Queue<String> que = new Queue<>{}

        /*설명. 다형성을 적용하여 LinkedList 타입으로 큐 인스턴스 생성.
        * Cuz, LinkedList는 Queue와 DeQue 모두에게 연결되어 있다.
        * */
        Queue<String> que = new LinkedList<>();

        /*설명. 큐에 데이터를 추가할 때는 offer() 메서드를 사용한다.*/
        que.offer("first");
        que.offer("second");
        que.offer("thrid");
        que.offer("fourth");
        que.offer("fifth");

        /*설명. 내부적으로 toString()이 오버라이딩 되어 있다.*/
        System.out.println("que = " + que);

        /*설명.
        * Queue에서 데이터를 꺼내는 방식에는 크게 2가지가 있다.
        * - poll() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한 후 제거
        * - peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환만 함
        * */
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que = " + que);

        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);


    }
}
