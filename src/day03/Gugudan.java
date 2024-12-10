package day03;

public class Gugudan {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.print(j + "*" + i + "=" + (i * j) + " \t");
            }
            System.out.println();
        }
    }
}
//"\t" : tap 키를 출력해준다.
