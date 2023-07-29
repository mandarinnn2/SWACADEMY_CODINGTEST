package AugustCodingTest.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnowRemoval {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine()); // 마당크기
        String R = br.readLine(); // 꼭짓점 2개

        StringTokenizer st = new StringTokenizer(R);

        int r1 = Integer.valueOf(st.nextToken());
        int c1 = Integer.valueOf(st.nextToken());
        int r2 = Integer.valueOf(st.nextToken());
        int c2 = Integer.valueOf(st.nextToken());

        int x;
        if (r2 < r1) {
            x = r1;
            r1 = r2;
            r2 = x;
        }

        if (c2 < c1) {
            x = c1;
            c1 = c2;
            c2 = x;
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (i >= r1 && i <= r2 && j >= c1 && j <= c2)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
