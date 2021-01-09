package Basic_Scripts;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
//String reverse without pre defined functions
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		str = sc.nextLine();
		for(int i=str.length(); i>0; --i) {
			System.out.print(str.charAt(i-1));
		}
		
//Using predefined function
		/*
		String str1;
		Scanner scr = new Scanner(System.in);
		System.out.println("enter str1");
		str1= scr.nextLine();
		StringBuffer a = new StringBuffer(str1);
		System.out.println(a.reverse());
		**/
		
	}

}
