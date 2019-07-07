package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReserveString {
public static void main(String[] args) {
	char []a  = {'h','e','l','l','o'};
	String stre = String.valueOf(a);
	StringBuilder sb = new StringBuilder(stre);
	
	StringBuilder sb1 = new StringBuilder(sb.reverse());
	
	String str = String.valueOf(sb1);
	System.out.println(str.toCharArray());
	digit("love23next234csdn3423javaeye");
}
public static void digit(String s) {
	List<String> list = new ArrayList<String>();
	String str;
	str = s.replaceAll("\\D",",");
	int num =0;
	String [] out = str.split(",");
	ArrayList<String> a = new ArrayList<String>();
	for(String o:out) {
		if(o.length()>0) {
			a.add(o);
		}

	}
	for(String ss:a) {
		num+=Integer.parseInt(ss);
	}
	System.out.println(num);
}
}


