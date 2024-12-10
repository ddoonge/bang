package day03;

public class ForEachEx1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        //for-each
        //문법: for( 담을 변수 : 반복되는 자료 구조) { .... }
        for (int num : array) {
            System.out.print(num);
        }

        String[] strArr = {"abc", "test", "bang"};

        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
