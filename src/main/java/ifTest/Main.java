package ifTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 문제번호 1330. 두 수 비교 하기
        /*
         첫째 줄에 다음 세 가지 중 하나를 출력한다.

         A가 B보다 큰 경우에는 '>'를 출력한다.
         A가 B보다 작은 경우에는 '<'를 출력한다.
         A와 B가 같은 경우에는 '=='를 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /*int b = sc.nextInt();
        if(a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }*/

        ////////////////////////////////////////////////////////////////////////////////////////////
        // 2020.12.08

        /*
        문제번호 9498. 성적 표시
        시험 점수를 입력받아
        90 ~ 100점은 A,
        80 ~ 89점은 B,
        70 ~ 79점은 C,
        60 ~ 69점은 D,
        나머지 점수는 F를 출력하는 프로그램을 작성하시오.
         */

        /*if(a >= 90 && a <= 100){
            System.out.println("A");
        } else if (a >= 80 && a <= 89) {
            System.out.println("B");
        } else if (a >= 70 && a < 80) {
            System.out.println("C");
        } else if (a >= 60 && a < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }*/

        /*
        문제번호 2753. 윤년표시
        연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
        1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
        하지만, 2000년은 400의 배수이기 때문에 윤년이다.
         */

        if((a % 4 == 0) && (a % 100 != 0 || a % 400 == 0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
