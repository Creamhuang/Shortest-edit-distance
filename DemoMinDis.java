package com.agrothrim.exercise4;

import java.util.Scanner;

public class DemoMinDis {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÁ½ĞĞ×Ö·û´®:");
		Scanner read=new Scanner(System.in);
		
		String s1=read.nextLine();
		String s2=read.nextLine();
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		new Min_Distance().minDistance(a,b);
	}

}
