package leetcode;

public class LongPalindromicSubstring {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		String str = s.longPalStr("cbbd");
		System.out.println(str);
	}
	
	
}
 class Solution{
	String out = "";
	public  String longPalStr(String s) {
		
		for(int i =0;i<s.length();i++) {
			compute(s,i,0);
			compute(s,i,1);
		}
		return out;
		
	}
	public  void compute(String s,int left,int offset) {
		int right = left+offset;
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		int begin = left+1;
		String cur = s.substring(begin, right);
		if(cur.length()>out.length()) {
			out= cur;
		}
		
	}
}
