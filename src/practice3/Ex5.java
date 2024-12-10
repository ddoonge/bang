package practice3;
//문제 5: 이차원 배열의 선언, 초기화 및 출력
//int 타입의 이차원 배열 matrix를 선언하고, 다음과 같은 형태로 초기화하세요.
//1 2 3
//4 5 6
//7 8 9
public class Ex5 {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] number : numbers) {
            System.out.println();
            for (int i : number) {
                System.out.print(" " + i + " ");
            }
        }
    }
}
