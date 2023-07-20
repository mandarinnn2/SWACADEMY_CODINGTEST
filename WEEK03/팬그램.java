import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int[] A = new int[26];

        char c;
        boolean x = true;

        for (int i = 0; i < S.length(); i++) { 
          // 아스키코드에 따라 소문자 알파벳은 97부터 시작하지만
          // 배열에 간결하게 저장하기 위하여 97을 빼주어 0 위치부터 값을 저장해준다.
          // 변수명.charAt(문자위치) => String을 char형태로 바꾸어준다.
            c = S.charAt(i);
            A[c - 97] += 1;
        }

        for (int i = 0; i < A.length; i++) { // 문자열이 팬그램인지 아닌지 확인해준다.
            if (A[i] == 0) {
                x = false;
                break;
            }
        }

        if (x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
