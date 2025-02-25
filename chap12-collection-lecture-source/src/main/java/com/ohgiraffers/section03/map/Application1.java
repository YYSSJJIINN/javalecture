package com.ohgiraffers.section03.map;

import javax.xml.crypto.Data;
import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        /* 필기.
         *  Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         *  키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 필기.
         *  키(key)란?
         *  값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         * 필기.
         *  HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *  HashMap이 가장 많이 사용되며 HashTable은 JDK 1.0부터 제공되며
         *  HahaMap과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 HashMap을 사용하는 것이 좋다.
         * */

        /* 필기.
         *  HashMap
         *  JDK 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         *  */

        /*설명. HashMap 인스턴스 생성(다형성 적용 가능)*/
//        Map hmap = new HashMap();
        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "white apple");    //오토박싱
        hmap.put(3.3, 321);             //오토박싱
        System.out.println("hmap = " + hmap);

        /*설명. Key값은 중복을 허용하지 않음.*/
        hmap.put(12, "white apple");
        System.out.println("hmap = " + hmap);

        /*설명. Value 값은 중복을 허용한다.*/
        hmap.put(13, "white apple");
        hmap.put(14, "white apple");
        System.out.println("hmap = " + hmap);

        /*설명. 저장된 Value값을 조회하기 위해서는 Key 값을 전달인자로 하여 get()메서드를 호출하면 된다.*/
        System.out.println(hmap.get(12));       //오토박싱이 되며 정수타입 리터럴이 오브젝트로

        /*설명. 저장된 entry를 삭제할 때 : remove(Object key)*/
        hmap.remove(3.3);
        System.out.println("hmap = " + hmap);

        /*설명. 저장된 entry의 개수를 출럭*/
        System.out.println("hmap.size() = " + hmap.size());

        //====================================================

        /*설명. 제네릭을 명시하여 Key와 Value 객체 모두 String 타입만 허용하도록 제한한 인스턴스 생성*/
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 17");
        hmap2.put("two", "mysql 8");
        hmap2.put("three", "jdbc 4");
        hmap2.put("four", "html 5");
        hmap2.put("five", "css 3");

        System.out.println("hmap2 = " + hmap2);

        /*목차. 1. keySet()을 이용해 Key 객체들만 따로 Set 컬렉션으로 만들고, iterator()메서드로 Key에 대한 목록을 만든다.*/
//        Set<String> keys = hmap2.keySet();              //Map<K, V> -> Set<K>
//        Iterator<String> keyIter = keys.iterator();     //Set<K> -> Iterator<K>
        Iterator<String> keyIter = hmap2.keySet().iterator();   //한줄로 Map<K, V> -> Set<K> -> Iterator<K>

//        while(keyIter.hasNext()) {
//            String key = keyIter.next();
//            System.out.println(key);
//        }
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }
        
        /*목차. 2. values()를 이용해 Value 객체들만 Collection으로 만든다.*/
        Collection<String> values = hmap2.values();     //Map -> Collection<V>
        Iterator<String> valueIter = values.iterator(); //Collection -> Iterator<V>
        System.out.println("values = " + values);

        while(valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        /*목차. 3. Map의 내부 클래스인 EntrySet 클래스를 이용 : entrySet()*/
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
//            System.out.println(entry);
            System.out.println(entry.getKey() + "가 Key값, " + entry.getValue() + "가 Value값");    //깔끔하게 출력
        }
    }
}