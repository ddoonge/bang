package day05;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "Jeon";
        p2.name = "Kim";
        p3.name = "Park";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

        //static 변수는 클래스 변수라고 한다.
        //실제 값을 담는 저장소는 하나밖에 없고 더이상 생성하지 않기 떄문에
        //p1.co1unt ,,, p2.count,,, p3.count,,, (p1,p2,p3 는 모두 같은 참조값을 가리키고) 모두 같은 저장소을 가리킨다.
        Person.count = 5;
        p1.count = 10;
        p2.count = 20;
        p3.count = 30;

        System.out.println(p1.count);
        System.out.println(p2.count);
        System.out.println(p3.count);
    }
}
