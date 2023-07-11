import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수
        int[] A;
        int x = 0; // 스파이의 위치

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 수열의 길이

            A = new int[N];
            for (int j = 0; j < N; j++) // 배열 A에 원소 입력
                A[j] = sc.nextInt();

            for (int j = 0; j < N; j++) {
                if(j == N - 2){ // for문을 계속 돌다 j가 N-2와 같아지면 x는 N값(가장 마지막에 있는 값)이 된다. 
                    x = N;
                    break;
                }
                if (A[j] != A[j + 1]) { // A[j], A[j+1], A[j+2] 이 세가지 값을 한 번에 비교하여 다른 값을 찾아준다.
                    if (A[j + 1] != A[j + 2]) { //1, 2번째 값이 서로 다를 때,
                        x = j + 2; // 2, 3번 값도 다른 경우 스파이는 2
                        break;
                    } else { // 2, 3번 값이 같은 경우 스파이는 1
                        x = j + 1;
                        break;
                    } // 값을 비교했을 때 같은 경우 값이 다를 때까지 for문을 돈다.
                }
            }
            System.out.println(x); // 스파이 위치 출력하기
        }
    }
}
