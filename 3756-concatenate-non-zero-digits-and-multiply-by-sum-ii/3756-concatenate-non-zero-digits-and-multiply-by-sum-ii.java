class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        int n = s.length();

        // pow10[i] = 10^i % MOD
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // idx[i] = number of non-zero digits before index i
        int[] idx = new int[n + 1];

        // val[i] = value formed by first i non-zero digits
        long[] val = new long[n + 1];

        // total[i] = sum of first i non-zero digits
        long[] total = new long[n + 1];

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            if (d != 0) {
                cnt++;
                val[cnt] = (val[cnt - 1] * 10 + d) % MOD;
                total[cnt] = total[cnt - 1] + d;
            }

            idx[i + 1] = cnt;
        }

        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int left = idx[l];
            int right = idx[r + 1];

            if (left == right) {
                arr[i] = 0;
                continue;
            }

            int len = right - left;

            long num = (val[right] - (val[left] * pow10[len]) % MOD + MOD) % MOD;
            long sum = total[right] - total[left];

            arr[i] = (int) ((num * sum) % MOD);
        }

        return arr;
    }
}