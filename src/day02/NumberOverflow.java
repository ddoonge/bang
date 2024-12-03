package day02;

public class NumberOverflow {
    public static void main(String[] args) {
        //그릇이 넘친것을 오버플로우라고 한다.
        //계산 결과가 최댓값을 넘거나, 최솟값보다 작을 경우 음수는 양수로,
        // 양수는 음수로 바뀌는 문제가 발생한다. 이를 오버플로우라고 한다.

        int value = 10;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println(minInt);
        System.out.println(value + 1);
        System.out.println(maxInt + 10);
    }
}
