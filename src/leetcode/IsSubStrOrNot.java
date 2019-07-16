package leetcode;

public class IsSubStrOrNot {

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));

	}
	public static int strStr(String parent,String son) {
		if(son==null) {
			return -1;
		}
		if(son.equals("")) {
			return 0;
		}
		int m = parent.length();
		int n = son.length();
		int out =m -n;
		for(int i=0;i<=out;i++) {
			if(parent.substring(i, i+n).equals(son)) {
				return i;
			}
		}
		return -1;
	}
	
}
