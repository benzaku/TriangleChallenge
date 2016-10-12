package com.tradeshift.interview.haiyang.trianglechallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tradeshift.interview.haiyang.trianglechallenge.model.IllegalTriangleException;
import com.tradeshift.interview.haiyang.trianglechallenge.model.Triangle;
import com.tradeshift.interview.haiyang.trianglechallenge.simpletriangle.SimpleTriangleImpl;

/**
 * Hello world!
 *
 */
public class TriangleChallenge {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = "";
		double sides[] = new double[3];
		try {
			inputLine = br.readLine();
			String[] lineInStr = inputLine.split(" ");

			if (lineInStr.length != 3) {
				System.err.println("Input Wrong!");
			}

			sides[0] = Double.parseDouble(lineInStr[0]);
			sides[1] = Double.parseDouble(lineInStr[1]);
			sides[2] = Double.parseDouble(lineInStr[2]);

			Triangle t = new SimpleTriangleImpl(sides[0], sides[1], sides[2]);
			
			if (t.isEquilateral()) {
				System.out.println("Equilateral Triangle!");
			}
			
			if (t.isIsosceles()) {
				System.out.println("Isosceles Triangle!");
			}
			
			if (t.isScalene()) {
				System.out.println("Scalene Triangle");
			}

		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Number Format!");
		} catch (IOException e) {
			System.err.println("Input Wrong!");
		} catch (IllegalTriangleException e) {
			System.err.println("Your input of triangle sides cannot form a triangle");
		} catch (Exception e) {
			System.err.println("Unknown Error!");
		}
	}
}
