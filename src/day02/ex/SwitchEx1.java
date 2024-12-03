package day02.ex;

import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("과일 입력: ");
        String fruit = scanner.nextLine();

        switch (fruit) {
            case "사과":
                System.out.println("사과다!");

            case "바나나":
                System.out.println("바나나다");
            case "포도":
                System.out.println("포도다");
            default:
                System.out.println("나머지 과일이다.");
        }
    }
}

