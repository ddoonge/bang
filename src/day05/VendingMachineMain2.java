package day05;

import java.util.Scanner;

public class VendingMachineMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine machine = new VendingMachine();

        System.out.println("1. 콜라 || 2. 사이다 || 3. 환타");
        System.out.println("종료를 원하시면 0 을 입력하세요.");

        int menu = 0;
        do {
            System.out.print("음료 번호는 입력하세요: ");
            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("자판기 종료");
                break;
            }

            if (menu < 1 || menu > 3) {
                System.out.println("아직 준비되지 않은 메뉴입니다. 다시 선택해 주세요.");
            } else {
                System.out.println(machine.pushProductButton(menu) + " 나왔습니다.");
            }
        } while (menu != 0);
    }
}
