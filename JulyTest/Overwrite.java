package AugustCodingTest.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Overwrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine()); // 길이

        String A = br.readLine(); // 원소
        StringTokenizer st = new StringTokenizer(A);

        int a[] = new int[N];
        int c[] = new int[N];

        for (int i = 0; i < N; i++)
            a[i] = Integer.valueOf(st.nextToken());

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (a[i] == a[j])
                    c[i]++;
            }
        }
        Arrays.sort(c);

        System.out.println(N - c[N - 1]);
    }
}
