class Solution {
    static class Run {
        char ch;
        int len;

        Run(char ch, int len) {
            this.ch = ch;
            this.len = len;
        }
    }

    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        String t = "1" + s + "1";
        List<Run> runs = new ArrayList<>();

        for (char c : t.toCharArray()) {
            if (runs.isEmpty() || runs.get(runs.size() - 1).ch != c) {
                runs.add(new Run(c, 1));
            } else {
                runs.get(runs.size() - 1).len++;
            }
        }

        int ans = ones;

        for (int i = 1; i + 1 < runs.size(); i++) {
            if (runs.get(i).ch == '1'
                    && runs.get(i - 1).ch == '0'
                    && runs.get(i + 1).ch == '0') {

                ans = Math.max(ans,
                        ones + runs.get(i - 1).len + runs.get(i + 1).len);
            }
        }

        return ans;
    }
}