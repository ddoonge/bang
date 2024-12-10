package day07;

public class Triangle extends Shape {
    private double height;
    private double basePlane;

    Triangle(String color, double height, double basePlane) {
        super(color);
        this.height = height;
        this.basePlane = basePlane;
    }

    @Override
    public double getArea() {
        return (height * basePlane) / 2;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그린다!");
    }
}
