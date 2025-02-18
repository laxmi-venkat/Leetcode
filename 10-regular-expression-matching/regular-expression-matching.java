class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[] dp = new boolean[n + 1];
        
        dp[0] = true; // Base case

        // Initialize pattern cases with '*'
        for (int j = 2; j <= n; j += 2) {
            if (p.charAt(j - 1) == '*') {
                dp[j] = dp[j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            boolean prev = dp[0]; // Store dp[i-1][j-1] for the first column
            dp[0] = false;
            for (int j = 1; j <= n; j++) {
                boolean temp = dp[j]; // Save current state before updating
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[j] = prev; // Match case
                } else if (p.charAt(j - 1) == '*') {
                    dp[j] = dp[j - 2]; // Zero occurrence case
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[j] |= temp; // One or more occurrence case
                    }
                } else {
                    dp[j] = false;
                }
                prev = temp;
            }
        }

        return dp[n];
    }
}
