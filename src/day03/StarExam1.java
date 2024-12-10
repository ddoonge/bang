package day03;

public class StarExam1 {
    public static void main(String[] args) {
        //******
        //******
        //******
        //******
        //******
        //위 경우으 코드
        for (int i = 0; i < 5; i++) {
            System.out.println("******");
        }

        //별을
//        *
//        **
//        ***
//        ****
//        ***** // 처럼 만들고 싶으면
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
