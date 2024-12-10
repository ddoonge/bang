package day03;

public class ItemForArray {
    //클래스의 가장 기본이 되는 구성요소
    //데이터(속성)을 나타내는 필드.

    //데이터(속성)을 나타내는 필드.
    private String name;
    private int price;

    //메서드는 리턴타입이 중요...
    //public 밥 makeRice(씻은밥, 물) { ....}
    //public 커피 makeCoffee(커피콩, 물) { 커피를 간다... 물을 끊인다...}
    //만약 커피를 만드는 메서드를 만든다고 하면,
    //문법 : 접근제한자 리턴타입 메소드명(매개변수들...)
    //메서드

    //생성자. - 객체를 초기화 하는 메서드.
    //객체가 생성될 때 딱 한 번 실행된다.
    //생성자는 클래스가 인스턴스(객체)화 될 떄 호출되며, 객체의 초기 상태를 설정한다.
    //생성자의 문법: 접근제한자 메서드명(클래스명과 동일) (매개변수들...) { .... }
    //생성자는 return 타입이 없다.
    public ItemForArray(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //메서드. getter
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    //메서드 setter void - 예약어. (없다)
    public void setPrice(int price) {
        this.price = price; //this는 클래스의 속성을 나타낸다.
    }

    public void setName(String name) {
        this.name = name;
    }
}
