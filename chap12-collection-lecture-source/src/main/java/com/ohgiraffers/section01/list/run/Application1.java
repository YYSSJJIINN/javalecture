package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */
        /* 필기.
         *  컬렉션 프레임워크(Collection Framework)
         *  자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         *  표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
         *  즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다. */

        /* 필기.
         *  Collection Framework는 크게 3가지 인터페이스중 한 가지를 상속받아 구현해 놓았다.
         *  1. List 인터페이스
         *  2. Set 인터페이스
         *  3. Map 인터페이스
         *
         * 필기.
         *  List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
         *  하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
         * */

        /* 필기.
         *  각 인터페이스 별 특징
         *  1. List 인터페이스
         *   - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
         *   - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
         *  2. Set 인터페이스
         *   - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
         *   - HashSet, TreeSet 등이 있다.
         *  3. Map 인터페이스
         *   - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
         *   - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
         *   - value는 중복된 값을 저장할 수 있다.
         *   - HashMap, TreeMap, HashTable, Properties 등이 있다.
         *  */

        /* 설명.
         *  List와 Set의 공통인 Collection 인터페이스 주요 메소드
         *  add(), clear(), contains(), equals(), isEmpty(),
         *  iterator(), remove(), size(), toArray() 등이 있다.
         *  */

        /* 설명. 그 중 먼저 List 계열을 컬렉션 클래스부터 살펴 보자 */

        /* 필기.
         *  List 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복 저장을 허용한다.
         *  ArrayList, LinkedList, Vector, Stack이 있다.
         * */

        /* 설명. 그 중 ArrayList를 먼저 살펴보도록 하자 */

        /* 필기.
         *  ArrayList
         *  가장 많이 사용되는 컬렉션 클래스 이다.
         *  JDK 1.2부터 제공된다.
         *  내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
         *
         * 필기.
         *  ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
         *  배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
         *  ArrayList는 저러한 배열의 단점을 보완하고자
         *  크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
         *  자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
         * */

        /*설명. ArrayList는 인스턴스를 생성할 때 내부적으로 10칸짜리 배열을 생성해서 관리한다.*/
        ArrayList alist = new ArrayList();  //레퍼런스 타입인데 run 돌렸지만 주소가 나오지 않음.

        /*설명. 다형성을 적용해서 상위 타입인 List를 통해 ArrayList 객체를 만들수도 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입을 유연하게 변경할 수 있기 때문에
        * 일반적으로 레퍼런스 타입을 List로 해두는 관례가 많다.
        * */
        List list = new ArrayList();    //가장 일반적으로 많이 생성하는 방식(다형성을 이용한 확장성 확보)

        /*설명. 더 상위 타입인 Collection 타입을 사용할 수도 있다.*/
        Collection clist = new ArrayList();

        /*설명.
        * ArrayList는 저장 순서가 유지되며 index 개념이 존재한다.
        * 또한 ArrayList는 Object 클래스의 하위 타입 인스턴스(레퍼런스 타입만 가능)를 모두 저장해줄 수 있다.
        * */
        alist.add("apple");
        alist.add(123);     //오토박싱 래핑 Integer.valueOf(123)
        alist.add(45.67);   //오토박싱 래핑 Double.valueOf(45.67)
        alist.add(new Date());

        /*설명.
        * ArrayList는 내부적으로 toString()이 오버라이딩 되어 있기 때문에 간편하게 리스트 내 요소들을 출력할 수 있다.
        * */
        System.out.println("alist = " + alist);     //요소를 입려갛ㄴ 순사가 그대로 보장되어 있음.

        /*설명.
        * ArrayList의 크기는 size() 메서드를 호출해서 확인할 수 있다.
        * 단, size() 메서드는 배열의 크기가 아닌 요소(element)의 개수를 반환해준다.
        * 내부적으로 관리되는 배열의 크기 자체는 외부에서 알 필요가 없기 때문에 해당 기능은 제공하지 않고 있다.
        * (어차피 필요에 따라 줄어들거나 늘어나거나 하기 때문)
        * */
        System.out.println("alist.size() = " + alist.size());   //4 (10 아님)  길이를 반환해준다.

        for(int i = 0; i < alist.size(); i++){  //들어있는 요소의 개수만큼 반복
//            alist.get(i);
            System.out.println(i + " = " + alist.get(i));
        }

        /*설명. 중복 허용해줌. (어차피 인덱스로 찾으면 못 찾거나 중복된 값이 나올 확률이 0%이기 때문)*/
        alist.add("apple");
        System.out.println("alist = " + alist);
        
        /*설명.
        * 원하는 인덱스 위치에 요소를 추가할 수도 있다.
        * 값을 중간에 삽입(insert)하는 경우 인덱스 위치에 덮어쓰는 것이 아니라
        * 새로운 값이 들어갈 인덱스 위치에 값을 삽입하고 그 뒤의 인덱스는 하나 씩 밀리게 된다.
        * */
        alist.add(1, "banana");    //매개변수 2개짜리로 선택
        System.out.println("alist = " + alist);

        /*설명.
        * 저장된 값을 삭제할 때는 remove() 메서드를 사용할 수 있다.
        * 중간 인덱스의 값을 삭제할 때는 자동으로 인덱스를 하나 씩 앞으로 당겨준다.
        * 또한 인덱스 외에 저장된 값을 검색해서 삭제할 수도 있는데, 중복되는 값일 경우 낮은 인덱스부터 검색해서 삭제한다.*/
        alist.remove(2);    //int indext선택. 2번인덱스 값 삭제하고 땡긴다.
        System.out.println("alist = " + alist);
        alist.remove("apple");  //object o 선택. apple 삭제인데 우린 2개가 있다.
        alist.remove("apple");  //하나만 적으면, 0번인덱스인 앞에 꺼만 삭제되고, 두 줄 적으면 두 개 다 삭제된다.
        System.out.println("alist = " + alist);

        /*설명.
        * 특정 인덱스를 전달인자로 전달하면 해당 위치의 값을 두 번째 전달인자로 덮어쓸 수 있다.
        * 이 때 set() 메서드를 사용하면 된다.*/
        alist.set(1, false);
