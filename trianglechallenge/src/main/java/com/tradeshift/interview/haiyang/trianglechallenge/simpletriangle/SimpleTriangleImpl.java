package com.tradeshift.interview.haiyang.trianglechallenge.simpletriangle;

import com.tradeshift.interview.haiyang.trianglechallenge.model.IllegalTriangleException;
import com.tradeshift.interview.haiyang.trianglechallenge.model.Triangle;

public class SimpleTriangleImpl implements Triangle {

	private SimpleTriangleImpl() {

	}

	public SimpleTriangleImpl(double side1, double side2, double side3) throws IllegalTriangleException {

		if (!isSidesLegal(side1, side2, side3)) {
			throw new IllegalTriangleException();
		}

		sides[0] = side1;
		sides[1] = side2;
		sides[2] = side3;
	}

	public boolean isEquilateral() {

		if (sides[0] == sides[1] && sides[1] == sides[2] && isSidesLegal(sides[0], sides[1], sides[2])) {
			return true;
		}

		return false;
	}

	public boolean isIsosceles() {

		if (sides[0] == sides[1] || sides[1] == sides[2]
				|| sides[0] == sides[2] && isSidesLegal(sides[0], sides[1], sides[2])) {
			return true;
		}

		return false;
	}

	public boolean isScalene() {
		if (!this.isEquilateral() && !this.isIsosceles() && isSidesLegal(sides[0], sides[1], sides[2])) {
			return true;
		}
		return false;
	}

	private boolean isSidesLegal(double side1, double side2, double side3) {

		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}

		if (side1 + side2 <= side3) {
			return false;
		}

		return true;

	}

	private double sides[] = { 0.0, 0.0, 0.0 };

}
