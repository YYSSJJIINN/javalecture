package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. FileReader를 이해하고 사용할 수 있다.*/

        /*설명.
         * FileReader:
         * 앞에서 보았던 FileInputSEtream과 사용법이 거의 유사하다. (어차피 읽어들인다는 큰 개념이 다르지 않기 때문)
         * 단, byte단위가 아니라 character 단위로 읽어들인다는 점이 차이가 있다.
         * 따라서 2byte던 3byte던 글자 단위로 읽어오기 때문에 이제부터는 한글을 정상적으로 읽어올 수 있다.
         * */

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

            int value;

//            while ((value = fr.read()) != -1) {
//                System.out.println(value + ":" + (char) value);
//            }

            /*설명.
            * 한글은 바이트 단위로 표현할 수 없는 글자이기 때문에 유니코드로 여겨야 한다.
            * 따라서 한글을 byte 배열에 읽어오는 경우 당연히 깨지게 되며, 이 때는 char 배열로 읽어들여야 한다.
            * (윗 부분에서 사용한 while문을 주석처리해줘야 글자가 출력된다.)
            * */
            char[] cArr = new char[(int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length()];
            System.out.println("cArr.length = " + cArr.length);

            fr.read(cArr);

            for(int i = 0; i < cArr.length; i++) {
                System.out.println(i + ":" + cArr[i]);
            }

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
