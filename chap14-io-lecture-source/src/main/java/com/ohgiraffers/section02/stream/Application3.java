package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표. FileOutputStream을 이해하고 사용할 수 있다.*/

        /*필기. FileOutputStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림으로 1바이트 단위로 데이터를 처리한다.
        * */

        FileOutputStream fout = null;   //스트림인 fout은 사용하고 나면 꼭 닫아야한다.
        try {
            /*설명.
            * 매개변수가 2개짜리 생성자도 존재하는데, 두번째 전달인자로 true를 전달하면 이어쓰기(append)를 허용한다.
            * FileOutputStream의 디폴트 설정으로는 false로 설정되어 있으며 이어쓰기가 아닌 달어쓰기다.
            * */
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");   //매개변수 있는 생성자 호출하는 구문
            /*설명.
            * 여기까지 작성한 후 main() 메서드를 실행해보면 파일이 존재하지 않는데도 불구하고
            * FileNotFoundException이 발생하지 않는다.
            * 왜냐하면 OutputStream은 결국 파일을 만들어내는 것이 목적이기 때문에 파일이 존재하지 않아도 자동으로 생성한다.
            * */

            /*설명.
            * FileInputStream에서 read() 메서드를 사용했다면, FileOutputStream은 write() 메서드를 사용한다.
            * 사용법은 거의 동일하고 데이터를 읽고 쓰는 방향만 반대로 되었다고 이해하면 편하다.
            * write() 메서드는 총 3가지로 오버로딩되어있다.*/

            fout.write(97);     //a 기록됨.

            byte[] bArr = new byte[] {98, 99, 100, 101, 102, 10};
            fout.write(bArr);   //bcdef + LF(개행) 기록됨.

            fout.write(bArr, 2, 3); //off는 2번인덱스라는 뜻이다. def 기록됨.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fout != null) {
                try{
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
