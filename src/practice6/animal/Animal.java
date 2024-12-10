package practice6.animal;

import javax.xml.namespace.QName;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

