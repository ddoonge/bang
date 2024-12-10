package day07;

public class BallPen extends Pen {
    String color = "검정";

    public void write() {
        System.out.println("ballPen이 씁니다. 색: " + color);
    }

    //super 사용법!
    public void print() {
        //System.out.println("a");
        //System.out.println("b");
        //System.out.println("c");
        //System.out.println("d");
        //밑에 super.print가 위에 코드를 대신해준다. 부모의 메서드를 불러올수 있는 super 예약어.
        super.print();
        System.out.println("e");
        System.out.println(super.color); //접근제한자가 허용되면 사용 가능.
    }

    public String toString() {
        return "나는 ballPen이예요.";
    }

    public static void main(String[] args) {
        Pen ballPen = new BallPen();

        ballPen.print();
    }

}
