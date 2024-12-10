package day04.ex;

public class CalculatorMain2 {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();

        cal.sum(3, 123, 1515, 16161);
        cal.sum(14, 15, 16, 17, 181817171);
        double result1 = cal.getSum();
        System.out.println(result1);

    }
}
