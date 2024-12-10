package day05;

public class StaticEx1 {
    public void test() {
        System.out.println("test");
    }

    //이게 기본 호출에시. new를 통해 인스턴스화 하여 메모리에 저장해야지만 가능.
    public static void main(String[] args) {
        StaticEx1 exam = new StaticEx1();
        exam.test();
    }

    public static void staticTest() {
        System.out.println("static");
    }
}
