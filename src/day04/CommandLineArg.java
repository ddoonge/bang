package day04;

public class CommandLineArg {
    public static void main(String[] args) {
        //명령 행 아규먼트(Command-Line Arguments)
        //강좌에서 많이 사용된 배열이 무엇인지 물어본다면 그것은 바로 main메소드에 있는
        //String[] args
        //main메소드는 JVM이 실행하는 메소드이다.
        //JVM이 main메소드를 실행할 때 String[]을 아규먼트로 넘겨 준다는 것을 의미합한
        //다.

        System.out.println(args.length);

        if (args.length == 0) {
            System.out.println("사용법: ");
            System.exit(0);//뭔가 예상치못한 상황떄 종료 해야 될떄, 사용.
            //return; 으로 사용 가능.

        }
        for (String arg : args) {
            System.out.print(arg+ " ");
        }
    }
}
