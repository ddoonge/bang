package practice6.diagram;

public class DiagramMain {
    //실습 문제 3: 도형 클래스 상속 및 메서드 오버라이딩
    //부모 클래스: Shape
    //메서드: draw(): "도형을 그립니다."를 출력

    //자식 클래스:
    //Circle: draw() 메서드를 오버라이딩하여 "원을 그립니다."를 출력.
    //Rectangle: draw() 메서드를 오버라이딩하여 "사각형을 그립니다."를 출력.
    //메인 메서드:
    //Shape 타입의 배열에 Circle과 Rectangle 객체를 저장한 뒤, 반복문을 사용하여 draw()를 호출하세요
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
