package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        boolean isNumberSame = true;
        boolean valid = false;
        while (!valid) {
            try {
                while (isNumberSame) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("1 - 10 사이의 숫자를 입력하세요 : ");
                    int num = scanner.nextInt();
                    if (num > 10 || num < 1) {
                        System.out.println("1 - 10까지 숫자를 입력하세요.");
                    } else if (num > Integer.parseInt(args[0])) {
                        System.out.println("더 낮습니다.");
                    } else if (num < Integer.parseInt(args[0])) {
                        System.out.println("더 높습니다.");
                    } else {
                        if (num == Integer.parseInt(args[0])) {
                            System.out.println("정답입니다!");
                            isNumberSame = false;
                            valid = true;
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
    }
}
