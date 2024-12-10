package day06;

public class Exam1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i); //5
        System.out.println(p.getI()); //5

        ChildOrigin c = new ChildOrigin();
        System.out.println(c.i); //10
        System.out.println(c.getI()); //10
    }
}
