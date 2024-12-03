package day01;

public class Rectangle2 {

    public static void main(String[] args) {
        //반목문
        //while
        //데이터 = 값 = 리터럴... 1. 반드시 값을 담는 그릇이 필요함. 이것이 변수.
        //변수 - 타입이 중요한 언어. (어떤 값을 담을 그릇.)
        //java는 값의 종류에 따라 다른 그릇을 사용한다.
        //만약 다용도 그릇을 쓰게 된다면 컴파일 했을 때, 오류가 생기지 않아서 문제가 생길 수 있다.
        //근데 자바는 다행히 다용도 그릇이 없다!!.
        //변수의 타입: 값(숫자(정수, 실수)을 직접담는 그릇./ 주소를 담는 그릇.

        // 정수를 담는 그릇 : int 타입
        int i = 1;

        while (i <= 10) {
            System.out.println("**********");
            i++; // or i = i + 1;
        }
    }
}