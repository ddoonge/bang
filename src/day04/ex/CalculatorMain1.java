package day04.ex;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class CalculatorMain1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //더하기
        cal.add(1.3, 2.2);
        //뺴기
        cal.minus(3, 10);
        //곱하기
        cal.mul(1123.2, 3.145);
        //나누기
        cal.div(2.11,0);
        //나머지
        cal.remain(1.9, 8.2);
    }
}
