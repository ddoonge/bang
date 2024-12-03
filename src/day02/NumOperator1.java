package day02;

public class NumOperator1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        a++; // 증가 연산자 a = a + 1;
//        ++a;// 증가연산자... 문장 하나로 끝날때는 후위와 전위연산 차이가 없다.

        System.out.println(++a); //출력 하기 전에 먼저 더한다.
        System.out.println(a++); //출력 후에 더한다.
        System.out.println("====================");
        System.out.println(b++);
        System.out.println(++b);

        //while 문에서도 증감 연산자 사용 가능
        while (a++ < 20) {
            System.out.println(a);
        }
    }
}
