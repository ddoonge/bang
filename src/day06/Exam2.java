package day06;

public class Exam2 {
    public static void main(String[] args) {

        Parent p = new ChildOrigin();

        System.out.println(p.i); //5
        System.out.println(p.getI()); // 10

        //2. 필드는 오버라이딩 되었을떄 타입을 따른다.
    }
}
