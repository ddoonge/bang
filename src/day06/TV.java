package day06;

public class TV {
    //전원,채널,소리
    private boolean power;
    private int channel;
    private int volume;


    public TV(boolean power, int channel, int volume) {
        System.out.println("TV(boolean power, int channel, int volume) 생성자 호출");
        this.power =power;
        this.channel = channel;
        this.volume = volume;
    }

    //중복을 없애기 위해 생성자가 다른 생성자를 호출 할 수 있는 기능을 이용.
    //this() -- 나의 생성자를 의미한다.
    public TV(boolean power, int channel) {
        this(power, channel, 0);
        System.out.println("TV(boolean power, int channel) 생성자 호출");
        //this.power = power;
        //this.channel = channel;
    }

    public TV(boolean power) {
        this(power, 0, 0); //이 this는 무조건 첫번째 줄에 있어야 된다.
        System.out.println("TV(boolean power) 생성자 호출");
        //this.power = power; // 생성자 중복 없애기.
    }

    public TV(){
        System.out.println("TV() 생성자 호출");
    }

    public void togglePower(){
        power = !power;
        if(power) {
            System.out.println("TV가 켜졌습니다.");
        }else{
            System.out.println("TV가 꺼졌습니다.");
        }
    }

    public void volumeUp(){
        if(power) {
            volume++;
            System.out.println("볼륨을 키웁니다." + volume);
        }
    }

    public void volumeDown(){
        volume--;
        System.out.println("볼륨을 줄입니다."+volume);
    }

    public void channelUp(){
        channel++;
        System.out.println("채널이 바뀌었습니다."+channel);
    }
    public void channelDown(){
        channel--;
        System.out.println("채널이 바뀌었습니다."+channel);
    }
    public void setChannel(int channel){
        this.channel = channel;
        System.out.println("채널을 돌립니다."+channel);
    }


    public static void main(String[] args) {
        System.out.println("TV의 메인!!!");
    }

}
