class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int maxlen = 0, maxfreq = 0;

        Map<Character, Integer> mp = new HashMap<>();

        while (r < s.length()) {

            char c = s.charAt(r);
            mp.put(c, mp.getOrDefault(c, 0) + 1);

            maxfreq = Math.max(maxfreq, mp.get(c));

            if ((r - l + 1) - maxfreq > k) {
                char leftchar = s.charAt(l);
                mp.put(leftchar, mp.get(leftchar) - 1);
                l++;
            }
if ((r - l + 1) - maxfreq <= k) {
            maxlen = Math.max(maxlen, r - l + 1);

            r++;
        }
        }
        return maxlen;
    }
}