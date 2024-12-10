package day03;

public class Array2 {
    public static void main(String[] args) {
        int[][] iarr1 = {{1, 2, 3}, {4, 5, 6,}};
        int[][] iarr2 = new int[2][3];
        System.out.println(iarr1[0][1]);

        int[][] iarr = new int[3][];
//        int[0][0]; 컴파일 오류 아직 1차원 배열이 생성되지 않았기 떄문.
        iarr[0] = new int[2];
        iarr[0][1] = 10;

        iarr[1] = new int[4];
        iarr[1] = new int[5];

        System.out.println(iarr[0][1]);
    }
}
