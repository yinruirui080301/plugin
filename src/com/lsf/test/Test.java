package com.lsf.test;

import java.util.ServiceLoader;

import com.lsf.graphic.Shape;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ServiceLoader<Shape> shapes=ServiceLoader.load(Shape.class);
	  for(Shape s:shapes) {
		  System.out.println(s.area());
	  }
	}

}
