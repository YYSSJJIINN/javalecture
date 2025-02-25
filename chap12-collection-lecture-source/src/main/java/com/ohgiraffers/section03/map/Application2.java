package com.ohgiraffers.section03.map;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */
        /* 필기.
         *  Properties란?
         *  HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
         *  설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
         * */

        Properties props = new Properties();

        try {
            props.load(new FileReader("driver.txt"));
            System.out.println(props.getProperty("password"));    //Property는 key와 value값이 String으로 고정이다.
            System.out.println(props.getProperty("driver"));
            System.out.println(props.getProperty("user"));
            System.out.println(props.getProperty("url"));
        } catch (IOException e) {
            //위 try 블럭 안에서 예외가 발생한다면 그 예외를 catch하여 처리한다.
            throw new RuntimeException(e);
        }

        //==================================================================

        Properties props2 = new Properties();
        
        props2.setProperty("password", "student");  //get과 다르게 set은 입력가능하게
        props2.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        props2.setProperty("user", "gildong-hong");
        props2.setProperty("url", "jdbc:mysql://localhost:3306/example");

        System.out.println("props2 = " + props2);

        try {
            props2.store(new FileOutputStream("driver.dat"), "This file is for JDBC Driver Configuration."); //저장하는 store의 매개변수 2개
            props2.storeToXML(new FileOutputStream("driver.xml"), "This file is for JDBC Driver Configuration.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
