package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
         *  또 다른 배열에 복사를 해 놓은 것이다.
         *  서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
         *  하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
         * */

        /* 필기.
         *  깊은 복사를 하는 방법은 4가지가 있다.
         *  1. for문을 이용한 동일한 인덱스의 값 복사
         *  2. Object의 clone()을 이용한 복사
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
         *  이 중 가장 높은 성능을 보이는 것(=3번)은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이며
         *  가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf() 메소드 이다.
         *  clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 가지고
         *  그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징을 가지고 있다.
         * */

        /*목차. 1. for문을 이용한 동일한 인덱스의 값 복사*/
        int[] originArr = new int[] {1, 2, 3, 4, 5};
        printArray(originArr);

        int[] copyArr = new int[5];
        for (int i = 0; i < originArr.length; i++) {
            copyArr[i] = originArr[i];
        }
        printArray(copyArr);

        /* 목차. 2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();

        printArray(copyArr2);            //동일한 길이, 동일한 값을 가지는 배열이 생성되어 복사되며, 다른 주소를 가지고 있다.

        /* 목차. 3. System의 arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[10];

        /* 설명. 첫번째 전달인자는 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이 의미를 가진다. */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);

        printArray(copyArr3);            //복사한 만큼의 값은 같지만 길이도 다르고 주소도 다르다

        /* 목차. 4. Arrays의 copyOf()를 이용한 복사 */
        /* 설명. 시작인덱스부터 원하는 길이만큼만 복사해서 사용 가능하다. */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);

        printArray(copyArr4);            //복사한만큼의 값은 같지만 길이도 다르고 주소도 다르다.
    }

    public static void printArray(int[] iArr) {

        System.out.println("1. iArr의 hashCode = " + iArr.hashCode());

        System.out.println("2. iArr의 모든 요소들의 값 = ");
        for(int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i] + " ");
        }
        System.out.println();
    }
}
