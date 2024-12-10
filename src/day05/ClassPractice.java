package day05;

public class ClassPractice {
    public static int staticField;

    public int field;

    public static void staticMethod() {
        //사용할 수 있는 필드 ,,,스테틱한 메소드는 스태틱한 필드만 접근 가능.
        System.out.println(staticField);
        //사용할수 없는 필드
        //System.out.println(field); -- 인스턴스필드는 접근 불가
    }

    public void method() {
        //사용할 수 있는 필드 (둘 다 사용 가능)
        System.out.println(staticField);
        System.out.println(field);
    }

    public static void main(String[] args) {
        staticMethod();
        //method();
    }
}

