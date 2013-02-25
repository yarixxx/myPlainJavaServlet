package problems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Problems1Test {

	private Problems1 problems;
	
	@Before
	public void setUp() throws Exception {
		problems = new Problems1();
	}

	@Test
	public void testSleepInDoubleFalseReturnsTrue() {
		assertTrue(problems.sleepIn(false, false));
	}
	
	@Test
	public void testSleepInTrueFalseReturnsFalse() {
		assertFalse(problems.sleepIn(true, false));
	}
	
	@Test
	public void testSleepInFalseTrueReturnsTrue() {
		assertTrue(problems.sleepIn(false, true));
	}
	
	@Test
	public void testSleepInTrueTrueReturnsTrue() {
		assertTrue(problems.sleepIn(true, true));
	}

}