//        alist.set(1, Boolean.valueOf(false)); //원래 이렇게 적어야 하는데, 오토박싱됐음.
        System.out.println("alist = " + alist);
        
        List<String> strList = new ArrayList<>();   //이제 String만 들어올 수 있음.
        
        strList.add("apple");
//        strList.add(123);     //String이 아니기 때문에 파싱하지 않는 한 에러가 발생함.
        strList.add("banana");
        strList.add("orange");
        strList.add("melon");
        strList.add("grape");
        strList.add("watermelon");

        System.out.println("strList = " + strList);

        /*설명.
        * Collection 인터페이스가 아닌, Collections 클래스에서 제공하는 sort()라는 static 메서드를
        * 사용해 손쉽게 정렬을 구현할 수 있다.
        * 이 Collections 클래스는 Collection에서 사용되는 여러 유용한 기능들을 static 메서드로 구현해놓은 클래스다.
        * (일반적으로 인터페이스명 뒤에 's'가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스임을 암시한다.)
        * */
        Collections.sort(strList);
        System.out.println("strList = " + strList);

        /*설명.
        * 조금 복잡하지만 내림차순 정렬도 시켜볼 수 있다.
        * 다만, ArrayList는 내림차순 정렬을 해주는 기능이 제공되지 않기 때문에
        * 다형성을 적용해 LinkedList로 바꿔준 후 descendingIterator() 메서드를 사용해줘야 한다.
        * */
        System.out.println("========== ArrayList to LinkedList ==========");
        System.out.println(strList.getClass().getName());
        //특정 레퍼런스 변수의 타입을 뽑는 구문(자주 쓰는 편)
        strList = new LinkedList<>(strList);
        //매개변수 있는 생성자로 호출. 근데 ArrayList를 LinkedList에게 넘겨버린..
        //다형성이 적용되어 ArrayList를 LinkedList타입으로 재할당 가능
        System.out.println(strList.getClass().getName());

        /*설명.
        * Iterator 반복자 인터페이스를 활용해 역순으로 정렬한다.
        * (이때, 제네릭 문법을 사용해주는 것이 좋다.)
        * LinedList타입으로 형변환 한 후 descendingIterator() 메서드를 호출하면
        * 내림차순으로 정렬이 완료된 Iterator타입의 목록을 반환해준다.
        *
        * 설명. 반복자(Iterator)란?
        * Collection 인터페이스의 iterator()메서드를 이용해 Iterator타입의 인스턴스르르 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
        * 주로 반복자라고 부르며 반복문을 이용해 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인텍스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나 씩 접근하는 것이 불가능하기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * - hasNext() : 다음 요소를 가지고 있는 경우 true를, 더이상 뒤에 요소가 없는 경우 false를 반환.
        * - next() : 다음 요소를 반환(한 후 커서 이동)
        * */
        Iterator<String> strIter = ((LinkedList<String>)strList).descendingIterator();
        //strList를 <>제네릭이 걸려있는 LinkedList로 형변환 하기 위해 (LinkedList<String>)사용

        int count = 0;

//        while(strIter.hasNext()) {   //인덱스가 없어서 for문이 아닌 while문 사용
//            System.out.println(count + " : " + strIter.next());
//            count ++;
//        }
//        /*설명. 이미 요소를 다 꺼내 쓴 반복자는 재사용 불가능(hasNext()가 false를 반환하기 때문.)*/
//        while(strIter.hasNext()) {   //인덱스가 없어서 for문이 아닌 while문 사용
//            System.out.println(count + " : " + strIter.next());
//            count ++;
//        }
        
        /*설명. 역순으로 정렬된 결과를 저장하기 위해서는 새로운 ArrayList를 생성해 옮겨 담으면 된다.*/
        List<String> descList = new ArrayList<>();

        while(strIter.hasNext()) {
            descList.add(strIter.next());
        }
        System.out.println("descList = " + descList);
    }
}
