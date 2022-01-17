package com.interview;

import javax.annotation.processing.SupportedSourceVersion;

public class JavaCollectionPractice {// how to reverse
	
	
	public void getSwap(int a,int b) {
		
		System.out.println("A value before swap ="+a);
		System.out.println("B value before swap"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A value after swap="+a);
		System.out.println("B value after swap="+b);
		
	}
	
	
	public static void main(String[] args) {
		JavaCollectionPractice obj = new JavaCollectionPractice();
		obj.getSwap(5, 10);
	}
	
}
	
	
	
	