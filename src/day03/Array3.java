package day03;

public class Array3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = {1,2,3,4,5};

        System.out.println("array1 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(array1[i]);
        }
        //for-each문 교환
        for (int i : array1) {
            System.out.println(i);
        }

        System.out.println("array2 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(array2[i]);
        }
        //for-each문 교환
        for (int num : array2) {
            System.out.println(num);
        }
        System.out.println("array3 의 값 출력");
        for(int i = 0; i < 5; i++){
            System.out.println(array3[i]);
        }
        //for-each문 교환
        for (int i : array3) {
            System.out.println(i);
        }
    }
}
