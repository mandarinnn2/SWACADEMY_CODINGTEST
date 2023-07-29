package AugustCodingTest.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I18n {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        System.out.println(Character.toString(S.charAt(0)) + (S.length() - 2) + S.charAt(S.length() - 1));
        // 첫번째 문자 + 생략된 문자 수 + 마지막 문자


    }
}
