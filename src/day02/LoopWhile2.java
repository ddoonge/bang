package day02;

public class LoopWhile2 {

    public static void main(String[] args) {
        System.out.println(args[0]);

        //parseInt() 메서드는 문자열(문자열 안에 숫자만)을 숫자로 바꿔준다.
        int count = Integer.parseInt(args[0]);

        int num = 0;
        while (true) {
            System.out.println(++num);

            if (num == count) {
                break;
            }
        }
    }
}
