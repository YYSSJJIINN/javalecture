package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 객체단위 입출력 보조스트림을 이해하고 사용할 수 있다. */
        /* 설명.
         *  객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream 확인하기
         *  dto패키지를 하나 추가한 뒤 MemberDTO 클래스를 하나 만들자
         * */
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong777@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea31@ohgiraffers.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남', 1234.6)};

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(    //객체단위 사용
                    new BufferedOutputStream(   //버퍼사용
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
                                //바이트단위로 output
            for(int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);   //outputMembers의 i번째 배열을 꺼내 쓰겠다.
            }

            //버퍼를 사용한 output은 flush와 close 잊지 말자!
            objOut.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        ObjectInputStream objIn = null;

        MemberDTO[] inputMembers = new MemberDTO[3];

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            while(true) {
                System.out.println(objIn.readObject());
            }
        } catch (EOFException e) {
            System.out.println("파일을 끝까지 읽었습니다.");
            System.out.println("더 이상 파일을 읽을 수 없기 때문에 프로그램을 종료합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
