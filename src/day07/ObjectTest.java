package day07;

//object
class Cup {
    String name;
    int price;

    @Override
    public String toString() {
        return "이 컵은 " + name + "입니다.";
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        Cup cup = new Cup();

        cup.name = "나만의";
        //to.String 알아보기
        //약속 : 출력문에 객체 이름을 넣으면 toString() 이라는 메소드가 자동으로 호출된다!
        //통일성을 위해서... toString()을 사용. - 정보 보고 싶으면 이용
        //Oject가 객체에 대한 정보를 보고 싶으면 toString() 메서드를 이용해서 볼 수 있다.
        //객체의 정보를 보고 싶으면 객체를 toString()메서드로 오버라이딩하면 된다.
        System.out.println(cup); //day07.Cup@2f4d3709 ,,
        System.out.println(cup.toString()); //day07.Cup@2f4d3709

        Pen pen = new Pen();
        System.out.println(pen);
        System.out.println(pen.toString());

        BallPen ballPen = new BallPen();
        System.out.println(ballPen);
        System.out.println(ballPen.toString());

        //String은 객체라서 hello가 바로 나올 수 없는데
        // 그걸 바로 할 수 있게 이미, toString메서드를 해주고 있다.
        String str = "hello";
        System.out.println(str);
    }
}
