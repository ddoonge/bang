package practice3;
//문제 4: 배열 요소의 이동
//String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요.
//마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
//String[] words = {"Java", "Python", "C", "JavaScript"};
public class Ex9 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};
        String lastWord = words[words.length - 1];// 이부분을 명심하고 해야겠다. 마지막에 값이 사라져서...

        for (int i = (words.length -1); i >= 0; i--) {
            if (i == 0) {
                words[i] = lastWord;
            } else {
                words[i] = words[i - 1];
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
