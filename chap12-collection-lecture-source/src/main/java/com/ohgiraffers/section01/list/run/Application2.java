package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. ArrayList의 정렬 기능을 이용할 수 있다.*                                                                                                                                        할 수 있다.*/

        /*설명. 여러 권의 책 목록을 관리할 인스턴스를 ArrayList로(배열[]) 생성.*/
        List<BookDTO> bookList = new ArrayList<>();      //bookList에는 이제 <BookDTO>타입만 가능하다. String 같은거 불가능.

        /*설명. 책 목록에 5권의 책 정보를 추가*/
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 59000));

        /*설명.
        * 제네릭의 타입 제한에 의해서 Comparable 인터페이스 타입을 가지고 있는 경우에만 sort() 메서드를 사용할 수 있다.
        * 즉, 앞에서 사용했던 java.lang.String클래스는 Comparable<String> 타입을 구현했기 때문에 sort()가 동작할 수 있었다.
        * */
//        Collections.sort(bookList);

//        System.out.println("========== 책 리스트 정렬 전 ==========");
//        for(BookDTO b : bookList) {
//            System.out.println(b);
//        }

        /*설명.
        * Comparator 인터페이스를 상속받은 AscendingPrice 클래스를 생성하고
        * 추상메서드 compare()를 재정의한다.
        * 가격을 기준으로 정렬하는 로직을 재정의한 뒤, List의 default메서드인 sort()의 전달인자로
        * 정렬기준이 되는 인스턴스를 전달하게 되면 내부적으로 우리가 직접 오버라이딩한 메서드가 동작하게 되며
        * 이에 따라 정렬이 진행된다.
        * */
//        bookList.sort(new AscendingPrice());    //오름차순 정렬 적용
//
//        System.out.println("========== 책 리스트 정렬 후 ==========");
//        for(BookDTO b : bookList) {
//            System.out.println(b);
//        }

        /*설명.
        * 인터페이스를 구현한 클래스를 재사용하는 경우, AscendingPrice 클래스처럼 작성하면 되지만
        * 한 번만 사용하기 위해서는 조금 더 간편한 방법을 사용할 수 있는데,
        * 익명 클래스(anonymous class)를 이용하면 된다.
        * */
        /*설명. 클래스 없이 인터페이스 자체로는 인스턴스를 만들 수 없다.*/
//        bookList.sort(new Comparator<BookDTO>());

        System.out.println("========== (익명클래스)책 리스트 정렬 전 ==========");
        for(BookDTO b : bookList) {
            System.out.println(b);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() <= o2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("========== (익명클래스)책 리스트 오름차순 정렬 후 ==========");
        for(BookDTO b : bookList) {
            System.out.println(b);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getPrice() <= o2.getPrice() ? 1 : -1;
            }
        });

        System.out.println("========== (익명클래스)책 리스트 내림차순 정렬 후 ==========");
        for(BookDTO b : bookList) {
            System.out.println(b);
        }

        /*설명. 제목 기준 내림차순*/
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("========== (익명클래스)책 리스트 제목 기준 내림차순 정렬 후 ==========");
        for(BookDTO b : bookList) {
            System.out.println(b);
        }
    }
}
