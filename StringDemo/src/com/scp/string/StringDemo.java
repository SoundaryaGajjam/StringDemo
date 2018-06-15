package com.scp.string;

public class StringDemo {
	public static void main(String[] args) {
		String str1="0-42L";
		String str2="0-43-";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()==str2.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
