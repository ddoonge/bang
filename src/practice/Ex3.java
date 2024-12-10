package practice;

public class Ex3 {
    //실습 문제 3: 구구단 출력기
    //while 루프를 사용하여 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요.
    //각 단은 한 줄에 하나씩 출력되어야 합니다.
    public static void main(String[] args) {
        int i = 2;
        while (i < 10) {
            int j = 1;// 곱하는 수를 초기화 해줘야지만 J <10 안에 들어서 다시 루프를 돌 수 있음.
            while (j < 10) {
                System.out.print(j + "*" + i + " = " + i*j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
