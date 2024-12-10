package day03;

import java.util.Arrays;

public class ArraysClass1 {
    //Arrays 객체: 배열을 다룰떄 사용하는 유틸리티
    // 배열을 만들 때 편하게 도와주는 객체이다.
    //static 이라서 하나만 만든다.??
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3,66,33,676,123,45};

        int[] copyTo = new int[copyFrom.length];

        for (int i = 0; i < copyFrom.length; i++) {
            copyTo[i] = copyFrom[i];
            System.out.println(copyTo[i]);
        }

        System.out.println("============================");

        //위에 내용을 Arrays로 쉽게 할 수 있다.
        //Arrays.copyOf 를 사용한다. 괄호안(복사할 배열, 배열의 길이) 로 쓰임.
        int[] copyTo1 = Arrays.copyOf(copyFrom, copyFrom.length);

        for (int i : copyTo1) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);
        for (int i : copyTo2) {
            System.out.println(i);
        }
    }
}
