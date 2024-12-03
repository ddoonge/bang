package day01.ex;

public class RectangleEx2 {

    public static void main(String[] args) {
        //while블록 안에는 while블록이 있을 수 있다.
        //아래와 같은 결과를 출력하려면 어떻게 해야할까?
        //*
        //**
        //***
        //****
        //*****

        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
