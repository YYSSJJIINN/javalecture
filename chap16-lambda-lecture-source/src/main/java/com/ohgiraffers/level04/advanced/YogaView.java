package com.ohgiraffers.level04.advanced;

import java.util.List;

public class YogaView {

    public void displayYMember(Member member) {
        System.out.println(member);
    }

    public void displayYMemberList(List<Member> members) {
        members.forEach(System.out::println);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}
