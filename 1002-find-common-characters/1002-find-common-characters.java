import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {

        int[] freq = new int[26];

        // Initially count characters in first string
        for (char ch : words[0].toCharArray()) {
            freq[ch - 'a']++;
        }

        // Check remaining strings
        for (int i = 1; i < words.length; i++) {

            int[] temp = new int[26];

            // Count characters in current string
            for (char ch : words[i].toCharArray()) {
                temp[ch - 'a']++;
            }

            // Update minimum frequency
            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], temp[j]);
            }
        }

        // Store common characters
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {
                ans.add("" + (char)(i + 'a'));
                freq[i]--;
            }
        }

        return ans;
    }
}