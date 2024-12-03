package day02;

public class If1 {
    public static void main(String[] args) {

        int num = 10;

        if (num > 0) {
            System.out.println("양수");
        } else if (num == 0) {
            System.out.println("0이다.");
        } else {
            System.out.println("음수");
        }

        int value;

        if (num % 2 == 0) {
            value = 10;
        } else{
            value = 30;
        }
        System.out.println(value);

    }
}
