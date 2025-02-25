package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {    //<>기본자료형 불가능. 참조자료형만 ㅇㅋ. Comparable쓰며 전달인자가 2개인 compareTo를 사용했는데, 두 개를 사용할 것이므로 비교자로 변경

    @Override
    public int compare(BookDTO o1, BookDTO o2) {  //두번째 전달인자 BookDTO o2 직접 타이핑하고, To제거
        /*설명.
        * 비교 대상인 두 인스턴스의 가격이 오름차순 정렬되려면 앞의 가격이 더 적은 가격이어야 한다.
        * 만약 뒤의 가격이 더 적은 경우에느느 두 인스턴스의 순서를 바꿔줘야 한다.
        * 이 때, 두 값을 바꾸라는 일종의 신호로 다음과 같이 동작시킬 예정이다.
        * - 음수 : 순서를 바꾸지 않아도 됨
        * - 양수 : 순서를 바꿔야 함
        * - 0 : 두 가격이 같을 때
        * */
        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            //양수 : 오름차순 정렬을 위해 순서를 바꿔줘야 하는 경우
            result = 1;
        } else if(o1.getPrice() < o2.getPrice()) {
            //음수 : 이미 오름차순 정렬 되어있기 때문에 순서를 바꾸지 않아도 되는 경우
            result = -1;
        }else {
            //0 : 동일한 가격이기 때문에 순서를 바꾸지 않아도 되는 경우
            result = 0;
        }
        return result;  //원래 자동생성시 return 0이었는데 if문 넣으며 변경해준다.

    }
}
