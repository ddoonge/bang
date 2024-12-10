package day07;

//final을 통해서 자식 클래스가 오버라이딩 할 수 없게 만들었다.
public abstract class Beverage {
    // 템플릿 메소드
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew(); // 추상 메소드

    abstract void addCondiments(); // 추상 메소드

    public void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    public void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }
}
