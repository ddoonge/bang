package day02;

public class LoopWhile3 {

    public static void main(String[] args) {
        int i = 0;
        while (i++ < 11) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
