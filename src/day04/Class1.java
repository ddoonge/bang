package day04;

class Pen {
    private String name;

    public void 쓰다(String mag) {
        System.out.println(mag);
    }
}


public class Class1 {
    public static void main(String[] args) {
        //class pen 은 단지 설계도 ,틀
        //class를 이용해서 설계(진짜 펜)을 만들어야 함.
        //새로 생성한 것이 new Pen();
        Pen p = new Pen(); // new 실체를 만든다. 만들어진 셀체를 인스턴스라고 부른다.

        //p 레퍼런스 변수는 펜에 대한 것만 가르킨다.
        //Pen p ---- Pen을 담을 수 있는 변수 p를 선언.

        p.쓰다("안녕!!"); // <<--- 이거는 main이 한 것이 아닌 Pen이 했다.
        //객체를 만들기 위해서는 클래스가 있어야된다. 결국 클래스는 붕어빵 틀이고, new하게 되면 붕어빵 1개 만듦.
    }
}
