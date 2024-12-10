package day07;
//abstracts는 추상적이다라는 의미인데 메인 클래스에 써야지 추상적 메서드를 가질 수 잇다.
//abstract 를 갖게 되면 추상적인 표현을 할 수 있다.
public abstract class 새 { //구체적?? 추상적?? --- 새는 추상적!
    private  String name;
    private int age;

    public void eat() {
        System.out.println("새가 먹는다!");
    }

    public void fly() {
        System.out.println("새가 날아요!");
    }

    //추상메서드를 구상하므로써 자식클래스들이 표준화된 방법으로 sing()라는 메소드를 정의!!
    //또한 자식클래스는 sing()라는 메소드를 반드시 구현해야 된다(강제성)
    //근데 추상메서드를 미완성한 상태로 있어야된다. 예) 타입 메서드명() {...구현하는 곳 } <-- 구현하는 곳이 있으면 안된다는 의미.
    abstract public void sing();//구현부가 없다!!,, 설계가 미완성 된 상태

    //굳이 강제성까지는 두지 않아도 될떄.
    //필요에 따라서 오버라이딩 해서 사용할 수 있다.
    public void 애교부리기() {

    }
}
