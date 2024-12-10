package day06;

public class Pen {
    private String name;
    private String color;
    private int price;
    //생성자 -- 명시적으로 생성자를 정의하지 않으면 컴파일러는 디폴트 생성자를 자동으로 만든다.

    //생성자 오버로딩
    public Pen() { //셍성자를 하나라도 만들면 기본 생성자는 생성되지 않는다.

    }

    //Pen이라는 클래스가 만들어(인스턴스)질떄부터 초기값을 갖고 싶다.
    //생성자  : 접근제한자 클래스명(메소드명 (매개변수들... 초기화할 값들....)
    //만약 내가 초기화를 color, price을 초기화 했으면 좋겠다 하면.
    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public Pen(String name) {
        this.name = name;
    }

    public Pen(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

