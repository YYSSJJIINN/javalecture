package com.ohgiraffers.level04.advanced;

public enum MembershipType {

    DAILY("일일", 1),
    WEEK("주간", 7),
    MONTHLY("월간", 30),
    ONEDAYFREE("무료이벤트", 1);

    private final String description;
    private final int days;

    MembershipType(String description, int days) {
        this.description = description;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public String getDescription() {
        return description;
    }
}
