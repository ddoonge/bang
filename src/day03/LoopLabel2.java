package day03;

public class LoopLabel2 {
    public static void main(String[] args){
        outter:
        for(int i = 0; i< 5; i++){
            for(int k = 0; k < 5; k++){
                if( i == 0 && k == 2) {
                    break outter;
                    //라벨이 없을떄, 원래 i =0 부분에서 j=2가되면 그만하고 i =1부터 해야되는데 그냥 아예 for문을 break하게 함.
                }
                System.out.println(i + ", " + k);
            }
        }
    }
}

