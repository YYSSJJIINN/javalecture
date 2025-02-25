package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다.*/

        /* 필기.
         *  java.io 패키지의 입출력 스트림은 기본 스트림과 필터 스트림으로 분류할 수 있다.
         *  기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
         *  필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
         *  주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다.
         *  생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있다.
         *  */

        /* 설명.
         *  버퍼를 이용해서 성능 향상을 시키는 보조스트림
         *  BufferedWriter/BufferedReader
         * */

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(    //보조스트림인 BufferedWriter은 무조건 기반 스트림이 필요하다.
                    new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw. write("안녕하세요\n");
            bw. write("반갑습니다~\n");

            /*설명.
            * 버퍼를 이용하는 경우, 버퍼가 가득 차면 자동으로 내보내기를 하지만,
            * 버퍼가 미처 가득 차지 않은 상태에서는 강제로 내보내기(flush) 해야 한다.
            * close() 전에 확인해보면 파일이 작성되지 않는 것을 확인해볼 수 있다.
            * 이 때 flush()를 해주면 파일이 기록된다.
            * 참고로, close()도 내부적으로 flush()를 진행한다.
            * */
            //즉 flush랑 if문을 다 주석처리 하고 run을 돌리면 파일에 아무것도 안찍힌다.
            //안녕하세요 반갑습니다가 쌓여는 있지만 flush를 하지 않아 보내지지는 못한 상태인 것이다.
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*설명.
        * 버퍼에 미리 파일의 내용을 읽어들인 후 한 줄 단위로 읽어들이는 기능을 사용해
        * 기본 스트림보다 성능을 개선시킨다.
        * */

        BufferedReader br = null;

        try {
            br = new BufferedReader(
                    new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            /*설명.
            * readLine() : 버퍼에 대기중인 한 줄을 읽어와서 문자열로 반환해주는 메서드
            * */
            String temp;
            while((temp = br.readLine()) !=null) {
                System.out.println("읽어들인 내용 : " + temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
