package forTest.test201208;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        /*
        문제번호 2739. 구구단단
        */
        /*
        int a = sc.nextInt();
        for(int i = 0; i < 9; i++){
            i++;
            System.out.println(a + " * " + i + " = " + (a * i ));
            i--;
        }*/

        /*
        문제번호 10950. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성
        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
         */

        /*int t = sc.nextInt();
        int a;
        int b;
        for(int i = 0; i < t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }*/

        /*
        문제번호 8393. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        1부터 n까지 합을 출력한다.
         */

        /*int a = sc.nextInt();
        int res = 0;
        for(int i = 0; i < a; i++){
            res = res + i + 1;
        }
        System.out.println(res);*/

        /*
        문제번호 15552. 빠른 A+B
        java의 경우 scanner, System.out.print 대신 BufferedReader, BufferedWriter
        를 사용할 것
         */

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        try{
            int roop = Integer.parseInt(br.readLine());
            for(int i = 0; i < roop; i++){
                int a = 0;
                String[] strArr = br.readLine().split(" ");
                for(int j = 0; j < strArr.length; j++){
                    a += Integer.parseInt(strArr[j]);
                }
                sb.append(a + "\n");
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();
        }catch (IOException io){
            System.out.println(io.getMessage());
        }*/

        /*
        문제 2741. N찍기
        1부터 N만큼 숫자 찍어내기
         */
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int roop = Integer.parseInt(br.readLine());
            for(int i = 0; i < roop; i++){
                bw.write(String.valueOf(i+1));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        문제 2741. N찍기
        N부터 1까지 숫자 찍어내기
         */

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int roop = Integer.parseInt(br.readLine());
            for(int i = 0; i < roop; i++){
                bw.write(String.valueOf(roop-i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


    }
}
