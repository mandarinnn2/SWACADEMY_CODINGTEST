import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열크기
        int M = sc.nextInt(); // 섞는 횟수

        int[] arr = new int[N]; // 배열

        for(int i = 0; i < N; i++) // 배열 값 저장
            arr[i] = i + 1;

        for(int i = 0; i < M; i++){ // 배열 순서 섞기
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int j = arr[x - 1]; // 새로운 변수 j를 활용하여 값을 바꿔준다
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = j;
        }

        for(int i = 0; i < N; i++)
            System.out.print(arr[i] + " "); // 배열 값 출력
    }
}
