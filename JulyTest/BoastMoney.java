package AugustCodingTest.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BoastMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine()); // 인원 수
        int[] a = new int[N + 1]; // 가진 돈
        int[] b = new int[N + 1]; // 가진 돈 정렬

        String R = br.readLine();
        StringTokenizer st = new StringTokenizer(R);

        for (int i = 1; i < N + 1; i++) {
            a[i] = Integer.valueOf(st.nextToken());
            b[i] = a[i];
        }

        Arrays.sort(b); // a를 복사햔 b는 정렬

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (a[i] == b[j])
                    System.out.println((j - 1) + " " + (N - j)); // 적은 수 & 많은 수
            }
        }
    }
}
