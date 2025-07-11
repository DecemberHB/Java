package test3;

public class study {
	public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전 배열:");
        printArray(data);
        System.out.println();

        bubbleSortWithSteps(data);  // 정렬 + 중간과정 출력

        System.out.println("\n정렬 후 배열:");
        printArray(data);
    }

    public static void bubbleSortWithSteps(int[] data) {
        int n = data.length; // 7

        for (int i = 0; i < n - 1; i++) { //0~6번 반복 
            System.out.println("회차 i = " + i + " ------------------");
            for (int j = 0; j < n - 1 - i; j++) { //0 ~ 6번까지 비교
                System.out.print("  비교 j = " + j + ": ");
                System.out.print(data[j] + " vs " + data[j + 1]);

                if (data[j] > data[j + 1]) {
                    // 값 바꾸기
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    System.out.print(" → 교환됨");
                } else {
                    System.out.print(" → 그대로");
                }

                // 현재 배열 상태 출력
                System.out.print(" → 현재 배열: ");
                printArray(data);
            }
            System.out.println(); // 줄 구분용
        }
    }

    // 배열 출력용 메서드
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
