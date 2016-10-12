package com.tradeshift.interview.haiyang.trianglechallenge;

import com.tradeshift.interview.haiyang.trianglechallenge.model.Triangle;

public class SimpleTriangleImpl implements Triangle {

	public SimpleTriangleImpl(double side1, double side2, double side3) {
		sides[0] = side1;
		sides[1] = side2;
		sides[2] = side3;
	}
	
	public boolean isEquilateral() {
		
		return false;
	}

	public boolean isIsosceles() {
		
		return false;
	}

	public boolean isScalene() {
		
		return false;
	}
	
	private boolean isSidesValid(double side1, double side2, double side3) {
		return false;
		
	}

	private double sides[] = {0.0, 0.0, 0.0};
	
}
