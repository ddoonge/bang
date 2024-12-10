package day06;

class Car {
    //필드
    String name;
    int speed;

    //메서드
    public void run() {
        System.out.println("운행하다.");
    }
}

//상속 문법 :: extends 클래스명 - Bus는 Car로 부터 상속받는다.
class Bus extends Car {
    public void pickUp() {
        System.out.println("승객을 태우다.");
    }
}

//직계 상속
class SeetBus extends Bus {
    public void 좌석을예약하다() {
        System.out.println("좌석을 예약하다.");
    }
}

class Truck extends Car {
    public void load() {
        System.out.println("짐을 실다.");
    }
}



public class Inheritance1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "티코";
        car.speed = 100;
        System.out.println(car.name);
        System.out.println(car.speed);
        car.run();
        //car.pickUp()

        System.out.println("\n================================\n");

        Bus bus = new Bus();
        bus.name = "스쿨버스";
        bus.speed = 80;
        System.out.println(bus.name);
        System.out.println(bus.speed);
        bus.run();
        bus.pickUp();

        System.out.println("\n================================\n");

        Truck truck = new Truck();
        truck.name = "트럭1";
        truck.speed = 120;
        truck.run();
        truck.load();
        System.out.println("\n================================\n");

        SeetBus seetBus = new SeetBus();
        seetBus.name = "시트버스";
        seetBus.pickUp();
        seetBus.좌석을예약하다();

        //보모는 자식을 가리킬(담을) 수 있다.
        Car sb1 = new SeetBus();
        Bus sb2 = new SeetBus();

        seetBus.좌석을예약하다();

        //=========================================
        //1.
        SeetBus sb = (SeetBus) sb1;
        sb.좌석을예약하다();

        //2.
        //sb1.좌석을예약하다(); // 사용불가!!! - 부모의 타입은 자식 타입 것을 쓸 수 없다.
        ((SeetBus)sb1).좌석을예약하다();// 접근이 불가능 하기 떄문에 모른다. 따라서 자식 타입으로 형변환을 해야지 사용(접근) 가능하다

        //위에 1,2는 같다..

        //instanceof 를 사용해서 너가 실제로 사용하는 같은 타입이 맞니? 라고 해주는 것을 해줘야된다. 그래야 컴파일 오류로는 못잡으니깐 오류를 발생하면 안나오게 할 수 있다.
    }
}
