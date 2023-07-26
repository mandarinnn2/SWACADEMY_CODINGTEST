import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray(); // 문자열 S와 T를 char 배열로 입력받기
        char[] T = br.readLine().toCharArray();

        int j = 0;

        for (int i = 0; i < S.length; i++) {
            if(j < T.length && S[i] == T[j]) // S와 T의 원소들을 비교하기
                j++;
        }
        System.out.println(j == T.length ? "YES" : "NO"); // j값과 T의 길이가 같으면 YES
    }
}
