package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		TriangleSolution ts = new TriangleSolution();
		List<List<Integer>> alllist = ts.generate(5);
		for(List<Integer> l: alllist) {
			System.out.println(l);
		}
	}
}

class TriangleSolution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> alllist = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
			alllist.add(new ArrayList<Integer>(list));//[1][1,1][1,2,1][1,3,3,1]
		}
		return alllist;
	}
}
