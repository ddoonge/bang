package practice3;

public class Ex1 {
    public static void main(String[] args) {
        //문제 1: 기본형 배열 선언과 초기화
        //int 타입의 배열 numbers를 선언하고, 크기가 10인 배열로 초기화하세요.
        //배열의 모든 요소를 0부터 9까지의 숫자로 초기화하는 코드를 작성하세요.
        int[] numbers = new int[10];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
