package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6 {
//실습 문제 6: 양의 정수의 합 구하기
//사용자로부터 양의 정수들을 계속 입력받되,
//사용자가 0을 입력하면 입력을 중단하고 그때까지 입력받은 양의 정수들의 총합을 출력하는 프로그램을 작성하세요.
//do-while 루프를 사용하여 구현하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("숫자를 입력하세요: ");
            int num = scanner.nextInt();
        } catch (InputMismatchException miss) {
            System.out.println("잘못된 입력입니다.");
        }
        scanner.close();
    }
}
