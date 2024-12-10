package day05.lotto;

public class LottoUser {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();
        machine.mix();

        for (int i = 0; i < 6; i++) {
            LottoBall ball = machine.getBall();
            System.out.println(ball.number);
        }
    }
}
