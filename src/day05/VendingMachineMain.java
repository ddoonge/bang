package day05;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine machine = new VendingMachine();

        System.out.println("1. 콜라 || 2. 사이다 || 3. 환타");
        System.out.print("음료 번호는 입력하세요: ");
        int num = scanner.nextInt();
        String result = machine.pushProductButton(num);
        System.out.println(result);

    }
}
