package day07;
//equals() 에 관한 오브젝트 메서드
//객체끼리 비교해서 같은지 보기 위해 equals를 오버라이딩 하면 된다.
public class ObjectTest3 {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        myClass1.i = 10;

        MyClass myClass2 = new MyClass();
        myClass2.i = 10;

        System.out.println(myClass1 == myClass2); //이거는 주소값을 비교해서 false 결과나옴

        System.out.println(myClass1.equals(myClass2)); //오버라이딩이 안되있기 떄문에 여전히 다르기 떄문에 false로 나온다.

        System.out.println("======================person================");
        Person bang1 = new Person("bang", 23, "강남");
        Person bang2 = new Person("bang", 23, "인천");

        System.out.println(bang1.equals(bang2)); //오버라이딩 된 후에는 true가 나오게 된다.

        System.out.println(bang1.hashCode());
        System.out.println(bang2.hashCode());

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("====================String==================");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//String은 이미 equals를 오버라이딩 했기 떄문에 바로 true가 나오게 된다.

    }
}
