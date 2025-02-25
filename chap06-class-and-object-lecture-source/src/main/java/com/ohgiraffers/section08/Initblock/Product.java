package com.ohgiraffers.section08.Initblock;

public class Product {

    //FIELD
    /*목차. 1. 필드를 초기화하지 않으면 JVM이 정한 기본값으로 객체가 초기화된다.*/
    //이 부분들은 초기화 없이 선언만 한 것이다.
//    private String name;        //null
//    private int price;          //0
//    private static String brand;//null

    /*목차. 2. 명시적 초기화로 필드 초기화 확인.*/
    private String name = "갤럭시S";        //null
    private int price = 2000000;            //0
    private static String brand = "샘송";   //null

    /*목차. 3. 인스턴스 초기화 블럭*/
    {
        name = "싸이언";
        price = 800000;
        /*주의사항.
        * 인스턴스 초기화 블럭에서는 static 필드를 초기화할 수 있는 것 처럼 보인다.
        * 그러나 static 초기화 블럭은 클래스가 로드되는 시점에서 이미 기본값으로 초기화를 진행한 상태다.
        * 따라서 인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화가 진행된 ("사과")정적 필드에
        * 인스턴스 초기화 블럭에서 대입한 값 ("럭키")으로 덮어 쓴 것이다.*/
        brand = "럭키";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    static {        //정적 초기화 블럭
        /*주의사항.
        * static 초기화 블럭에서는 non-static필드는 초기화시킬 수 없다.
        * 정적 초기화 블럭은 클래스 로드 시 동작한다.
        * 따라서 정적 초기화 블럭의 동작 시점은 인스턴스가 생길 수 있는 시점보다 훨씬 이른시기이기 때문에
        * 인스턴스가 존재할 수 없는 태초의 시기다.
        * 그러므로(아직은)존재하지 않는 인스턴스 변수에 값을 초기화한다는 행위 자체가 시기적으로 불가능하다.
        * */
//        name = "사과폰";       //시간 순서 상으로 인스턴스가 만들어져야 의미가 있음
//        price = 1900000;       //시간 순서 상으로 인스턴스가 만들어져야 의미가 있음
        brand = "사과";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    //CONSTRUCTOR
    public Product() {
        System.out.println("기본생성자 호출됨...");
    }

    /*목차. 4. 매개변수 있는 생성자:
    * 위에서 초기화된 값들이 무의미해지고, 결국 생성자에게 작성한 초기 리터럴을 기반으로 인스턴스를 초기화시킨다.
    * */
    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    //METHOD
    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + brand +        //static field를 인위적으로 작성.
                '}';
    }
}
