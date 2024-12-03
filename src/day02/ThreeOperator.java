package day02;

public class ThreeOperator {

    public static void main(String[] args) {
        //삼항 연산자
        //(조건)? 식1 : 식2
        int num = 10;
        boolean b = (num > 5)?true : false;
        String result1 = (num > 0)?"양수" : "음수";

        System.out.println(result1);

        int num2 = 1234;
        String result = (num > 1000)?"큰수" : "작은수";
        System.out.println(result);


    }
}
