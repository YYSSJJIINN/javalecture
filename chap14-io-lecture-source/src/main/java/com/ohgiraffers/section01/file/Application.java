package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 용법을 이해할 수 있다. */
        /* 설명. File을 이용한 스트림을 사용하기 앞서 File 클래스의 기본 사용 방법을 확인해보자 */

        /* 필기.
         *  JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스 이다.
         *  대상 파일에 대한 정보로 인스턴스를 생성하고
         *  파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있다.
         * */

        /*설명.
        * File 클래스를 이용해 인스턴스를 생성한다.
        * 만들고자 하는 타겟 파일이 아직 존재하지 않더라도 인스턴스는 생성할 수 있다.
        * */
        File newFile = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        //반환값이 boolean이므로 요청한 파일이 생성됐는지 참/거짓으로 알려줌.
        try {
            /*설명.
            * createNewFile()은 파일을 생성한 후 그 생성 작업에 대한 성공 여부를 boolean 타입으로 반환한다.
            * 또한 IOException 예외를 처리해줘야 한다.*/
            boolean createResult = newFile.createNewFile();

            /*설명.
            * 최초 실행 시, 파일을 실제로 생성해야 하기 때문에 true를 반환하지만,
            * 파일이 한 번 생성되고 난 이후에는 이미 존재하는 파일은 새로 생성하지 않기 때문에
            * false를 반환함.
            * */
            System.out.println("createResult = " + createResult);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //==========================================================

        System.out.println("파일의 크기 : " + newFile.length() + " byte");
        System.out.println("파일의 경로 : " + newFile.getPath());
        System.out.println("파일의 상위경로 : " + newFile.getParent());
        System.out.println("파일의 절대경로 : " + newFile.getAbsolutePath());

        //==========================================================

        /*설명. delete() 메서드로 파일을 삭제할 수 있으며 성공 여부를 boolean으로 반환한다.*/
        boolean deleteResult = newFile.delete();

        System.out.println("deleteResult = " + deleteResult);
    }
}
