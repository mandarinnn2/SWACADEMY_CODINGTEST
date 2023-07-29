package AugustCodingTest.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class SmallEcho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> bread = new TreeMap<String, Integer>();

        String A = br.readLine();
        int N = Integer.valueOf(br.readLine());
        String B = br.readLine();
        int M = Integer.valueOf(br.readLine());

        bread.put(A, N); // 빵1 & 가격
        bread.put(B, M); // 빵2 & 가격

        if (bread.get(A) > bread.get(B))
            System.out.println(A);
        else if (bread.get(A) < bread.get(B))
            System.out.println(B);
        else
            System.out.println(bread.firstKey());
    }
}
