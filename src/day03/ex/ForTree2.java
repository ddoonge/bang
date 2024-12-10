package day03.ex;

public class ForTree2 {
    //문제 : * 로 트리 만들기 리버스 타입
    public static void main(String[] args) {
        int treeCount = 10;
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
