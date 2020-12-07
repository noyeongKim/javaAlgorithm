package basicTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();

        // a+b출력
        //System.out.println(a+b);

        // a-b출력
        //System.out.println(a-b);

        //a/b출력 (단 10^-9의 오차까지만 허용)
        //System.out.println(a/b);

        //a*b출력 (단 10^-9의 오차까지만 허용)
        //System.out.println(a*b);

        //사칙연산 값 출력. 1번째 a+b / 2번째 a-b / 3번째 a*b / 4번째 a/b / 5번쨰 a%b
        /*System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);*/

        //나머지 출력. 첫째 줄에 (a+b)%c, 둘째 줄에 ((a%c) + (b%c))%c, 셋째 줄에 (a×b)%c, 넷째 줄에 ((a%c) × (b%c))%c를 출력
        /*System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);*/

        //세자리수 a와 b의 곱셈이 이루어질 경우. a와 b의 1,10,100의 자리의 곱을 각각 구하고 a*b의 최종값을 표시
        /*System.out.println(a * (b%10));
        System.out.println(a * ((b/10)%10));
        System.out.println(a * (b/100));
        System.out.println(a * b);*/

    }
}
