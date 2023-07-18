import java.util.*;

public class CodingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine(); // 문자열 입력받기
        String X = S; // 문자열 복제

        S = S.substring(0, S.length() / 2); // 문자열 반으로 자르기

        if(X.length() % 2 != 0) // 문자열이 짝수, 홀수냐에 따라 다르게 자르기
            X = X.substring(X.length() / 2 + 1, X.length()); 
        else
            X = X.substring(X.length() / 2, X.length());

        StringBuffer sb = new StringBuffer(X);
        String reverse = sb.reverse().toString();
        // StringBuffer : 문자열을 추가하거나 변경할 때 사용하는 자료형
        // reverse() : 내용의 순서를 뒤집어준다.
        // toString() : String형태로 변경해준다.

        if (S.equals(reverse)) // 뮨자열 비교하기
            System.out.println("YES");
        else
            System.out.println("NO");

      // 문제 풀이 방법
        // 문자열을 반으로 자른다
        // 반으로 나눠서 앞부분과
        // 역으로 바꾼 뒷부분을 비교하여 같으면 YES 다르면 NO

    }
}
