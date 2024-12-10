package practice3;

public class Ex11 {
    //문제 6: 이차원 배열에서의 대각선 요소 합계
    //int 타입의 이차원 배열 matrix가 주어졌을 때, 두 대각선의 요소 합계를 구하는 코드를 작성하세요.
    //배열은 정사각형 배열이라고 가정합니다.
    //int[][] matrix = {
    //    {1, 2, 3},
    //    {4, 5, 6},
    //    {7, 8, 9}
    //};
    //대각선 요소의 합계를 각각 구하고, 그 결과를 출력하세요.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;

        //왼쪽위에서 오른쪽으로 내려가는 대각선의 합
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum1 += matrix[i][i];
        }

        //오른쪽위에서 왼쪽 아래로 내려가는 대각선의 합
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum2 += matrix[i][matrix.length - i - 1];
        }

        //합출력
        int result = diagonalSum1 + diagonalSum2;
        System.out.println("대각선1의 합: " + diagonalSum1);
        System.out.println("대각선2의 합: " + diagonalSum2);
        System.out.println("두 대각선의 합: " + result);
    }
}


