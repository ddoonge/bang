package day06;

public class Exam5 {

public static void test(Parent p){
    System.out.println(p.i);
    System.out.println(p.getI());
}

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.getI());

        ChildOrigin c = new ChildOrigin();//자기가 구현한 것부터 사용.
        System.out.println(c.i);
        System.out.println(c.getI());

        Parent pc = new ChildOrigin();
        System.out.println(pc.i); // 자식이 구현한것이 보이지 않아서 필드는 부모것만 가능.
        System.out.println(pc.getI()); // 메서드는 자식껄로 가능.


        System.out.println("============================================");
        test(p);
        System.out.println("============================================");
        test(c);
        System.out.println("============================================");
        test(pc);
    }
}
