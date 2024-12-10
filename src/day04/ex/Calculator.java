package day04.ex;

public class Calculator {
    //간단한 계산기 만들기 version1.0.0
    private double num1;
    private double num2;

    //더하기
    public void add(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1 + " + " + num2 + "= " + (num1 + num2));
    }

    //뺴기
    public void minus(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1 + " - " + num2 + "= " + (num1 - num2));
    }

    //곱하기
    public void mul(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1 + " * " + num2 + "= " + (num1 * num2));
    }

    //나눈기
    public void div(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1 + " / " + num2 + "= " + (num1 / num2));
    }

    //나머지
    public void remain(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1 + " % " + num2 + "= " + (num1 % num2));
    }
}
