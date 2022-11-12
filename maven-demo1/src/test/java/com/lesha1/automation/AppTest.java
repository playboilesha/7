package com.lesha1.automation;

import org.junit.Assert;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 * 
 * @author vitali_shulha
 */

public class AppTest {

	int x;
	int y;
	int z;
	double x1;
	double y1;

	String str;
	String str2;

	@Before

	public void setUp() {
		x = 2;
		y = 2;
		z = 1;
		str = "привет это я";
		str2 = "Hello world";

	}

	@Test
	public void testApp() {
		int rezult = 4;
		Assert.assertEquals(rezult, App.add(x, y));
	}

	@Test
	public void testSub() {
		int rezult = 0;
		Assert.assertEquals(rezult, App.sub(x, y));
	}

	@Test
	public void testUmn() {
		int rezult = 4;
		Assert.assertEquals(rezult, App.umn(x, y));
	}

	@Test
	public void testapp() {
		double rezult = 4;
		Assert.assertEquals(rezult, rezult, SquareEquation.Rez(x, y, z));
	}

	@Test
	public void testdelspace() {

		String rezult = "приветэтоя";
		Assert.assertEquals(rezult, SquareEquation.removeSpace(str));
	}

	@Test
	public void testvidstr() {

		String rezult = "Bye world";
		Assert.assertEquals(rezult, SquareEquation.ZamenaStr(str2));
	}

}