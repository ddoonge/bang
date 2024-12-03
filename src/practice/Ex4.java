package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    //실습 문제 4: 팩토리얼 계산기
    //사용자로부터 정수 n을 입력받아, 1부터 n까지의 곱(팩토리얼)을 계산하는 프로그램을 작성하세요.
    //예를 들어, 사용자가 5를 입력하면, 5! = 120을 출력하세요. for 또는 while 루프를 사용하여 구현하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("양의 정수를 입력하세요 : ");
            int num = scanner.nextInt();

            int mul = 1;
            if (num <= 0) {
                System.out.println("양의 정수를 입력하세요.");
                return;
            } else {
                for (int i = 1; i <= num; i++) {
                    mul *= i;
                }
                System.out.println(num + "!" + " = " + mul);
            }
        } catch (InputMismatchException e) {
            System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
        }
        scanner.close();
    }
}

