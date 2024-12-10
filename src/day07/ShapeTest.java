package day07;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circl = new Circle("black", 20);

        System.out.println("색상 : " + circl.color);
        System.out.println("넓이 :" + circl.getArea());
        circl.draw();
        System.out.println("==================================");

        Shape rectangle = new Rectangle("bllue", 10.5, 20.3);

        System.out.println("색상 : " + rectangle.color);
        System.out.println("넓이 :" + rectangle.getArea());
        rectangle.draw();
        System.out.println("==================================");

        Triangle triangle = new Triangle("red", 20.2, 11.2);

        System.out.println("색상 : " + triangle.color);
        System.out.println("넓이 :" + triangle.getArea());
        triangle.draw();
        System.out.println("==================================");

    }
}
