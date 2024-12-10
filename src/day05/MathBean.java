package day05;

public class MathBean {
    //클래스 이름을 화면에 출력한다.
    public void printClassName() {
        System.out.println(Math.class);
    }

    //매개변수로 받아들인 정수를 화면에 출력한다.
    public void printNumber(int n) {
        System.out.println(n);
    }

    //숫자 1을 리턴한다.
    public int getOne() {
        return 1;
    }

    //매개변수로 정수 2개를 받아 들인 후, 그 합을 리턴한다.
    public int plus(int x, int y) {
        return (x + y);
    }
}
