package CodingTest;

import java.util.Scanner;

public class TestC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        int[] A;
        int x = 0; // 값을 변경할 때 쓰는 수
        int count;

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 수열의 길이
            A = new int[N];
            count = N;

            for (int j = 0; j < N; j++) // 배열에 값 저장
                A[j] = sc.nextInt();

            for (int j = 1; j < count; j++) { // A[i - 1] > A[i] 인 경우 A[i] 제거
                if (A.length == 1) // 값이 하나인 경우 break
                    break;
                if (A[j - 1] > A[j]) { // 조건에 충족하는 경우
                    for (int k = j; k < count - 1; k++) // 배열의 값을 한 칸씩 당김
                        A[k] = A[k + 1];
                    count--;
                    j = 0; // 배열의 처음부터 다시 탐색
                }
            }

            for (int j = 0; j < count; j++) 
                System.out.print(A[j] + " "); // 배열 출력
            System.out.println();
        }
    }
}
