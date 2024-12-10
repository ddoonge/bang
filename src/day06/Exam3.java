package day06;
//부모의 생성자가 먼저 실행 되고,,, 자식의 생성자가 뒤에 실행 된다.
public class Exam3 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("=============================");
        //부모의 생성자부터 먼저 실행.
        ChildOrigin c = new ChildOrigin();
        System.out.println("=============================");
        Parent p1 = new ChildOrigin();
    }
}
