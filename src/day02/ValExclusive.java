package day02;

public class ValExclusive {

    public static void main(String[] args) {
        int i = 10;
        int b = 100;
        boolean boo;

        boo = i >100;
        System.out.println(boo);

        boo = b > 200 ^ i++ > 5;
        //^는 둘중 하나라도 결과가 다르면 true, 같으면 false.

        System.out.println(boo);
        System.out.println(i);
    }
}
