package day04.ex;

public class Calculator2 {
    private double resultSum = 0;
    private double resultSub = 0;
    private double resultMul = 0;
    private double resultDiv = 0;
    private double resultRemain = 0;

    //합
    public double sum(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        resultSum = sum;
        return resultSum;
    }

    //뺴기
    public double subtraction(double... numbers) {
        double sub = 0;
        if (numbers.length > 0) {
            sub = numbers[0];
            for (double num : numbers) {
                sub -= num;
            }
            resultSub = sub;
        }
        return resultSub;
    }

    //곱하기
    public double multiply(double... numbers) {
        double mul = 0;
        if (numbers.length > 0) {
             mul = numbers[0];
            for (double num : numbers) {
                resultMul *= num;
            }
            resultMul = mul;
        }
        return resultMul;
    }

    //나누기
    public double divide(double... numbers) {
        double div = 0;
        if (numbers.length > 0) {
            div = numbers[0];
            for (double num : numbers) {
                div /= num;
            }
            resultDiv = div;
        }
        return resultDiv;
    }

    //나머지
    public double remain(double... numbers) {
        double remain = 0;
        if (numbers.length > 0) {
            remain = numbers[0];
            for (double num : numbers) {
                remain %= num;
            }
            resultRemain = remain;
        }
        return resultRemain;
    }

    public double getSum() {
       return resultSum;
    }

    public double getSub() {
        return resultSub;
    }
    public double getMul() {
        return resultMul;
    }
    public double getDiv() {
        return resultDiv;
    }
    public double getSRemain() {
        return resultRemain;
    }
}
