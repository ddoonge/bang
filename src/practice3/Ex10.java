package practice3;

public class Ex10 {
    //문제 5: 두 배열의 합집합 구하기
    //int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고,
    //결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
    //int[] array1 = {1, 3, 5, 7, 9};
    //int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        // 두 배열의 최대 크기만큼의 결과 배열 생성
        int[] unionArray = new int[array1.length + array2.length];
        int index = 0;

        // array1의 모든 요소를 결과 배열에 추가
        for (int i = 0; i < array1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array1[i] == unionArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unionArray[index++] = array1[i];
            }
        }

        // array2의 모든 요소를 결과 배열에 추가
        for (int i = 0; i < array2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array2[i] == unionArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unionArray[index++] = array2[i];
            }
        }

        // 결과 배열 출력
        System.out.print("합집합 배열: ");
        for (int i = 0; i < index; i++) {
            System.out.print(unionArray[i] + " ");
        }
    }
}


