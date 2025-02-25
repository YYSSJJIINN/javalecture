package com.ohgiraffers.section02.uses;

public class MemberService {

    //1. 회원 정보 등록
    public void signUpMembers() {

        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 20, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 20, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 20, '여');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 20, '남');

        MemberRegister memberRegister = new MemberRegister();

        memberRegister.regist(members);     //내가 members줄게, regist좀 해줘 memberRegister야
    }

    //2. 회원 정보 조회
    public void showAllMembers() {

        MemberFinder memberFinder = new MemberFinder();

        System.out.println("********가입된 회원 목록********");

        for(Member member : memberFinder.findAllMembers()) {
            if(member != null) {        //내가 뽑은 멤버가 null이 아니라면
                System.out.println(member.getInfo());
            }
        }

        System.out.println("****************");
    }
}
