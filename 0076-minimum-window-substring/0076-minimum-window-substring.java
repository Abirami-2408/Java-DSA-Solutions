class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int l = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add s[r]
            if (freq[s.charAt(r)] > 0) {
                cnt++;
            }

            freq[s.charAt(r)]--;

            // Valid window
            while (cnt == t.length()) {

                // Update minimum
                if (r - l + 1 <= minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                // Remove s[l]
                freq[s.charAt(l)]++;

                if (freq[s.charAt(l)] > 0) {
                    cnt--;
                }

                l++;
            }
        }
if (minLen == Integer.MAX_VALUE)
    return "";
        return s.substring(start, start + minLen);
    }
}