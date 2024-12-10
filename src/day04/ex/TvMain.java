package day04.ex;

public class TvMain {
    public static void main(String[] args) {
        TV tv = new TV(false, 1, 10);
        tv.togglePower();
        tv.channelUp();
        tv.channelDown();
        tv.volumeUp();
        tv.volumeDown();
        tv.setChennel(32);
        tv.togglePower();
    }
}
