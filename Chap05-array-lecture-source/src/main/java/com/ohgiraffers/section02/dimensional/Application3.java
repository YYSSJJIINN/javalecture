package com.ohgiraffers.section02.dimensional;

public class Application3 {

    public static void main(String[] args) {

        /*필기. 1-10 사이의 랜덤한 정수를 추출하여 해당 정수로 가변 배열을 만들어보자.
        * 1. 몇 행을 만들 것인지 랜덤수 추출
        * 2. 각 행을 몇 열로 만들 것인지 행마다 랜덤수 추출
        * */

        Application3 app3 = new Application3();

        //출력할 행의 개수
        int row = app3.getRandomInt();      //대입연산자 =의 뒤의 것이 4를 내놓았을 때 row에게 4가 간다.
        System.out.println("row = " + row);

        int[] col = new int[row];

        for(int i = 0; i < col.length; i++) {
            col[i] = app3.getRandomInt();
        }

        //1차 배열 선언 및 초기화
        int[][] result = new int[row][];        //row값은 3

        //2차 배열 선언 및 초기화 :
        for(int i = 0; i < col.length; i++) {       //col.의 값은 3

            result[i] = new int[col[i]];
        }
    }

    public int getRandomInt() {     //반환형은 int
        return (int) (Math.random() * 10) + 1;
    }
}
