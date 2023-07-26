import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray(); // 문자열 S를 각각 char배열로 저장
        char[] T = br.readLine().toCharArray(); // S와 비교할 문자열 T도 마찬가지

        Arrays.sort(S); // 배열 S와 T를 비교하기 위해 모두 정렬
        Arrays.sort(T);

        boolean x = true; // 서로 값이 다른 경우 false
        for (int i = 0; i < S.length; i++) {
            if(S[i] != T[i]){
                x = false;
                break;
            }
        }

        if(x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
