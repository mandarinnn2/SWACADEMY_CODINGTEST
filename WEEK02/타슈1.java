import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        int[] A;
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 대여소 개수

            A = new int[N];
            for (int j = 0; j < N; j++)
                A[j] = sc.nextInt(); // 대여소 별 타슈 개수

            int M = sc.nextInt();
            for (int j = 0; j < M; j++) {
                int U = sc.nextInt(); // 빌린 곳
                int V = sc.nextInt(); // 반납한 곳
                A[U - 1] -= 1; 
                A[V - 1] += 1;
            }

            for(int j = 0; j < N; j++){
                System.out.print(A[j] + " "); // 각 대여소 별 타슈 개수 출력
            }
            System.out.println();
        }
    }
}
