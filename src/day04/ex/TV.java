package day04.ex;

public class TV {
    boolean isPower;
    int chennel;
    int volume;

    public TV(boolean isPower, int chennel, int volume) {
        this.chennel = chennel;
        this.volume = volume;
        this.isPower = isPower;
    }

//    public void turnOn() {
//        isPower = true;
//    }
//
//    public void turnOff() {
//        isPower = false;
//    }

    public void togglePower() {
        isPower = !isPower;

        if (isPower) {
            System.out.println("TV가 켜졌습니다.");
        } else {
            System.out.println("TV가 꺼졌습니다.");
        }
    }

    public void volumeUp() {
        if (isPower) {
            volume++;
            System.out.println("볼륨이 1칸 올랐습니다." + volume);
        }
    }

    public void volumeDown() {
        volume--;
        System.out.println("볼륨이 1칸 낮아졌습니다." + volume);
    }

    public void channelUp() {
        chennel++;
        System.out.println("현재 채널 " + chennel );
    }

    public void channelDown() {
        chennel--;
        System.out.println("현재 채널 " + chennel );
    }

    public void setChennel(int chennel) {
        this.chennel = chennel;
        System.out.println("현재 채널 " + chennel );
    }
}
