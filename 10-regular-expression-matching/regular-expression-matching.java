class Solution {
    private String s, p;
    private Boolean[][] memo;

    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        memo = new Boolean[s.length() + 1][p.length() + 1];
        return match(0, 0);
    }

    private boolean match(int i, int j) {
        if (memo[i][j] != null) return memo[i][j];
        boolean ans;
        if (j == p.length()) {
            ans = i == s.length();
        } else {
            boolean first = i < s.length()
                && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                ans = match(i, j + 2) || (first && match(i + 1, j));
            } else {
                ans = first && match(i + 1, j + 1);
            }
        }
        return memo[i][j] = ans;
    }
}