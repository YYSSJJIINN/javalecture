package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지에서 예외처리를 사용하는 구문을 이해할 수 있다. */
        /* 설명.
         *  위에서 배운 예외처리를 가장 많이 활용하는 것이 io(input/output) 패키지 이다.
         *  아직 io는 배우지 않았지만 io 문법보다는 try-catch 블럭의 실제 사용과
         *  흐름에 집중을 해서 보자
         * */

        /*설명. try-catch-finally 블럭 밖에서 레퍼런스 변수를 미리 선언해둬야 한다.*/
        BufferedReader in = null;
        //stream이 필요한 존재이기 때문에 무조건 닫아줘야 마무리 된다.

        try {
            /*설명.
            * FileReader라는 클래스의 생성자에 예외처리 throws를 확인할 수 있다.
            * 해당 메서드(=생성자)를 호출하는 쪽에서 반드시 예외 처리를 해야 하므로
            * try-catch 블럭 안에서 생성자를 호출해 인스턴스를 생성해야 한다.
            * */
            in = new BufferedReader(new FileReader("test.dat"));
            //text.dat의 내용이 in에 들어있음.

            String s;

            /*설명.
            * readLine() 메서드를 보면 IOException 예외를 발생시켜 놓았기 때문에
            * catch 블럭을 추가해서 IOException에 대한 예외를 처리하는 구문을 작성해줘야 한다.
            * */
            while((s = in.readLine()) != null) {
            //!= null의 뜻은 text.dat에 글자가 하나라도 있을 것이라는 뜻이다.
                System.out.println("s = " + s);
            }

        } catch (FileNotFoundException e) {     //FNFE이 IOE보다 후손이기 때문에 위에 적혀야 한다.
            e.printStackTrace();
        } catch (IOException e) {
            /*설명.
            * IOException : 입출력에 관한 추상화된 예외 클래스로, FileNotFoundException은 후손 예외 클래스로 존재한다.
            * catch 블럭을 여러 개 작성할 때, 상위 타입이 하단으로, 후손타입이 상단으로 작성되어야 한다.*/
            e.printStackTrace();
        } finally {

            /*설명.
            * 예외 처리 구문과 관 없이 반드시 수행되어야 하는 로직들을 작성하는 영역이며
            * 주로 사용한 자원을 반납하거나 정리하는 목적으로 사용하게 된다.
            * (close(), clean()등의 이름을 가진 메서드들이 많이 존재한다.)
            * */
            //in.close();에서 오류가 나기 때문에 surround with try/catch 실행.
            System.out.println("===== finally 구문 들어옴 =====");
            try {
                /*설명.
                * FileNotFoundException이 발생한 후 catch문이 예외를 처리한 후 finally 블럭에 도착한다.
                * 그러나 try 구문 내에서 파일을 찾지 못했기 때문에 in 객체를 생성할 수 없었고
                * 초기화 값인 null이 그대로 존재하기 때문에 in.close()는 null.close(0가 되어 NPE가 발생한다.
                * 따라서 이러한 경우에는 if문을 사용해 null여부를 판단한 뒤 close()메서드를 호출해야 안전하다.
                * */
//                in.close();   //NullPointerException이 발생할 수도 있음
                if(in != null) {
                    System.out.println("입력 스트림 닫습니다.");
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("===== finally 구문 끝남 =====");

        }
    }
}
