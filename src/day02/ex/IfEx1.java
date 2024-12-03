package day02.ex;

public class IfEx1 {
    public static void main(String[] args) {
        int num = 17;

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("2와 3의 공배수이다");
        } else if ( num % 2 == 0) {
            System.out.println("2의 배수이다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수이다.");
        } else {
            System.out.println("2,3,6과는 친구아님.");
        }
    }
}
