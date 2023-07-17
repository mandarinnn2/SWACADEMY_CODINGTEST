import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        if(S.indexOf(T) != -1) 
            // 변수명.indexOf(변수명) => 특정 문자열 포함 여부 반환
            // 특정 문자열 포함시 위치 반환
            // 미포함시 -1 반환
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
