package problems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Problems2Test {

	private Problems2 problems;

	@Before
	public void setUp() throws Exception {
		problems = new Problems2();
	}

	@Test
	public void testDoubleHi() {
		assertEquals(problems.stringTimes("Hi", 2), "HiHi");
	}
	
	@Test
	public void testTripleHi() {
		assertEquals(problems.stringTimes("Hi", 3), "HiHiHi");
	}
	
	@Test
	public void testOnceHi() {
		assertEquals(problems.stringTimes("Hi", 1), "Hi");
	}
	
	@Test
	public void testZeroHi() {
		assertEquals(problems.stringTimes("Hi", 0), "");
	}
	
	@Test
	public void testFiveHi() {
		assertEquals(problems.stringTimes("Hi", 5), "HiHiHiHiHi");
	}

	@Test
	public void testTwoOh() {
		assertEquals(problems.stringTimes("Oh!", 2), "Oh!Oh!");
	}
	
	@Test
	public void testXHi() {
		assertEquals(problems.stringTimes("x", 4), "xxxx");
	}
	
	@Test
	public void testCode3() {
		assertEquals(problems.stringTimes("code", 3), "codecodecode");
	}
	
	@Test
	public void testCode2() {
		assertEquals(problems.stringTimes("code", 2), "codecode");
	}

}
