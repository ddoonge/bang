package day07;

import java.util.Objects;

class MyClass {
    int i;

    public int concat(int j) {
        i += j;
        return i;
    }

    @Override
    public String toString() {
        return i + "";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MyClass myClass)) return false;
        return i == myClass.i;
    }

    @Override
    //어떤한 객체의 값들을 숫자로 표현하는것이 hashCode이다.
    public int hashCode() {
        return Objects.hash(i);
    }


    public class ObjectTest2 {
        public static void main(String[] args) {
            MyClass myClass = new MyClass();
            myClass.i = 10;
            System.out.println(myClass);

            Person bang = new Person("전병우", 26, "인천");
            System.out.println(bang);
        }
    }
}
