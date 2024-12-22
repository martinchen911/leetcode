
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i=0;i<s.length();i++) {

            String res1 = p(s,i,i);
            String res2 = p(s,i,i+1);
            res = res.length() >= res1.length() ? res:res1;
            res = res.length() >= res2.length() ? res:res2;
        }
        return res;
   }

    public String p(String s, int l, int r) {
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
            l++;
            r++;
        }
        return s.substring(l+1, r);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
