package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    public void testSimpleIfElseIfStatement() {

        /* 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *  [if-else-if문 표현식]
         *  if(조건식 #1) {
         *      조건식 #1이 true일 때 실행할 명령문;
         *  } else if(조건식 #2) {
         *      조건식 #1이 false이고, 조건식# 2가 true일 때 실행할 명령문;
         *  } else {
         *      위의 조건 2개가 모두 거짓인 경우 실핼할 명령문;
         *  }
         * */

        /* 필기.
         *  if-else-if문은 조건식1의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
         *  조건식1이 false이면 조건식2를 확인하여 참(true)이면 else if { } 안에 있는 코드를 실행한다.
         *  조건식1, 2의 결과 값이 모두 거짓(false)이면  else { } 안에 있는 코드를 실행한다.
         * */

        /* 설명.여러 개의 조건을 제시하여 그 중 한 가지를 반드시 실행시키고 싶은 경우 사용한다. */

        /* 설명.
         *  금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지를 물어보는 시나리오대로
         *  코드를 작성하고 실행하보자!
         * */

        //1. 동화 내레이션 및 사용자의 도끼 선택
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.print("[산신령]: 어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼)");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        //2. 도끼 조건 판단 및 산신령의 대사
        if (answer == 1) {
            //2-1. 금도끼
            System.out.println("[나무꾼]: 제 도끼는 금도끼 입니다...");
            System.out.println("[산신령]: 이런 거짓말쟁이!! 너에게는 아무런 도끼도 내어줄 수 없다!!");
        } else if (answer == 2) {
            //2-2. 은도끼
            System.out.println("[나무꾼]: 제 도끼는 은도끼 입니다...");
            System.out.println("[산신령]: 욕심이 과하지는 않지만, 그래도 거짓말을 하였구나!! 어서 썩 꺼지거라!!");
        } else {
            //2-3. 쇠도끼
            System.out.println("[나무꾼]: 제 도끼는 쇠도끼 입니다...");
            System.out.println("[산신령]: 오호~ 정직하구나~ 정직함의 대가로 여기 있는 금, 은, 쇠도끼를 모두 가져가거라!");
        }

        //3. 나무꾼의 대답 조건 관계 없이 항상 실행되는 출력문
        System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다...");
    }

    public void testNestedIfElseIfStatement() {

        /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기. 중첩된 if-else-if 문 실행 흐름 확인 */
        /* 설명. if-else-if 문 안에서 또 다른 조건을 사용하여 if or if-else or if-else-if 문을 사용할 수 있다. */

        /* 필기.
         *  OhGiraffers 대학의 송xx 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        /* 목차. 1. 사용자 입력 받기 */
        /* 목차. 1-1. 학생의 이름과 점수 입력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        /* 목차. 1-2. 학생의 등급(실행 결과)을 저장하기 위한 변수 초기화 */
        String grade = "";

        /* 목차. 2. 학점 등급을 매기기 위해 점수를 확인하는 조건문*/
        if (point >= 90) {
            // 목차. 2-1. A등급
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            // 목차. 2-2. B등급
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            // 목차. 2-3. C등급
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            // 목차. 2-4. D등급
            grade = "D";
            if (point >= 65) {
                grade += "+";
            } else {
                // 목차. 2-5. F등급
                grade = "F";
            }
        }


        /* 목차. 3. 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name + " 학생의 점수는 " + point + "이고, 등급은 " + grade + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }

    public void improvedNestedIfElseIfStatement() {

        /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기. 중첩된 if-else-if 문 실행 흐름 확인 */
        /* 설명. if-else-if 문 안에서 또 다른 조건을 사용하여 if or if-else or if-else-if 문을 사용할 수 있다. */

        /* 필기.
         *  OhGiraffers 대학의 송xx 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        /* 목차. 1. 사용자 입력 받기 */
        /* 목차. 1-1. 학생의 이름과 점수 입력 */
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 이름을 입력하세요 : ");
        String name1 = sc.nextLine();

        System.out.print("학생의 점수를 입력하세요 : ");
        int point1 = sc.nextInt();

        /* 목차. 1-2. 학생의 등급(실행 결과)을 저장하기 위한 변수 초기화 */
        String grade1 = "";

        /* 목차. 2. 학점 등급을 매기기 위해 점수를 확인하는 조건문*/
        /* 목차. 2-1. 등급 결정(20점 단위) */
        if (point1 >= 90) {
            // 목차. 2-1. A등급
            grade1 = "A";
        } else if (point1 >= 80) {
            // 목차. 2-2. B등급
            grade1 = "B";
        } else if (point1 >= 70) {
            // 목차. 2-3. C등급
            grade1 = "C";
        } else if (point1 >= 60) {
            // 목차. 2-4. D등급
            grade1 = "D";
        } else {
            // 목차. 2-5. F등급
            grade1 = "F";
        }

        /* 목차. 2-2. 등급 결정(플러스 등급)*/
        // 각 등급의 중간 점수(5) 이상이면서(AND), 60점 이상 및 100점 이하인 경우인가?
        if ((point1 % 10 >= 5) && (point1 >= 60 || point1 == 100)) {       //앞이 트루여도 뒤도 트루여야하는 &&
            grade1 += "+";
        }

        /* 목차. 3. 위에서 결정된 등급을 점수와 함께 출력한다. */
        System.out.println(name1 + " 학생의 점수는 " + point1 + "이고, 등급은 " + grade1 + "입니다.");
        System.out.println("프로그램을 종료합니다.");
    }
}