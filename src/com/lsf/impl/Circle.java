package com.lsf.impl;

import com.lsf.graphic.Shape;

public class Circle implements Shape {
       private int r;
       public Circle(){r=1;}
       public Circle(int r){this.r=r;}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
