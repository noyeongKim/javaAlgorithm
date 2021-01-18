package functionTest.buffered;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        /*
        java.util.Scanner => java.io.BufferedReader 대체
        버퍼에 데이터를 기록하는 방식으로 속도 향상이 된다.

        System.out.print() => java.io.BufferedWriter 대체
        버퍼에 기록되어있는 데이터를 출력한다.
         */

        // BufferedReader 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // BufferedWriter 객체 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 예외 처리
        try{
            String[] strArr = br.readLine().split(" ");
            int a = 0;
            for(int i = 0; i < strArr.length; i ++){
                a += Integer.parseInt(strArr[i]);
            }

            String res = String.valueOf(a);
            bw.write(res);    // 출력내용 작성
            bw.newLine();               // 줄바꿈
            bw.flush();                 // 버퍼에 있는 모든 데이터를 출력
            bw.close();                 // BufferedWriter 종료

            br.close();                 // BufferedReader 종료
        }catch (IOException i){
            i.printStackTrace();
        }
    }

}
