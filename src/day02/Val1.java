package day02;

public class Val1 {
    public static void main(String[] args) {

        //자바는 객체지향 언어.
        //기본형 (숫자, 문자, 불린...) -- 자바세상에 존재하는 소수민족.
        //기본형에는 논리형, 문자형, 정수형, 실수형이 존재
        //논리형 타입은 boolean 키워드
        //정수형 타입은 byte, short, int, long 키워드
        //실수형 타입은 float, double 키워드
        //문자형 타입은 char 키워드
        //예외 String은 기본 타입이 아니라 참조형 타입이다.
        // +++ 나머지는
        //레퍼런스(참조형) 타입

        //정수형 타입
        byte b =123;
        short sh = 10;
        int i = 100000;
        long l = 10000000000000L;
        //실수형 타입
        float f = 1.0f; // f가 들어감
        double d = 1.2;
        //문자열 타입
        char c = 'a';
        //논리형 타입
        boolean boo = true;
        //참조형 타입(레퍼런스 타입)
        String str = "abc";

        //변수 타입의 min,max 확인 방법.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
