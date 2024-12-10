package practice3;
//문제 2: 최대값과 최소값 찾기
//double 타입의 배열 doubles에서 최대값과 최소값을 찾아 출력하는 코드를 작성하세요.
//double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
public class Ex7 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double minNUmber;
        double maxNumber;
        minNUmber = maxNumber = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if (minNUmber > doubles[i]) {
                minNUmber = doubles[i];
            }
            if (maxNumber < doubles[i]) {
                maxNumber = doubles[i];
            }
        }
        System.out.println("최대값: " + maxNumber);
        System.out.println("최소값: " + minNUmber);
    }
}
