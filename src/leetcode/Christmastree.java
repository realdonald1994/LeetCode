package leetcode;

import java.util.Scanner;

/**
 * 
 * @author donald
 *
 * Jul 11, 2019
 */
public class Christmastree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	print(num);
}
public static void print(int num) {
	num = num+1;
	for(int i=1;i<num;i++) {
		for(int j=num;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
