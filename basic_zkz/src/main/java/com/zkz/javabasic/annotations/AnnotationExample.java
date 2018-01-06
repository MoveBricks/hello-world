package com.zkz.javabasic.annotations;

public class AnnotationExample {

	public static void main(String[] args) {
	}
	
	@Override
	@MethodInfo(author="zkz",comments = "override toString mothod", date = "2018-1-6",revision="1.0.1")
	public String toString(){
		return null;
	}

}
