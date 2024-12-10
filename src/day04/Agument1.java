package day04;

public class Agument1 {
    // 메소드 - 기능(행위)
    //메서드의 문법: 접근제한자 리턴타입 메소드명(매개변수들){구현부}

    // 정수값 2개를 받아서 더해주는 기능을 구현하고 싶다.
    //static이라는 키워드 붙이면 객체를 생성하지 않아도 사용 가능!!
    public static int addInt(int i, int j) {
        int sum = i + j;
        return sum;
    }

    //값을 3개 받아서 곱한다.
    public static int mulInt(int n1, int n2, int n3) {
        int mul = n1 * n2 * n3;
        return  mul;
    }

    public static int addInt(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    //계속 이렇게 더할것을 많이 늘리게 될 떄 마다 메서드를 정의하는게 너무 불편해서
    //제한 없는 아규먼트를 이용가능하다. --> 문법: int...
    //addInt(int... ) 은 배열이다!!!!!
    public static int addInt(int... values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    //main 메소드
    public static void main(String[] args) {
        int result = addInt(4, 5); // 이렇게 하면 다음에도 재사용이 가능하다.
        System.out.println(result);
        System.out.println(addInt(7,10)); // 이럴떄는 저 값이 출력만 하고 끝난다.
        System.out.println("=======================");
        System.out.println(mulInt(2,4,6));
        System.out.println(addInt(1, 2, 3, 4));
        System.out.println(addInt(1,2,3,4,5,6,7,8,9,10));
    }
}
