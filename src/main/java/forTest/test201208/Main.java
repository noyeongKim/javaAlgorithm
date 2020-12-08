package forTest.test201208;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /*
        문제번호 2739. 구구단단
        */

        for(int i = 0; i < 9; i++){
            i++;
            System.out.println(a + " * " + i + " = " + (a * i ));
            i--;
        }
    }
}
