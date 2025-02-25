package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;             //cpu
    private int hdd;                //하드디스크
    private int ram;                //램
    private String operationSystem; //운영체제

    public Computer() {

        System.out.println("[Computer] 기본생성자 호출됨...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        super();        //부모 클래스의 기본 생성자 호출
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("[Computer] 모든 매개변수 있는 생성자 호출됨...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {

        //부모 클래스 Product의 모든 매개변수 있는 생성자가 호출됨.
        super(code, brand, name, price, manufacturingDate);

        /*설명. 위 super()를 호출하는 것 처럼 똑같이 this()를 활용해보고 싶지만,
        * this(cpu, hdd, ram, operationSystem)를 호출한다는 의미는 super()를 두번 호출하는 것과 같기 때문에 허용하지 않는다.
        * 부모 인스턴스 두 개를 생성할 수는 없기 때문에 부모 생성자는 한 번만 호출 가능하다.*/
//        this(cpu, hdd, ram, operationSystem);

        //나머지 본인의 필드는 본인이 초기화 하면 됨.
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("[Computer] 부모의 필드도 모두 초기화 하는 매개변수 있는 생성자 호출됨...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Computer{" +     //부모인 Product의 getInfo호출
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
