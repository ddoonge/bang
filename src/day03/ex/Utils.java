package day03.ex;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {

        //입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println("=====================");

        //랜덤값 받기
        Random random = new Random();

        int randomNum = random.nextInt(100) + 1;
        System.out.println(randomNum);
    }
}
