package day07;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract double getArea(); // 어떤 도형이든 면적을 계산하는 기능은 반드시 필요하다라고 생각할떄 추상메서드을 구현.

    //각각 모두 그릴 수 있는 추상메서드
    public abstract void draw();
}
