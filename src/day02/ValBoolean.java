package day02;

public class ValBoolean {

    public static void main(String[] args) {
        int i = 10;
        int b = 100;
        boolean boo;

        boo = i >100;
        System.out.println(boo);

        boo = b > 200 & i++ > 5;
        //and &&연산자는 앞에것이 false이면 뒤에것을 실행x
        //그런나 &가 하나인 경우는 앞에것이 false여도 뒤에것을 그대로 실행한다.

        // or 연산자 || 인것과 | 인 것의 차이도 앞에 설명과 동일하게
        // 처음만났을때 true,false가 결정되면 그냥 선택되던지 아니면 뒤에것도 하던지 하는 것이다.

        System.out.println(boo);
        System.out.println(i);
    }
}
