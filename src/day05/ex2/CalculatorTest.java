package day05.ex2;

import day04.ex.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        //다른패키지에 있는 동일명의 클래스를 가져오는 방법.
        Calculator cal1 = new Calculator();
        day05.ex1.Calculator cal2 = new day05.ex1.Calculator();

        cal1.add(13, 12);
        int sumResult1 = cal2.plus(12, 16);
        int sumResult2 = cal2.minus(0,12);
        System.out.println(sumResult1);
        System.out.println(sumResult2);
    }
}
