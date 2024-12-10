package day03;

public class StringExam1 {
    public static void main(String[] args) {
//프린트 부분에서 문자열과 + 되면 숫자도 문자가 되어서 출력된다
        String str = "hello";
        int i = 10;
        char a = 'a';
        double d = 5.0;
        System.out.println(str + i + i);
    }
}

