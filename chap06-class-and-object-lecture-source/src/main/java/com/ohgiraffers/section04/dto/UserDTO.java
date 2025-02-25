package com.ohgiraffers.section04.dto;

/* 필기.
 *  자바빈(Java Bean)이란?
 *  JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스이다.
 *  자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데,
 *  그 때 사용할 수 있도록 규칙을 지정해놓은 java 클래스를 자바빈(java bean)이라고 부른다.
 *  지금은 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 된다.
 * */

import java.io.Serializable;
import java.util.Date;

/* 필기.
 *  자바빈 작성 규칙
 *  1. 자바빈은 특정 패키지에 속해있어야 함 (default 패키지 사용 금지)
 *  2. 멤버변수(field)의 접근제어자는 private로 선언해야 함.
 *  3. 기본생성자가 명시적으로 존재해야 한다. (매개변수 있는 생성자는 선택사항)
 *  4. 모든 멤버변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함.
 *  5. 직렬화(Serializable 구현)가 되어야 한다. (선택사항)
 * */
public class UserDTO implements Serializable {      //5. 직렬화 구현

    /*2. 모든 필드는 private으로 접근제한을 실정한다.*/
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*3. 기본 생성자가 명시적으로 존재. (매개변수 있는 생성자는 선택사항)*/
    public UserDTO() {      //Alt Insert Constructor non눌러서 기본생성자로
    }
    /*설명. 매개변수 있는 생성자는 선택사항이다.
    * 필요에 따라 만들 수 있지만, 일반적으로 가장 많이 사용되는 생성자는 모든 필드를 초기화하는 생성자다.
    * 매개변수 있는 생성자를 만들었다면, 기본 생성자는 반드시 명시해야 한다.
    * */
    public UserDTO(String id, String pwd, String name, Date enrollDate) {

    }

    /*4. 모든 멤버변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함.*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    /*필기. 접근자(getter)로 필드 값을 하나 씩 일일이 확인하는 작업이 매우 번거롭기 때문에
    * 모든 필드의 값을 하나의 문자열로 반환하는 메서드를 작성해 많이 사용하는 편이다.
    * */

    public String getInfo() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
