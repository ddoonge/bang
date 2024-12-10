package day07;


public class StringTest3 {
    String data;

    public boolean find(String data, char findChar) {
        boolean isCharAt = false;
        for (int i = 0; i < data.length(); i++) {
            if (findChar == data.charAt(i)) {
                isCharAt = true;
                return true; //return을 만나면 호출한 다시 곳으로 돌아간다.
            }
        }
        return isCharAt;
    }

    public static void main(String[] args) {

        String greeting = "Hello World!";

        System.out.println(greeting.length());

        //배열index 0인 문자 가져오기.
        char firstChar = greeting.charAt(0);
        System.out.println(firstChar);

        //문자열 언어 중 특정한 문자를 찾을 수 있을까?
        //이 기능을 가진 메소드를 정의해 보세요.
        //예시 : boolean find(String data, char findChar) {}
        //data안에 findChar가 존재하면 true, 없으면 false를 리턴하는 메서드를 정의해보자
        String flag = "false";
        for (int i = 0; i < greeting.length(); i++) {
            if (greeting.charAt(i) == 'a') {
                flag = "true";
                break;
            }
        }
        System.out.println(flag);
    }
}

