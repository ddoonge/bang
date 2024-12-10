package day07;

public class StringTest2 {
    public static void main(String[] args) {
        //StringTest 클래스의 이유 때문에 String은 불변 클래스다!!

        MyClass myClass = new MyClass();
        MyClass myClass1 = myClass;
        MyClass myClass2 = myClass;

        myClass.i =10;
        myClass1.i = 20;
        myClass2.i = 30;
        //같은 인스턴스를 가리키니깐 값이 변하는 것을 알 수 있다.
        //(같은 myclass, myclass1, myclass2 모두 같은 인스턴스 주소값을 가지고 있다.)
        System.out.println(myClass.i);

        //String 아래와 같이 생성되면 Hello 라는 문자열은 하나만 만들어지고
        //모두 같은 문자열을 가리키고 있으므로...
        //String은 한 번 생성되면 스스로 바뀌지 않는 불변 클래스로 만들어짐.
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";

        System.out.println((str1.concat(" world!")));

        System.out.println(str1);
        System.out.println("===========int나 다른 것의 경우는 자기자신 변할 수 있음.==========");

        //int는 자기 자신이 바뀔수 있따.
        System.out.println(myClass.concat(10));
        System.out.println(myClass.i);
        System.out.println("==========String 자기자신 변하기 하기 위한 방법=========");
        //String은 불변 클래스라서 자기 자신이 못바뀌기 때문에 새로운 객체를 만들어줘서 그 값을 넣어줘야된다.
        str1 = str1.concat(" world!");
        System.out.println(str1);
    }
}
