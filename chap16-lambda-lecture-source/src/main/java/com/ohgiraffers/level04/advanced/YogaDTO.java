package com.ohgiraffers.level04.advanced;

import java.util.*;
import java.util.stream.Collectors;

public class YogaDTO {

    private static List<Member> members;     //Map으로 해주니까 전달인자가 2개 필요해서 우선 List로
    private static int nextMemberId = 1;

    public YogaDTO() {
        members = new ArrayList<>();
        exampleMembers();
    }

    private void exampleMembers() {

        addMember(new Member(nextMemberId++, "해리 포터", 46, 800731, MembershipType.WEEK, "기본반", true));
        addMember(new Member(nextMemberId++, "론 위즐리", 46, 800301, MembershipType.ONEDAYFREE, "초급반", true));
        addMember(new Member(nextMemberId++, "헤르미온느 그레인저", 47, 790919, MembershipType.DAILY, "기본반", true));
        addMember(new Member(nextMemberId++, "프레드 위즐리", 48, 780411, MembershipType.DAILY, "상급반", true));
        addMember(new Member(nextMemberId++, "조지 위즐리", 48, 780411, MembershipType.MONTHLY, "상급반", true));
        addMember(new Member(nextMemberId++, "지니 위즐리", 45, 810811, MembershipType.DAILY, "초급반", true));
        addMember(new Member(nextMemberId++, "드레이코 말포이", 46, 800605, MembershipType.MONTHLY, "초급반", true));
    }

    public void addMember(Member member) {

        members.add(member);
    }

    public List<Member> getAllMembers() {

        return new ArrayList<>(members);
    }

    public Member getMember(int memberId) {

        return members.stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst()
                .orElse(null);
    }

    public List<Member> getMembersByName(String name) {

        return members.stream()
                .filter(m -> m.getName().contains(name))
                .collect(Collectors.toList());
    }


    public void updateMemberInfo(int memberId, String name, int age, int birthday) {
        Member member = getMember(memberId);

        if (member != null) {
            member.setName(name);
            member.setAge(age);
            member.setBirthday(birthday);
        }
    }

    public void changeMembershipType(int memberId, MembershipType newType) {

        Member member = getMember(memberId);

    }

    public void updateMemberStatus(int memberId, boolean isActive) {

        Member member = getMember(memberId);

        if (member != null) {
            member.setActive(isActive);
        }
    }

    public void deleteMember(int memberId) {

        members.removeIf(m -> m.getMemberId() == memberId);
    }

}
