package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

//    String name;
//    int hp;
//
//    public void setInfo(String name) {
//        this.name = name;       //name이 setInfo의 스코프 바깥에 있으므로 this 사용
//    }
//
//    public void setHp(int hp) {
//        if (hp > 0) this.hp = hp;     //hp가 setHp의 스코프 바깥에 있으므로 this 사용
//        else this.hp = 0;
//    }
//
//    public String getInfo() {
//        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
//
//    }

    //=======================================================

    /*설명. 해당 클래스의 설계가 변경되었다. (String name -> String kinds)
     * 따라서  setInfo()메서드와 getInfo()메서드는 어쩔 수 없이 변경해야 한다.
     * 그러나 사용자(=클라이언트)의 호출 코드는 변경하지 않아도 된다.
     * 즉, 해당 클래스를 가지고 객체를 생성하는 Application 클래스에서는 변경할 내용이 하나도 없다.
     * */
    String kinds;
    int hp;

    public void setInfo (String kinds){
        this.kinds = kinds;       //name이 setInfo의 스코프 바깥에 있으므로 this 사용
    }

    public void setHp ( int hp){
        if (hp > 0) this.hp = hp;     //hp가 setHp의 스코프 바깥에 있으므로 this 사용
        else this.hp = 0;
    }

    public String getInfo () {
        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}