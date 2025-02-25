package com.ohgiraffers.section02.uses;

public class MemberRegister {


    public void regist(Member[] members) {

        System.out.println("[MemberRegister] 회원을 등록합니다...");

        for(int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을(를) 회원 등록에 성공했습니다.");
        }

        //데이터 베이스에 회원 정보를 입력하는 작업이 성공했을 때 true를 반환하는 store() 메서(실패의 경우는 생략)
        if(MemberRepository.store(members)) {
            System.out.println("작업 결과, 총 " + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
