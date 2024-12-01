import java.io.*;
import java.util.StringTokenizer;

class Main {
/*
@Parameter
    1. int n : 총 물건의 개수
    2. int w : 각 물건의 무게
    3. int k : 배낭의 최대 무게
    4. int v : 각 물건의 가치
*/
    static Integer[][] dp;
    static int[] w;
    static int[] v;

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            w = new int[n];
            v = new int[n];
            dp = new Integer[n][k + 1];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                w[i] = Integer.parseInt(st.nextToken());
                v[i] = Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(knapsack(n - 1, k)));
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }


    }

    public static int knapsack(int i, int k) {
        // i가 0미만, 즉 범위 밖이 되면 0
        if (i < 0) {
            return 0;
        }
        // 방문을 안한 경우
        if (dp[i][k] == null) {
            if (w[i] > k) {
                // 현재 물건(i)을 추가로 못담는 경우 (이전 i값 탐색)
                dp[i][k] = knapsack(i - 1, k);
            } else {
                // 이전 i값과 이전 i값에 대한 k-W[i]의 값 + 현재 가치(V[i])중 큰 값을 저장
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - w[i]) + v[i]);
            }
        }
        return dp[i][k];
    }
}
