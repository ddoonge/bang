package day03;

public class LoopLabel3 {
    public static void main(String[] args){
        outter: //여기까지 빠져나와서 시작한다.
        for(int i = 0; i< 5; i++){
            for(int k = 0; k < 5; k++){
                if( i == 0 && k == 2) {
                    continue outter;
                } // (0, 3) ,, (0, 4)는 출력이 안되고 i= 1부터 다시 출력된다.
                System.out.println(i + ", " + k);
            }
        }
    }
}
