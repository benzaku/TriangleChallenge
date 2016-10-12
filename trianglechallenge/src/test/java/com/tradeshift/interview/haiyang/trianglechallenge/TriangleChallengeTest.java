package com.tradeshift.interview.haiyang.trianglechallenge;

import com.tradeshift.interview.haiyang.trianglechallenge.model.IllegalTriangleException;
import com.tradeshift.interview.haiyang.trianglechallenge.model.Triangle;
import com.tradeshift.interview.haiyang.trianglechallenge.simpletriangle.SimpleTriangleImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TriangleChallengeTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TriangleChallengeTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TriangleChallengeTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testCreateScaleneTriangle() {
		Exception unexpectedException = null;
		Triangle t = null;
		try {
			t = new SimpleTriangleImpl(3.0, 4.0, 5.0);
		} catch (IllegalTriangleException e) {
			unexpectedException = e;
		} finally {
			assertNull(unexpectedException);
			assertNotNull(t);
			assertTrue(t.isScalene());
			assertFalse(t.isEquilateral());
			assertFalse(t.isIsosceles());
		}
	}
	
	public void testCreateEquilateralTriangle() {
		Exception unexpectedException = null;
		Triangle t = null;
		try {
			t = new SimpleTriangleImpl(6.6, 6.6, 6.6);
		} catch (IllegalTriangleException e) {
			unexpectedException = e;
		} finally {
			assertNull(unexpectedException);
			assertNotNull(t);
			assertTrue(t.isEquilateral());
			assertTrue(t.isIsosceles());
			assertFalse(t.isScalene());
		}
	}
	
	public void testCreateIsoscelesTriangle() {
		Exception unexpectedException = null;
		Triangle t = null;
		try {
			t = new SimpleTriangleImpl(9, 5, 5);
		} catch (IllegalTriangleException e) {
			unexpectedException = e;
		} finally {
			assertNull(unexpectedException);
			assertNotNull(t);
			assertFalse(t.isEquilateral());
			assertTrue(t.isIsosceles());
			assertFalse(t.isScalene());
		}
	}
	
	public void testCreateIllegalTriangleWithLengthBelowZero() {
		Exception expectedException = null;
		Triangle t = null;
		try {
			t = new SimpleTriangleImpl(-1.1, 3.2, 2.7);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		
		try {
			t = new SimpleTriangleImpl(3.1, -3.2, 0.1);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		
		try {
			t = new SimpleTriangleImpl(3.1, 2.2, -0.1);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
	}
	
	public void testCreateIllegalTriangleWithLengthZero() {
		Exception expectedException = null;
		Triangle t = null;
		try {
			t = new SimpleTriangleImpl(0, 0, 0);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(0, 1, 2);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(1, 0, 3);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(1, 2, 0);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(1, 0, 0);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(0, 1, 0);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
		
		expectedException = null;
		t = null;
		try {
			t = new SimpleTriangleImpl(0, 0, 1);
		} catch (IllegalTriangleException e) {
			expectedException = e;
		} finally {
			assertNotNull(expectedException);
			assertNull(t);
		}
	}

}
