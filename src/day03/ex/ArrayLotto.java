package day03.ex;

import java.util.Arrays;
import java.util.Random;

public class ArrayLotto {
    public static void main(String[] args) {
        //로또 프로그램 만들기.
        Random random = new Random();

        int count = 0;
        int[] lottos = new int[6];

        while (count < lottos.length) {
            int randomInt = random.nextInt(45) + 1;
            boolean isDuplicate = false;
            //랜덤숫자를 배열에 넣어서 나중에 꺼내기 위한 작업.

            //중복제거
            for (int i = 0; i < count; i++) {
                if (lottos[i] == randomInt) {
                    isDuplicate = true;
                    break;
                }
            }
            //중복이 아니면
            if (!isDuplicate) {
                lottos[count] = randomInt;
                count++;
            }
        } //여기서 while문이 끝남.

        Arrays.sort(lottos); // 정렬하는 메서드 //gpt 도와줌...

        //보너스 번호 생성 (중복x)
        int bonus;
        do {
            bonus = random.nextInt(45) + 1;
        } while (isDuplicate(lottos, bonus));


        for (int x = 0; x < lottos.length; x++) {
            System.out.print(lottos[x] + " ");
        }
        System.out.print("+ " + bonus);
    }

    //중복 체크 메서드 ,,, gpt 도움을 받아 메서드를 만듦
    private static boolean isDuplicate(int[] array, int number) {
        return Arrays.stream(array).anyMatch(num -> num == number);
    }
}

