package forTest.test210118;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        // BufferedReader 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // BufferedWriter 객체 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringBuffer 객체 선언
        StringBuffer sb = new StringBuffer();
        try{
            /*
            * 문제번호 11021
            * A + B - 7
            * 출력형식 : Case #1: 24
            * */
            /*int loop = Integer.parseInt(br.readLine());

            String tmp;
            for(int i = 0; i < loop; i++){
                tmp = br.readLine();
                String[] arr = tmp.split(" ");
                sb.append("Case #"+(i+1)+": "+(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]))+"\n");
            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();*/

            /*
            * 문제번호 11022
            * A + B - 8
            * 출력형식 : Case #1: 1 + 2 = 3
            * */
            int loop = Integer.parseInt(br.readLine());

            StringTokenizer st;
            int a;
            int b;
            for(int i = 0; i < loop; i++){
                st = new StringTokenizer(br.readLine(), " ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                sb.append("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
            }
            br.close();

            bw.write(sb.toString());
            bw.flush();
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
