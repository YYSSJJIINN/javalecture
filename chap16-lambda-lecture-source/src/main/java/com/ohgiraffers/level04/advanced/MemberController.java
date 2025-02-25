package com.ohgiraffers.level04.advanced;

import java.util.List;

public class MemberController {

    private YogaDTO yogaDTO;
    private YogaView yogaView;
    private com.ohgiraffers.level04.advanced.MembershipType MembershipType;

    public MemberController() {

        yogaDTO = new YogaDTO();
        yogaView = new YogaView();
    }

    public void putMember(String name, int age, int birthday, MembershipType membershiptype, String memberleveltype) {

        Member member = new Member(0, name, age, birthday, membershiptype, memberleveltype, true);
        yogaDTO.addMember(member);

        yogaView.displayMessage("회원 등록을 성공했습니다.");
    }

    public void displayAllMembers() {

        List<Member> ymembers = yogaDTO.getAllMembers();

        yogaView.displayYMemberList(ymembers);
    }

    public void getMember(int memberId) {

        Member ymember = yogaDTO.getMember(memberId);

        if (ymember != null) {
            yogaView.displayYMember(ymember);
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }

    public void getMembersByName(String name) {

        List<Member> ymembers = yogaDTO.getMembersByName(name);

        if (!ymembers.isEmpty()) {
            yogaView.displayYMemberList(ymembers);
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }

    public void getlevel(String memberlevelType) {

    }

    public void updateMemberInfo(int memberId, String name, int age, int birthday) {

        Member ymember = yogaDTO.getMember(memberId);

        if (ymember != null) {
            yogaDTO.updateMemberInfo(memberId, name, age, birthday);
            yogaView.displayMessage("회원 정보를 변경 완료 하였습니다.");
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }

    public void changeMembershipType(int memberId, MembershipType newType) {
        Member member = yogaDTO.getMember(memberId);

        if (member != null) {
            yogaDTO.changeMembershipType(memberId, newType);
            yogaView.displayMessage("회원권 종류가 갱신 되었습니다.");
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }

    public void updateMemberStatus(int memberId, boolean isActive) {

        Member ymember = yogaDTO.getMember(memberId);

        if (ymember != null) {
            yogaDTO.updateMemberStatus(memberId, isActive);
            yogaView.displayMessage("회원 상태가 변경되었습니다.");
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }

    public void deleteMember(int memberId) {

        Member ymember = yogaDTO.getMember(memberId);

        if (ymember != null) {
            yogaDTO.deleteMember(memberId);
            yogaView.displayMessage("회원이 삭제되었습니다.");
        } else {
            yogaView.displayMessage("해당 회원을 찾지 못 했습니다.");
        }
    }
}
