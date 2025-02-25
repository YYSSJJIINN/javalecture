package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. try-with-resource 구문의 문법을 이해하고 사용할 수 있다.*/

        /*설명.
         * try-with-resource 구문은 JDK 1.7에서 추가된 문법이다.
         * close() 메서드를 호출해 자원을 반납해야 하는 인스턴스의 경우
         * try() 괄호 안에서 인스턴스를 생성해주면 해당 try-catch 블럭이 안료될 때
         * 자동으로 close() 메서드를 호출해준다.
         * */

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {

            String s;

            while ((s = in.readLine()) != null) {  //!= null의 뜻은 text.dat에 글자가 하나라도 있을 것이라는 뜻이다.
                System.out.println("s = " + s);
            }

        } catch (FileNotFoundException e) {     //FNFE이 IOE보다 후손이기 때문에 위에 적혀야 한다.
            e.printStackTrace();
        } catch (IOException e) {
            /*설명.
             * IOException : 입출력에 관한 추상화된 예외 클래스로, FileNotFoundException은 후손 예외 클래스로 존재한다.
             * catch 블럭을 여러 개 작성할 때, 상위 타입이 하단으로, 후손타입이 상단으로 작성되어야 한다.*/
            e.printStackTrace();
        }
    }
}