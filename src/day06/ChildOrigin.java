package day06;

public class ChildOrigin extends Parent{
    ChildOrigin(){
        System.out.println("ChildOrigin 생성자 실행");
    }
    int i = 10; //i가 오버라이딩 된 상태.

    public int getI() {
        return i;
    }

    public void print() {
        System.out.println(i);
    }
}

