package com.ohgiraffers.section01.extend;

/*목차. 1. extends 키워드를 이용해 car 클래스 상속받기.*/
/*설명.
*Car 클래스를 부모 클래스 삼아서 FireCar를 자식 클래스로 사용할 것이다.
* 클래스 선언부에 extends 키워드를 사용해 Car 클래스를 상속 받는다.
* 그러면 FireCar는 부모 클래스인 Car가 가지고 있는 모든 멤버(필드, 메서드)를 상속 받는다.
* 단 부모 클래스의 생성자는 상속받지 못한다.
* 또한 부모가 가지고 있는 private접근 제어자로 설정된 멤버(필드, 메서드) 또한 접근 불가능하다.
* */
public class FireCar extends Car {

    /*기본생성자 Alt Insert Constructor 사용*/
    public FireCar() {

        /*필기 super():
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동으로 추가해준다.
        * 부모의 기본 생성자를 호출하는 명령여(예약어)다.
        * 해당 생성자가 호출될 시 가장 먼저 Car 클래스의 기본생성자 출력 구문이 등장하고
        * 그 다음 FireCar클래스의 아래 출력문이 등장할 것이다.
        * 명시적, 묵시적 모두 사용 가능하다.
        * */
        super();        //메서드 생성자인 this()의 부모것.
        System.out.println("[FireCar] 기본생성자 호출됨...");
    }

    /*목차. 2. soundHorn()메서드 오버라이딩*/
    /*설명.
    * 소방차의 경적 소리가 너무 작다. 조금 더 크게 키워볼 것이다.
    * 경적 소리를 내는 용도의 메서드 선언부는 그대로 두되, 소방차 쪽에서 재정의(override) 해볼 것이다.*/
    /* 필기.
     *  @Override 어노테이션
     *  JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
     *  (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
     *  오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
     * */
@Override
    public void soundHorn() {       //메서드 선언부 부모꺼 그대로 쓰고, {}블록 안은 내 마음대로 가능

    /* 설명.
     *  주행중 상태인 것을 확인해야 한다.
     *  runningStatus는 private 필드이기에 해당 클래스에서 접근이 불가능하다.
     *  부모가 가지고 있는 public or protected 멤버인 isRunning() 메소드를 사용해야 주행중인 상태인지 확인할 수 있다.
     *  혹은. Car 클래스의 runningStatus를 protected로 변경하면 사용 가능하지만, 권장되지는 않는다. (캡슐화 위배)
     *  this.isRunning() 혹은 super.isRunning 둘 다 사용 가능하며
     *  컴파일러는 기본적으로는 this.을 자동으로 추가한다.
     *  (super.을 명시적으로 사용해야 하는 상황도 존재한다.)
     * private를 public으로 바꾸면 캡슐화가 깨지기 때문에 자식클래스에게 소환까지는 되는 protected로 변경
     * */
        if(isRunning()) {
            //주행중일 때
            System.out.println("[FireCar] 빠아아아아아아아아앙~~~");
        } else {
            //주행중이 아닐 때
            System.out.println("[FireCar] 소방차가 앞으로 갈 수 없습니다~ 길을 비켜주세요~");
        }
    }

    /*목차. 3. 물뿌리는 기능 추가
    * 부모 클래스인 Car는 굳이 물을 뿌릴 필요가 없지만, 이를 물려받은 특수 목적 차량인 FireCar는
    * 부모가 할 수 없는, 즉 자식만이 할 수 있는 특수 기능을 가질 수 있다.
    * */
    public void sprayWater() {
        System.out.println("[FireCar] 불이 난 곳을 발견했습니다! 물을 뿌립니다!!");
    }
}
