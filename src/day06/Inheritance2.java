package day06;

//상속에서 생각해볼 부분!!
//부모가 가진것을 자식이 똑같이 다시 정의 할 수 있어요!! --- 이것을 오버라이딩 이라고 한다.
//오버로딩은 구별 가능,,, 오버라이딩은 같은것을 오버하게 사용한것?
class Parents {
    int i = 5;

    public int getI() {
        return i;
    }
}

class Child extends Parents {
    int i = 10;
    //i가 오버라이딩 된 상태.
}


public class Inheritance2 {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.i);

        //상속에서 기억해야 될 3가지.
        //1. 부모는 자식을 가리킬 수 있다.
        Parents p = null; // Parent를 담을(가리킬) 수 있는 타입
        Child c = null;

        //p = new Parents();//이미 큰범위의 부모클래스로 만들어진 것을 자식 클래스로 형변환이 불가능하다
        p = new Child(); //묵시적 형변환이 일어남.
        //c = new Parents(); //자식은 부모를 가리킬(담을) 수 없다.

        //명시적 형변환
        if (p instanceof Child)//진짜 p가 Child 클래스야?라고 확인 {
            c = (Child) p; //실제로는 p가 가리키고 있는 인스턴스가 child 라는 사실을 알기 떄문에 명시적 형변환 가능.
        //명시적으로 형변환 할 떄는 주의.
    }
}

