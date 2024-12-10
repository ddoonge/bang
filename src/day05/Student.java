package day05;

public class Student {
    String name;
    static String 소속 = "멋쟁이사자처럼";

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "전병우";
        s1.소속 = "멋쟁이사자처럼";

        String str = Student.소속;

        //근데 이것을 40면의 학생이 있다고 하면 40번을 다 입력해야되는 상황이 생긴다.
        //특히 소속의 경우는 모두 같을떄,, 소속 변수를 static 으로 필드를 정의하면 중복을 제거 할 수 있다.


    }
}
