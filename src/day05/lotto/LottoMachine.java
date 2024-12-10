package day05.lotto;

import java.util.Random;

public class LottoMachine {

    private LottoBall[] lottoBalls = new LottoBall[45];

    //로또 머신을 생성될떄, 1-45번까지의 볼을 가지고 생성하도록 설계할 것이다.
    public LottoMachine() {
        //1~45번 까지 숫자를 가진 볼을 로또 머신에 넣어준다.
        for (int i = 0; i < lottoBalls.length; i++) {
            lottoBalls[i] = new LottoBall(i + 1);
        }
    }

    Random random = new Random();
    //섞어주세요.
    public void mix(){
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(45);
            int y = random.nextInt(45);

            //값을 바꿀때 중간역할을 하는 temp를만든다.
            LottoBall temp = lottoBalls[x];
            lottoBalls[x] = lottoBalls[y];
            lottoBalls[y] = temp;
        }
    }

    //뽑아주세요. -- 하나씩
    public LottoBall getBall() {
        LottoBall ball;
        int index;

        do {
            index = random.nextInt(45);
            ball = lottoBalls[index];
        } while (ball == null);
        lottoBalls[index] = null; //★★뽑힌볼을 null로 한다.★★
        return ball;
    }
}
