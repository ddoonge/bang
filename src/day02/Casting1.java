package day02;

public class Casting1 {

    public static void main(String[] args) {
        int i = 10;
        //형변환 - 작은 그릇에 담김 값을 큰 그릇으로 옮겨 담을 때,
        //묵시적으로 형변환이 일어난다.
        long l = i;

        //큰 그릇에 있는 값을 작은 그릇에 옮겨 담으려고 할떄...
        //명시적으로 형 변환을 해야한다.
        //컴파일러는 그릇안에 들어있는 값은 안보고 형(타입)의 크기만 비교.
        i = (int)l;

        float f = 10.3f;

        l = (long)f; //컴파일 오류... 10.3; 소수점 이하의 값을 버리게 되기떄문.

        System.out.println(l);

        //형변환이 가능하다는 것은 데이터 타입이 같다는 의미.
        //실수,정수 모두 숫자로 통일. -- 형변환 가능
        //boolean은 숫자의 형변환으로 불가능.

        //char도 사실 숫자이다.
        char c = 'a';
        i = c;
        System.out.println(i);
        System.out.println(i++);
        System.out.println((char)i);

    }
}
