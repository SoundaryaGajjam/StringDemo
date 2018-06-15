package com.scp.string;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringFunctionDemo {
	public static void main(String[] args) {
		//differntent ways of initializting string
		
		String st1="John";
		String s2=new String("John");
		char []c={'a','b','c','d','e','f','g','h'};
		String s3=new String(c);
		String s4="XYZ"+st1+s2;
		byte []b={'A','b'};
		String s5=new String(b);
		System.out.println(s4+s5);
		
		//Convert CharArray to String obj
		System.out.println(String.copyValueOf(c));
		System.out.println(String.copyValueOf(c, 2, 4));
		
		//Concatination of String 
		System.out.println("Using + : "+st1+s2);
		System.out.println("Using concat() : "+st1.concat(s2));
		//System.out.println("Using Join() : "+st1.join(s2));
		
		//Comparing 2 string
		if(st1.equals(s2))
			System.out.println("both string equal");
		else
			System.out.println("both string not equal");
		
		//Ignoring case
		if(st1.equalsIgnoreCase(s2))
			System.out.println("equal");
		else
			System.out.println("not equal");
				
		
		//Comparing String Buffer with String obj
		//String s2="John";
		String s1=new String("JohnJohn");
		StringBuffer sb=new StringBuffer("John");
		//if(s1.equals(sb))	//it call str equals() & always false bcoz String n StringBuffer is not frm same cls 
		
		if(s1.contentEquals(sb))
			System.out.println("Both str equal");
		else
			System.out.println("Both str not equal");
		
		
		//get byte[] from String
		byte[] b1=s1.getBytes();
		System.out.println("String length :"+s1.length());
		System.out.println("Byte length : "+b1.length);
		
		//indexOf() & lastIndexOf()
		System.out.println("Index of : "+s1.indexOf('a'));
		System.out.println("Last Index of : "+s1.lastIndexOf('a'));
		System.out.println("Index of : "+s1.indexOf('a',7));//start searching  frm 7 location
		System.out.println(s1.startsWith("Ga"));
		
		//split string using delimeter
		String str="	Today is 	beautiful 	day		";
		String []token;
		//token=str.split(" ");
		token=str.split("\\s+");
		for (String item : token) 
			System.out.println(item);
		
		//extract char from string
		char []ch=new char[6];
		str.getChars(2, 7, ch,0 );
		System.out.println(ch);
		
		//replace str character
		System.out.println(str.replace('i',	'I'));
		System.out.println(str.replaceFirst("is", "IS"));
		System.out.println(str.replaceAll("a", "A"));
		System.out.println(str);
		
		//change str case
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//remove the extra spaces not in the middle
		System.out.println(str.trim());
				
		//format given string
		String strFrmt="This is %s format example ";
		System.out.println(String.format(strFrmt,"string"));
		String strFrmt1="we r displaying no %d ";
		System.out.println(String.format(strFrmt1, 10));
		
		System.out.println(String.format(Locale.US,strFrmt1, 20));
		
		//remove multiple spaces frm string
		StringTokenizer st=new StringTokenizer(str, " ");
		StringBuffer sb1=new StringBuffer();
		while(st.hasMoreElements())
			sb1.append(st.nextElement()).append(" ");
		System.out.println(sb1.toString().trim());
		
		
		
		//get line count
		String lineCnt="line1\nline2\nline3\nlin4";
		int cnt=lineCnt.split("[\n|\r]").length;
		System.out.println("line count : "+cnt);
		
		
		
		
	}
	
	

}
