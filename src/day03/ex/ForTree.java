package day03.ex;

public class ForTree {
    //문제 : * 로 트리 만들기
    public static void main(String[] args) {
        int treeCount = 10;
        for (int i = 1; i <= treeCount; i++) {
            for (int j = 1; j <= treeCount - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============================\n거꾸로 된 트리 만들기");
        for (int i = 1; i <= treeCount; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*treeCount - 2*i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
