package com.test;

import java.lang.ProcessBuilder.Redirect;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPangram {
	
	
	public static int[]merge(int[]a, int[]b){
		  int[]c = new int[a.length+b.length];
		  int i;
		  for(i=0; i<a.length; i++)
		     c[i] = a[i];

		     for(int j=0; j<b.length; j++)
		        c[i++]=b[j];
		        return c;
		}

	static int checkPangram(String s) {

		int startRange = 65;
		int endRange = 122;
		System.out.println(s.length());
		int result = 1;
		int x = 0;
		for (Character ch : s.toCharArray()) {

			if ((int) ch >= startRange && (int) ch <= endRange) {
				System.out.print((int) ch);
				System.out.print(" ");
				System.out.println(x);
				result = 1;

			}else{
			
				return  result=0;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		//int x = checkPangram("abcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRSTUVWX");
		//System.out.println("&&&&&&&&&&&&   " + x);
		
		Integer[] a={1,2,3,5};
		Integer[] b={6,7,9,15};
		String[] str={"adkjfas","ajfkldsjfdsk"};
		System.out.println(str[0]);
		
		List list = new ArrayList<Integer>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		//System.out.println(list);
		//
		//System.out.println(fact(5));
		
		//System.out.println(pow(3,3));
		
		float x=1234/5;
		
		System.out.println(x);
		
		int a1=0;
		float bf=0;
		long c=0;
		double d=0;
		double Output = (a1+c)*(bf+d) ;
		System.out.println(0*23 & 0*24);
		
		
		int d2=5;
		
		
		
		draw(5);
		
		System.out.println(crunchifyPermutation("abc"));
		
				
				
		
		//int c[]=merge(a, b);
		
		
			
		}
	
	
	static int fact(int nu){
		//System.out.println(nu);
		int result=1;
		if(nu==0){
			
			return result;
			
		}
		
		result =  nu*fact(nu-1);
		
		return result;
		
		
	}
	
	
	static int pow(int base , int power){
		int result = 1;
		if(power ==0){
			return result;
		}
		
		result = base* pow(base,power -1) ;
		
		return result;
		}
	static int result =5;	
	static int result1 =1;

static void draw(int x){
	
	for(int i=0;i<x;i++){
		
		for(int j=0;j<=i;j++){
			System.out.print("*");
			
		}
		System.out.println("heloooooooooooooooooooooooooooooo");
	}
		
	}

public static Set<String> crunchifyPermutation(String str) {
	Set<String> crunchifyResult = new HashSet<String>();
	if (str == null) {
		return null;
	} else if (str.length() == 0) {
		crunchifyResult.add("");
		return crunchifyResult;
	}

	char firstChar = str.charAt(0);
	String rem = str.substring(1);
	Set<String> words = crunchifyPermutation(rem);
	for (String newString : words) {
		for (int i = 0; i <= newString.length(); i++) {
			crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
		}
	}
	return crunchifyResult;
}

public static String crunchifyCharAdd(String str, char c, int j) {
	String first = str.substring(0, j);
	String last = str.substring(j);
	return first + c + last;
}
	
	
}

