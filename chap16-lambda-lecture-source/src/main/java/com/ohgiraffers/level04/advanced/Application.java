package com.ohgiraffers.level04.advanced;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MemberController controller = new MemberController();

        while(true) {
            System.out.println("===== Yoga Class Management System =====");
            System.out.println("1. 신규 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 프로그램을 종료시킵니다.");
            System.out.println("번호를 선택하세요: ");

            int clicknum = sc.nextInt();
            sc.nextLine();

            switch (clicknum) {
                case 1:
                    System.out.println("신규 등록할 회원의 이름을 입력하세요: ");
                    String name = sc.nextLine();

                    System.out.println("신규 등록할 회원의 나이를 입력하세요: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("신규 등록할 회원의 생년월일을 입력하세요(예시 YYMMDD): ");
                    int birthday = sc.nextInt();
                    sc.nextLine();

                    System.out.println("1. 초급반");
                    System.out.println("2. 중급반");
                    System.out.println("3. 상급반");
                    System.out.println("수업 수준을 선택하세요: ");
                    int memberlevelChoice = sc.nextInt();

//                    MemberlevelType memberlevelType = null;
                    String selectedMemberLevel = "";

                    System.out.println("회원권 종류 하나 선택");
                    switch (memberlevelChoice) {
                            case 1: selectedMemberLevel = "basic"; break;
                            case 2: selectedMemberLevel = "normal"; break;
                            case 3: selectedMemberLevel = "pro"; break;
                        default:
                            System.out.println("잘못된 선택입니다. 기본값인 초급반으로 설정됩니다.");
                            selectedMemberLevel = "basic";
                    }

                    System.out.println("회원권 종류 하나 선택");
                    System.out.println("1. 일일 회원");
                    System.out.println("2. 주간 회원");
                    System.out.println("3. 월간 회원");
                    System.out.println("4. 무료 이벤트 회원");
                    System.out.println("메뉴 하나 선택 : ");
                    int membershipChoice = sc.nextInt();

                    MembershipType membershipType = null;

                    switch (membershipChoice) {
                        case 1: membershipType = MembershipType.DAILY; break;
                        case 2: membershipType = MembershipType.WEEK; break;
                        case 3: membershipType = MembershipType.MONTHLY; break;
                        case 4: membershipType = MembershipType.ONEDAYFREE; break;
                        default:
                            System.out.println("잘못된 선택입니다. 기본값인 일일 회원권으로 설정됩니다.");
                            membershipType = MembershipType.DAILY;
                    }
                    controller.putMember(name, age, birthday, membershipType, selectedMemberLevel);
                    break;

                case 2:
                    while(true) {
                        System.out.println("\n===== 회원 조회 메뉴 =====");
                        System.out.println("1. 회원 전체 조회");
                        System.out.println("2. 회원 ID로 조회");
                        System.out.println("3. 회원 이름으로 조회");
                        System.out.println("9. 이전 메뉴로");
                        System.out.print("메뉴 선택: ");

                        int searchChoice = sc.nextInt();
                        sc.nextLine();

                        if(searchChoice == 9) break;

                        switch(searchChoice) {
                            case 1:
                                controller.displayAllMembers();
                                break;
                            case 2:
                                System.out.print("조회할 회원 ID: ");
                                int memberId = sc.nextInt();
                                controller.getMember(memberId);
                                break;
                            case 3:
                                System.out.print("조회할 회원 이름: ");
                                String searchName = sc.nextLine();
                                controller.getMembersByName(searchName);
                                break;
                            default:
                                System.out.println("===== 잘못된 입력입니다. =====");
                        }
                    }
                    break;

                case 3:
                    while(true) {
                        System.out.println("\n===== 회원 정보 수정 메뉴 =====");
                        System.out.println("1. 기본 정보 수정");
                        System.out.println("2. 회원권 변경");
                        System.out.println("3. 회원 상태 변경");
                        System.out.println("9. 이전 메뉴로");
                        System.out.print("메뉴 선택: ");

                        int updateChoice = sc.nextInt();
                        sc.nextLine();

                        if(updateChoice == 9) break;

                        System.out.print("수정할 회원의 ID: ");
                        int memberId = sc.nextInt();
                        sc.nextLine();

                        switch(updateChoice) {
                            case 1:
                                System.out.print("새로운 이름: ");
                                String updatedName = sc.nextLine();
                                System.out.print("새로운 나이: ");
                                int updatedAge = sc.nextInt();
                                sc.nextLine();
                                System.out.print("새로운 생년월일: ");
                                int updatedBirthday = sc.nextInt();
                                controller.updateMemberInfo(memberId, updatedName, updatedAge, updatedBirthday);
                                break;
                            case 2:
                                System.out.println("변경할 회원권 종류 선택");
                                System.out.println("1. 일일 회원권");
                                System.out.println("2. 주간 회원권");
                                System.out.println("3. 월간 회원권");
                                System.out.print("변경할 회원권 종류 선택: ");
                                int membershipTypeChoice = sc.nextInt();

                                MembershipType newType = switch(membershipTypeChoice) {
                                    case 1 -> MembershipType.DAILY;
                                    case 2 -> MembershipType.MONTHLY;
                                    case 3 -> MembershipType.ONEDAYFREE;
                                    default -> MembershipType.DAILY;
                                };
                                controller.changeMembershipType(memberId, newType);
                                break;
                            case 3:
                                System.out.print("회원 상태 변경(true/false): ");
                                boolean isActive = sc.nextBoolean();
                                controller.updateMemberStatus(memberId, isActive);
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("===== 회원 탈퇴 진행 =====");
                    System.out.print("삭제할 회원의 ID를 입력하세요.: ");
                    int memberId = sc.nextInt();
                    controller.deleteMember(memberId);
                    break;

                case 9:
                    System.out.println("===== 프로그램을 종료합니다. =====");
                    sc.close();
                    return;

                default:
                    System.out.println("===== 잘못된 입력입니다. =====");
            }
        }
    }
}
