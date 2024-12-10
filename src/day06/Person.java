package day06;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this(name, phoneNumber);
        this.age = age;
        System.out.println("완전체 가기");
    }

    public Person(String name, String phoneNumber) {
        this(name);
        this.phoneNumber = phoneNumber;
        System.out.println("name, phoneNumber 생성자");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("name 생성자 생성");
    }

    public static void main(String[] args) {
        Person p1 = new Person("JEON",15,"010-1234-5678");
    }
}
