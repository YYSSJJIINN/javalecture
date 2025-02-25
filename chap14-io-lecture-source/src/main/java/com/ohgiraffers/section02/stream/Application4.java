package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        /*수업목표. FileWriter을 이해하고 사용할 수 있다.*/

        /*필기. FileWriter
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림으로 1바이트 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;   //스트림인 fout은 사용하고 나면 꼭 닫아야한다.
        try {
            /*설명.
             * 매개변수가 2개짜리 생성자도 존재하는데, 두번째 전달인자로 true를 전달하면 이어쓰기(append)를 허용한다.
             * FileWriter의 디폴트 설정으로는 false로 설정되어 있으며 이어쓰기가 아닌 달어쓰기다.
             * */
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            /*설명.
             * 여기까지 작성한 후 main() 메서드를 실행해보면 파일이 존재하지 않는데도 불구하고
             * FileNotFoundException이 발생하지 않는다.
             * 왜냐하면 Writer은 결국 파일을 만들어내는 것이 목적이기 때문에 파일이 존재하지 않아도 자동으로 생성한다.
             * */

            fw.write('a');
            fw.write(65);

            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});     //문자를 배열로 바꾸기

            fw.write("새해 복 많이 받으세요~");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try{
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
