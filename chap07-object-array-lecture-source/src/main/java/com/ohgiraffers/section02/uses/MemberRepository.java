package com.ohgiraffers.section02.uses;

public class MemberRepository {

    //회원 정보를 저장하는 데이터베이스 그 자체를 흉내냄.
    private final static Member[] members;
    //현재 데이터베이스에 저장된 회원 수를 저장하는 필드.
    private static int count;

    //프로그램이 실행되는 순간에 10칸짜리 Member 타입 배열을 생성함. (final도 선언ㄴ되어 있기 때문에 이제 못 바꿈.)
    static {
        members = new Member[10];
    }

    //1. 회원 정보 저장 : 실제 데이터베이스에 전달된 회원 객체 배열을 저장하는 역할을 흉내
    public static boolean store(Member[] members) {

        for(int i = 0; i < members.length; i++) {
            MemberRepository.members[count ++] = members[i];
        }

//        public static boolean store(Member[] newmembers) {
//
//            for(int i = 0; i < newmembers.length; i++) {
//                members[count ++] = newmembers[i];
//            }

        //데이터베이스 저장 성공일 경우만 흉내내고 실패일 경우는 생략.
        return true;

    }

    //2. 회원 정보 조회 : 실제 데이터베이스에 저장된 회원 객체들을 배열로 반환해주는 역할을 흉내.
    public static Member[] findAllMembers() {

        return members;
    }
}
