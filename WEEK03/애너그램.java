import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        int[] sWord = new int[26]; // S와 T의 문자를 저장할 배열
        int[] tWord = new int[26];

        boolean x = true;

        for (int i = 0; i < S.length(); i++) { // 각 문자열을 잘라 char으로 바꾸고 97을 빼서 배열에 0부터 저장
            sWord[S.charAt(i) - 97] += 1;
            tWord[T.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < sWord.length; i++) { // S와 T의 char 아스키코드가 담긴 배열의 값이 다른경우 false
            if (sWord[i] != tWord[i]) {
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
