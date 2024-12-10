package practice3;
//문제 3: 배열의 숫자 합계와 평균
//int 타입의 배열 scores에 저장된 모든 숫자의 합계와 평균을 계산하는 코드를 작성하세요. 평균은 소수점 두 자리까지 출력하세요.
//int[] scores = {70, 85, 90, 45, 100};
public class Ex8 {

    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 45, 100};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + sum / scores.length);
    }
}
