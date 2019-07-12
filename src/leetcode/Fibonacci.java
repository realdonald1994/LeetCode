package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	fibonacci(num);
}
public static void fibonacci(int num) {
	List<Integer> list = new LinkedList<Integer>();
	list.add(0,0);
	list.add(1,1);
	for(int i=2;i<num;i++) {
		list.add(i,list.get(i-1)+list.get(i-2));
	}
	for(Integer i :list) {
		System.out.print(i+" ");
	}
}
}
