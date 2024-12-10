package day07;

public class BirdTest {
    public static void main(String[] args) {
//        새 bird = new 새(); // 추상클래스로는 인스턴스를 생성 할 수 없다.

        새 b = new 참새();
        새 b2 = new 비둘기();

        //새 클래스가 노래하다() 추상메서드로 가지고 있기 떄문에 직접구현하지 않았어도 자식의 메서드에 접근 가능!
        //타입은 새 타입이지만 메서드는 자식껄로 선택되기 떄문에 문제 없다.
        b.sing();
        b2.sing();
    }
}
