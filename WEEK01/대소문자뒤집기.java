import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        char[] charArr = S.toCharArray();

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] >= 65 && charArr[i] <= 90)
                charArr[i] += 32;
            else
                charArr[i] -= 32;
            System.out.print(charArr[i]);
        }
    }
}
