package day02;

public class Swich1 {

    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("1");
                //break가 없으면 1을 만족하면 1,2,3,default까지 다 실행한다.
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("몰라");
        }
    }
}
