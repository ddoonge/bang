package day03;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        //배열
        //배열을 선언, 사용
        //변수 선언... 타입 변수명
        //문법: 타입[] 배열명 : ---- 배열을 선언하는 문법이다.
        //배열은 안에 들어갈수 있는 갯수가 고정이다.
        //배열은 기본타입으로 들어갈 수 있다.

        int[] numbers; // 이상태는 배열을 선언만 한 것이고,, 배열은 참조(레퍼런스)형 타입이다.
        numbers = new int[5]; //배열은 주소값만 가지고 있어서 참조형 타입이라고 한다.

        //배열의 초기값 설정.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // int[] iarr = new int[]{1,2,3};
        //or
        // int[] iarr = {1, 2, 3}; 처럼 쓸 수 있다.

        //배열의 길이
        System.out.println(numbers.length);
        //배열 안에 값 확인 방법
        System.out.println(numbers[0]);
    }
}
