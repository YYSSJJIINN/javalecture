package com.ohgiraffers.level04.advanced;

public class Member {

    private int memberId;
    private String name;
    private int age;
    private int birthday;
    private MembershipType membershipType;
    private String memberLevelType;
    private boolean isActive;

    public Member() {
    }

    public Member(int memberId, String name, int age, int birthday, MembershipType membershipType, String memberlevelType, boolean isActive) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.membershipType = membershipType;
        this.memberLevelType = memberlevelType;
        this.isActive = isActive;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public String getMemberLevelType() {
        return memberLevelType;
    }

    public void setMemberLevelType(String memberLevelType) {
        this.memberLevelType = memberLevelType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", membershipType=" + membershipType +
                ", memberlevelType='" + memberLevelType + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
