package com.zkz.javabasic.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class AnnotationParsing {

	public static void main(String[] args) {
		 try {
			for(Method method:AnnotationParsing.class.getClassLoader().loadClass("com.zkz.javabasic.annotations.AnnotationExample").getMethods()){
				 if(method.isAnnotationPresent(MethodInfo.class)){
					 	for(Annotation annot :method.getDeclaredAnnotations()){
					 		  System.out.println("--------------->"+annot.toString());
					 	}
					 	MethodInfo info=method.getAnnotation(MethodInfo.class);
					 	if(info.revision().equals("1.0.1")){
					 		System.out.println("--------------->版本号"+info.revision());
					 	}
				 }
			 }
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
