package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;       //초기값 false(시동 안걸림)으로 초기화 됨
    private int speed;

    //1. startUp() : 시동이 걸려있는 상태인 경우 할 일이 없고, 시동이 걸려있지 않은 상태인 경우 시동을 건다.
    public void startUp() {
        if(isOn) {
            System.out.println("[1] 이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("[1] 시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
        }
    }

    //2. go() : 시동이 걸린 상태인 경우에만 호출할 때마다 10km/h씩 속도를 증가시킨다.
    public void go() {
        if(isOn) {
            System.out.println("[2] 시동이 걸려있고, 차는 전진합니다.");
            this.speed += 10;       //10씩 증가시키므로 += 사용함.
            System.out.println("    ㄴ 현재 차의 시속은 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("[2] 현재 차의 시동이 걸려있지 않습니다! 먼저 차에 시동을 걸어주세요.");
        }
    }

    //3. stop() : 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다.
    public void stop() {
        if(isOn) {
            if(this.speed > 0) {        //this.speed > 0 달리는 상태다
                this.speed = 0;
                System.out.println("[3] 브레이크를 밟았습니다. 차를 정지시킵니다.");
            }else {
                System.out.println("[3] 차는 이미 정지되어 있는 상태입니다.");
            }
        } else {
            System.out.println("[3] 현재 차의 시동이 걸려있지 않습니다! 먼저 차에 시동을 걸어주세요.");
        }
    }

    //4. turnOff() : 시동이 걸려있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없다.
    public void turnOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("[4] 달리는 도중에는 시동을 끌 수 없습니다! 먼저 차를 정지시켜 주세요.");
            } else {
                this.isOn = false;
                System.out.println("[4] 시동을 끕니다. 다시 운행하시려면 시동을 걸어주세요.");
            }
        } else {
            System.out.println("[4] 이미 시동이 꺼진 상태입니다.");
        }
    }
}
