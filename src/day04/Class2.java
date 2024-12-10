package day04;
//모든 클래스는 생성자를 갖는다.
//컴파일러는 정의된 클래스에 생성자가 없다면 기본 생서자를 자동으로 만든다.

public class Class2 {
    //자바의 식별자는 대소문자를 구분.
    //카멜표기법 이용.
    //클래스명의 첫글자는 대문자로 그냥 해랴

    String title;
    String author;
    int price;
    int page;
    int since;
    int currentPage;

    public void 책장을넘기다(){
        currentPage++;
    }

    public void 책장을넘기다(int page) {
        currentPage = page;
    }

}
