package day03;

public class LoopLabel {
    public static void main(String[] args) {
        System.out.println("뱅우\t 코딩");

        //구구단을 세로로 표시하기!! 어렵다...왜 j 와 i를 바꿀 생각을 안했을까....머리가 안돈다.
        //빠지는데 어디까지 빠져?? 거기가 라벨 을 붙여준것이 a:다.
        //break와 continue문의 한계
        //break는 현재 반복문을 빠져나가는데 사용한다.
        //continue는 continue문 아래 부분을 실행하지 않고 다시 반복한다.
        //그렇다면 중첩반복문을 한번에 빠져나가려면? continue이하를 실행하지 않고 한번
        //에 중첩 반복문을 반복하려면 어떻게 해야할까?
        //이럴때 label을 사용한다.
        a:
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (j == 5) break a;
                System.out.print(j + "*" + i + "=" + (i * j) + " \t");
            }
            System.out.println();
        }
    }
}
//"\t" : tap 키를 출력해준다.
