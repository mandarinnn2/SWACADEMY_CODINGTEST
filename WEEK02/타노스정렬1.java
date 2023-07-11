import java.util.Scanner;
import java.lang.Math; // floor를 사용하기 위하여 import

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //  테스트 케이스 개수
        int[] A;

        for(int i = 0; i < T; i++){
            int N = sc.nextInt(); // 수열의 길이
            A = new int[N];

            for(int j = 0; j < N; j++)
                A[j] = sc.nextInt(); // 수열 원소 입력받기

            for(int j = 0; j < N; j++){ // A[j] > A[j + 1] 조건을 확인하기
                if(N == 1 || j == N - 1) // N이 1이거나 (원소가 하나이거나) || j값이 N-1과 같은 경우(array out of bound 방지)
                    break;
                if(A[j] > A[j + 1]){ // 조건을 충족하면 값을 2로 나눠주기
                    A[j] = (int)(Math.floor(A[j] / 2));
                    j = -1; // for문이 끝나면 j++ 때문에 자동으로 +1이 되기 때문에 -1로 바꾸어 j=0부터 시작하도록 한다.
                }
            }

            for(int j = 0; j < N; j++)
                System.out.print(A[j] + " "); // 수열 원소 출력하기
            System.out.println();
        }
    }
}
