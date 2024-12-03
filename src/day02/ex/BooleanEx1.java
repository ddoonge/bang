package day02.ex;

public class BooleanEx1 {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = true;

        b1 = 10 > 5 && 5 < 100; //true
        b2 = 10 > 9 & 3 > 1000; //false
        b3 = 100 <= 100 || 100 < 100; //true
        b4 = 120 < 100 | 120 < 0; // false

        System.out.println(b1 || b2);//true
        System.out.println(b3 && b2);//false
        System.out.println(b1 ^ b4);//true
        System.out.println(!b4);//true
    }
}
