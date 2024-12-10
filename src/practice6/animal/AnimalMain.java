package practice6.animal;

public class AnimalMain {
    //실습 문제 1: 동물 클래스 상속 및 메서드 오버라이딩
    //부모 클래스: Animal
    //속성: name (동물 이름, 문자열)

    //메서드: makeSound(): "동물이 소리를 냅니다."를 출력.

    //자식 클래스:
    //Dog: makeSound() 메서드를 오버라이딩하여 "멍멍!"을 출력.
    //Cat: makeSound() 메서드를 오버라이딩하여 "야옹~"을 출력.

    //메인 메서드:
    //Animal 타입의 배열에 Dog와 Cat 객체를 저장한 뒤, 반복문을 사용하여 각 동물의 makeSound()를 호출하세요.

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};


        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
