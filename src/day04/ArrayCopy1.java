package day04;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int i = 10;
        int j = i; //i의 값을 j에 넣어주세요. i의 값이 "복사되어" j에 들어갑니다.

        i += 10;

        System.out.println("i: " + i);
        System.out.println("j: " + j);

        //레퍼랜스 타입은 주소를 복사시키게 된다.
        int[] iarr = {10};
        int[] iarr2 = iarr;

        iarr[0] += 10;

        System.out.println("iarr: " + iarr[0]);
        System.out.println("iarr2: " + iarr2[0]);

    }
}
