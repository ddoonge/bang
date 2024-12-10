package day07;

public class ExamClass {
    private String name;

    public String concat(String word) {
        name = name + word;
        return  name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ExamClass e1 = new ExamClass();
        e1.setName("전");

        System.out.println(e1.getName());

        e1.concat("병우");
        System.out.println(e1.getName());

        String str1 = "전";

        //원래것을 바꾸는 것이 아닌 새로운 것으로 생성학 바꾼다.
        str1 = str1.concat(("병우"));

        System.out.println(str1);
        System.out.println(str1);
    }

}
