package day07;

public class StringTest {
    public static void main(String[] args) {
        //클래스를 인스턴스 생성하는 것을 해야되는데 String을 그걸 생략 할 수 있다.
        //불변 클래스(객체), String이 그 에씨.
        MyClass myClass = new MyClass();
        myClass.i = 10;
        String str1 = "hello";

        String str2 = new String("hello");
        String str3 = new String();

        String str4 = "hello";

        //String문자열은 이미 같은 문자가 있으면 동일한 문자가 있는 그 메모리를 가리킨다.
        //따라서 새로운 인스턴스를 생성하는 것이 아닌 동일한 참조값을 가지게 된다.
        //String은 조금 독특한 객체다( 메모리상에서 문자열이 너무 많이 생성되므로...
        //효율적으로 관리할 방법을 제공 한 것이다.)
        //또한 문자열을 관리하는 공간을 따로 가진다.
        System.out.println(str4 == str1);  //true

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
