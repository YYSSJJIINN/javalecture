package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    public RacingCar() {
        //안보이겠지만 여기에 부모생성자 호출하는 super()구문 적혀있음
        System.out.println("[RacingCar] 기본생성자 호출됨...");
    }

    @Override
    public void run() {
//        super.run();      //부모의 메서드 중계인 꼴만 된다
        System.out.println("[RacingCar] 레이싱카가 전속력으로 질주합니다!");
    }

    @Override
    public void soundHorn() {
//        super.soundHorn();
        System.out.println("[RacingCar] 레이싱카는 경적을 울리지 않습니다.(조용....)");
    }

    @Override
    public void stop() {
//        super.stop();
        System.out.println("[RacingCar] 레이싱카가 멈춥니다.");
    }
}
