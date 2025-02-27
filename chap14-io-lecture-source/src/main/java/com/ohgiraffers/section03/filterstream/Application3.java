package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 데이타입출력보조스트림을 이해하고 사용할 수 있다. */
        /* 필기.
         *  외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
         *  여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다
         *  예) 정수 입력받아 처리하려면 parsing을 해줘야 한다.
         * */

        /* 필기.
         *  데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공하고 있다.
         *  DataInputStream/DataOutputStream 이다.
         * */

        DataOutputStream dout = null;

        try {
            dout = new DataOutputStream(
                    new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

                //홍길동의 점수와 등급
                dout.writeUTF("홍길동");
                dout.writeInt(95);
                dout.writeChar('A');
                //이순신의 점수와 등급
                dout.writeUTF("이순신");
                dout.writeInt(87);
                dout.writeChar('B');
                //김철수의 점수와 등급
                dout.writeUTF("김철수");
                dout.writeInt(73);
                dout.writeChar('C');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if(dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        DataInputStream din = null;

        try {
            din = new DataInputStream(
                    new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            while(true) {
                System.out.println(din.readUTF());
                System.out.println(din.readInt());
                System.out.println(din.readChar());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("파일을 모두 읽었습니다.");
            System.out.println("파이르이 끝자락에 도달했기 때문에 프로그램을 정상적으로 종료합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(din != null) {
                try {
                    din.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
