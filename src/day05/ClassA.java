package day05;

public class ClassA {

    public static  int fieldA; // 클래스 필드
    public int fieldB; // 인스턴스 필드
    protected int fieldC;

    public static void main(String[] args) {
        System.out.println(ClassA.fieldA);//하나만생성.(클래스필드)
        //System.out.println(ClassA.fieldB);  --- 인스턴스 필드는 인스턴스가 생성되어야만 비로서 접근가능.

        ClassA a = new ClassA(); //인스턴스 필드는 new키워드를 통해 생성해줘야된다.
        System.out.println(a.fieldB);

    }
}
