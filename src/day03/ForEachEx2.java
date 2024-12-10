package day03;

public class ForEachEx2 {
    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6,}};

        for (int[] array : arrays) {
            for (int i : array) {
                System.out.println(i);
            }
        }

        String[][][] strArr1 = {
                {{"안녕"}, {"뱅우"}, {"사람"}, {"메로나"}},
                {{"비비빅"},{"비빔밥"},{"아이스크림"}}
        };

        for (String[][] s1 : strArr1) {
            for (String[] s2 : s1) {
                for (String s : s2) {
                    System.out.println(s);
                }
            }
        }
    }
}
