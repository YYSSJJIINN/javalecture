package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다.*/

        /* 필기.
         *  입출력 스트림 개요
         *  우리는 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
         *  하지만 데이터는 프로그램 내부에 있을 수 도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
         *  또한 프로그램에서 생성한 데이터를 외부로 출력할 수 도있다.
         *
         * 필기.
         *  외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
         *  외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수 도 있다.
         *  외부 데이터를 대상으로 작업할 때 가장 먼저 해야 할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다.
         *  프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
         *  스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력스트림 이라고 부른다.
         *
         * 필기.
         *  입출력과 관련된 API는 java.io 패키지에서 제공하고 있다.
         *  API 문서에서 목록을 확인해보면 대부분 InputStream/OutputStream, Reader/Writer 로 끝난다.
         *  이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
         *
         * 필기.
         *  그 중 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고
         *  OutputStream과 Writer는 데이터를 내보내는 출력스트림이다.
         *  또한 InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
         *  Reader와 Writer계열은 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
         *  참고로 MS949 인코딩에서는 한글 한 글자를 2바이트로 취급하지만 UTF-8에서는 한글 한 글자를 3바이트로 취급한다.
         *
         * 필기.
         *  자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
         *  InputStream/OuputStream/Reader/Writer를 빼고 남은 단어가 바로 외부 데이터의 타입이다.
         *  예) FileInputStream은 InputStream을 제거하고 남은 단어가 File이므로 외부 데이터는 File임을 알 수 있다.
         * */

        /* 설명.
         *  외부 데이터를 프로그램으로 읽어들이는 스트림은 입력스트림이라고 하고
         *  몇 바이트씩을 한 번에 처리하는지에 따라 InputStream과 Writer로 구분한다.
         *  그 중 먼저 InputStream에 대해 살펴보자
         * */

        FileInputStream fin = null;

        try {

            /*설명.
            * 대상 파일이 존재하지 않는 경우 FileNotFoundException이 발생하는데, 해당 예외를 핸들링 해야한다.
            * 아직 testInputStream.txt 파일을 만들지 않았다면 해당 예외가 발생할 것이다.
            * (만약, 예외가 발생ㅎ지 않는다면 파일이 존재한다는 뜻이고, 성공적으로 스트립 인스턴스가 생성될 것이다.)
            * */
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;

            /*설명. read() : 파일에 기록된 값을 순차적으로 읽어오고, 더 이상 읽을 데이터가 없는 경우 -1을 반환
            * */
//            while((value = fin.read()) != -1) {
////                System.out.println(value);
//                System.out.println(value + ":" + (char)value);  //정수값 읽기 + 문자값 읽기
//            }

            /*필기. File클래스의 length() 메서드로 파일의 길이를 알 수 있음.*/
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            int fileSize = (int)new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bArr = new byte[fileSize];

            /*설명.
            * raed() 메서드의 인자로 byte 배열을 넣어주면 파일의 내용을 읽어서 차례대로 byte 배열에 기록해준다.
            * */
            fin.read(bArr);

            /*설명.
            * 해당 스트림은 파일의 끝가지(-1) 모두 읽어들인 스트림이기 때문에
            * try문 초반 부분에 while문으로 read()호출했던 부분을
            * 주석처리해줘야 아래 for문이 동작할 수 있다.*/
            for(int i = 0; i < bArr.length; i++) {
                System.out.println(i + " : " + bArr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();    //마지막에 스트림 close해주면서 바꿔준다.
        } finally {

            /* 필기.
             *  자원 반납을 해야 하는 이유
             *  1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)가 발생한다.
             *  2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
             *     만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
             *     판단하기 어렵고 의도하지 않는 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에는 flush()를
             *     무조건 실행해주는 것이 좋다.
             *     close()메소드는 자원을 반납하며 flush()를 해 주기 때문에 close()만 제대로 해 줘도 된다.
             *     따라서 close() 메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야 한다.
             * */
            if(fin != null) {   //스트림 fin이 열려있다면
                try {
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
