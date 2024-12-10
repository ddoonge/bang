package day07;

public class StringTest4 {
    public static void main(String[] args) {
        String greeting = "Hello World!";
        String name = "전병우";

        // 부분 문자열 추출 (substring 메서드)
        String substring = greeting.substring(7, 12); // "World" 추출
        System.out.println("substring: " + substring);

        // 문자열 비교 (equals 메서드)
        boolean isSame = greeting.equals("Hello, World!");
        System.out.println("greeting과 \"Hello, World!\"는 동일한가? " + isSame);

        // 대소문자 변환 (toUpperCase / toLowerCase)
        String upper = greeting.toUpperCase();
        String lower = greeting.toLowerCase();
        System.out.println("대문자 변환: " + upper);
        System.out.println("소문자 변환: " + lower);

        // 문자열 연결 (concat 메서드 또는 + 연산자)
        String conCat = greeting.concat(" 전뱅우");
        System.out.println("문자열 합하기 메서드 사용: " + conCat);
        String combined = greeting + " " + name;
        System.out.println("문자열 연결: " + combined);

        // 공백 제거 (trim 메서드)
        String spacedString = "   Hello!   ";
        System.out.println("공백 제거 전 길이: " + spacedString.length());
        String trimmed = spacedString.trim();
        System.out.println("공백 제거 후 길이: " + trimmed.length());
        System.out.println("trimmed: \"" + trimmed + "\"");
    }
}
