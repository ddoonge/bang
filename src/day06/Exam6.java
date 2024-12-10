package day06;

public class Exam6 {
    public static void test(Parent p){
        System.out.println(p.i);
        System.out.println(p.getI());

        ((ChildOrigin)p).print();


    }
    public static void main(String[] args) {
        ChildOrigin c = new ChildOrigin();
        test(c);

        //출력결과는??   5,10,10

        Parent pc = new ChildOrigin();
        test(pc);

        // 결과  -  5, 10, 10  -

        Parent p = new Parent();
        test(p);
        //결과 55 error
    }
}
