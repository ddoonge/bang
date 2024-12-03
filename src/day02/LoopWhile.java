package day02;

public class LoopWhile {

    public static void main(String[] args) {
        //while(조건식) { 반복할 문장 } --- 주의: 무한루프에 빠지지 않도록 사용.

        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}
