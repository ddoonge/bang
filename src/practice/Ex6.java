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
        int sum = 0;
        do {
            try {
                System.out.print("숫자를 입력하세요(0을 입력하면 프로그램이 종료됩니다.): ");
                int num = scanner.nextInt();
                if (num < 0) {
                    System.out.println("양의 정수를 입력하세요.");
                    break;
                } else if (num == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("현재까지 입력받는 숫자의 합: " + sum);
                    break;
                } else {
                    sum += num;
                }
            } catch (InputMismatchException miss) {
                System.out.println("잘못된 입력입니다.");
                break;
            }
        } while (true);
    }
}
