package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

        /* 목차. 1. 숫자와 숫자의 연산 */
        System.out.println("---------- 1.1 정수와 정수의 연산 ----------");
        /* 필기. 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산(modular)을 사용할 수 있다. */
        System.out.println(123 + 456);
        System.out.println(123 - 456); // 결과 값이 음수여도 잘 나온다.
        System.out.println(123 * 45);
        System.out.println(123 / 10); // 결과 값은 몫
        System.out.println(123 % 10); // 결과 값은 나머지. 여기서 %는 '"모듈러(modular) 연산"'이라고 부른다. 드래그 후 따옴표 누르면 드래그 한 구역 앞뒤로 따옴표가 들어간다.

        System.out.println("---------- 1.2 실수와 실수의 연산 ----------");
        /* 필기. 실수끼리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산(modular)을 사용할 수 있다. */
        System.out.println(123 + 4.56);
        System.out.println(1.23 - 4.56); // 컴퓨터는 실수를 정확하게 표현하기 한계가 있어서 결과값이 오답이라도 최대한 근사한 값이 나온 것임.
        System.out.println(123 * 10.0);
        System.out.println(0.1 * 1000);
        System.out.println(123 / 10.0); // 결과 값은 몫
        System.out.println(123 % 10.0); // 결과 값은 나머지.

        System.out.println("---------- 1.3 정수와 실수의 연산 ----------");
        /* 필기. 정수와 실수의 연산도 수학에서 사용하는 사칙 연산에 나머지를 구하는 연산(modular)을 사용할 수 있다.
        * 정수와 실수 연산의 결과는 항상 실수가 나온다.
        * */
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 목차. 2. 문자의 연산 */ //'홑따옴표'
        System.out.println("---------- 2.1 문자와 문자의 연산 ----------");
        /* 필기.
        * 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다.
        * 지금은 계산 결과가 왜 이렇게 나왔는지 보다는 연산이 사용 가능하다는 것 자체에 집중하자!
        * */
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("---------- 2.2 문자와 정수의 연산 ----------");
        System.out.println('a' + 2); //99
        System.out.println('a' - 2); //95
        System.out.println('a' * 2); //194
        System.out.println('a' / 2); //48.5
        System.out.println('a' % 2); //

        System.out.println("---------- 2.3 문자와 실수의 연산 ----------"); //정수와 실수의 연산과 마찬가지이므로 결과값은 항상 실수형태이다.
        System.out.println('a' + 2.0); //99
        System.out.println('a' - 2.0); //95
        System.out.println('a' * 2.0); //194
        System.out.println('a' / 2.0); //48.5
        System.out.println('a' % 2.0); //

        /* 설명.
        *  여기서 결론은 문자는 내부적으로 숫자 리터럴 취급을 한다는 것이다!
        *  결국 지금까지의 연산은 숫자끼리의 연산을 본 것과 다름 없고, 숫자(정수 혹은 실수) 형태의 겂은
        *  사칙연산과 mod 연산 모두 가능하다는 사실을 유추해볼 수 있다! */

        /* 목차. 3. 문자열의 연산 */ //"쌍따옴표"
        System.out.println("---------- 3.1 문자열와 문자열의 연산 ----------");
        System.out.println("hello" + "world");              //결과 값은 스페이스바 없이 붙어서 나옴. 즉 문자열 합치기, 이어붙이기. concatenation
//        System.out.println("hello" - "world");			//에러 발생
//        System.out.println("hello" * "world");			//에러 발생
//        System.out.println("hello" / "world");			//에러 발생
//        System.out.println("hello" % "world");			//에러 발생

        System.out.println("---------- 3.2 문자열과 다른 형태의 값의 연산 ----------");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");
        System.out.println("1" + "1");

        /* 목차. 4. 논리값의 연산 */
        /* 목차. 4-1. 논리값과 논리값 연산 */
        /* 필기. 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + false);     //에러 발생
//        System.out.println(true - false);     //에러 발생
//        System.out.println(true * false);     //에러 발생
//        System.out.println(true / false);     //에러 발생
//        System.out.println(true % false);     //에러 발생

        /* 목차. 4-2. 논리값과 정수의 연산 */
        /* 필기. 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + 1);         //에러 발생
//        System.out.println(true - 1);         //에러 발생
//        System.out.println(true * 1);         //에러 발생
//        System.out.println(true / 2);         //에러 발생
//        System.out.println(true % 2);         //에러 발생

        /* 목차. 4-3. 논리값과 실수의 연산 */
        /* 필기. 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + 1.0);       //에러 발생
//        System.out.println(true - 1.0);       //에러 발생
//        System.out.println(true * 1.0);       //에러 발생
//        System.out.println(true / 2.0);       //에러 발생
//        System.out.println(true % 2.0);       //에러 발생

        /* 목차. 4-4. 논리값과 문자의 연산 */
        /* 필기. 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다. */
        /* 설명. 이유는, 문자는 내부적으로 숫자 취급을 하기 때문에 결국 논리값과 숫자의 연산과 동일한 의미이다. */
//        System.out.println(true + 'a');       //에러 발생
//        System.out.println(true - 'a');       //에러 발생
//        System.out.println(true * 'a');       //에러 발생
//        System.out.println(true / 'a');       //에러 발생
//        System.out.println(true % 'a');       //에러 발생

        /* 목차. 4-5. 논리값과 문자열의 연산 */ //문자열 이어붙이기라는 뜻.
        /* 필기. 논리값과 문자열의 연산은 '+'연산만 사용 가능하다. */
        /* 설명. 이유는, 위에서 테스트 해 본 문자열 합치기가 되는 원리와 동일하다. */
        System.out.println("========== 논리와 문자열의 연산 ===========");
        System.out.println(true + "a");         //문자열 합치기 됨
//        System.out.println(true - "a");       //에러 발생
//        System.out.println(true * "a");       //에러 발생
//        System.out.println(true / "a");       //에러 발생
//        System.out.println(true % "a");       //에러 발생

    }
}
