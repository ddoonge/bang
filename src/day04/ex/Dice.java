package day04.ex;

import java.util.Random;

//모든 클래스는 생성자를 갖는다.
//컴파일러는 정의된 클래스에 생성자가 없다면 기본 생서자를 자동으로 만든다.
public class Dice {
    //속성 - 면, 눈
    private int pip;
    int numberSide;

    //생성자를 클래스에 만들지 않았으면, 기본생성자를 만든다... 생성자는 클래스 이름(괄호에 여러변수).
    //밑에는 생성자를 생성한 것. 하나라도 생성자를 정의하면 컴파일러가 더이상 자동으로 생성자를 만들지 않는다.
    public Dice() {
        System.out.println("생성자 실행!");
    }


    //행위 - 주사위를 굴리다.
    public void roll(int numberSide) {
        //주사위를 굴렸을때,  면 중 하나가 랜덤으로 나오면 된다.

        //Math.random은 0---1까지의 실수를 보여준다.
        pip = (int) (Math.random() * numberSide) + 1;
        System.out.println("주사위 결과는 " + pip + "입니다.");

        //Random random = new Random();
        //pip = random.nextInt(numberSide)+1;
    }
}

