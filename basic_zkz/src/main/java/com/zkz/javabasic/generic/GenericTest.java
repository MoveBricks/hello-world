package com.zkz.javabasic.generic;

public class GenericTest {

	public static void main(String[] args) {
		Generic<Integer> generic=new Generic(123456);
		System.out.println("----------->"+generic.getKey());
	}

}
