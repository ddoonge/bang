package day02.ex;

public class Casting1 {
    public static void main(String[] args) {
        long x2 = 50;
        int i2 = (int)x2;
        System.out.println(x2);
        System.out.println(i2);

        long x3 = Long.MAX_VALUE;
        int i3 = (int)x3;
        System.out.println(x3);
        System.out.println(i3);

        double i = 3.7;
        int num = 0;
        num = (int)i;
        System.out.println(num);
    }
}
