package day02;

public class NumOperator2 {

    public static void main(String[] args) {
        int a =10;
        int b =10;

        a = a +5;  // a += 5 로 사용 가능.
        System.out.println(a);
        //이 결과값에서 중요한 점은 값을 복사한다는 것. 그대로 들어가지 않는다.
        System.out.println(b + 30);
        System.out.println(b);
    }
}
