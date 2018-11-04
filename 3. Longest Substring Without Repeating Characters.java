/*
    3. Longest Substring Without Repeating Characters
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int size = s.length();
        Set<Character> set = new HashSet<Character>();
        int result = 0, i = 0, j = 0;
        while(i < size && j < size){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                result = Math.max(result, j-i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}

//faster
//use a hashMap to store the max index of the character
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}