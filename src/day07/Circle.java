package day07;

public class Circle extends Shape {

    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("원을 그리다!");
    }
}
