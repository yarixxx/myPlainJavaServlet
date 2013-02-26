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

	@Test
	public void testMonkeyTroubleTrueTrueReturnsTrue() {
		assertTrue(problems.monkeyTrouble(true, true));
	}

	@Test
	public void testMonkeyTroubleFalseFalseReturnsTrue() {
		assertTrue(problems.monkeyTrouble(false, false));
	}

	@Test
	public void testMonkeyTroubleTrueFalseReturnsFalse() {
		assertFalse(problems.monkeyTrouble(true, false));
	}

	@Test
	public void testMonkeyTroubleFalseTrueReturnsFalse() {
		assertFalse(problems.monkeyTrouble(false, true));
	}

	@Test
	public void testSumDouble1() {
		assertEquals(problems.sumDouble(1, 2), 3);
	}

	@Test
	public void testSumDouble2() {
		assertEquals(problems.sumDouble(3, 2), 5);
	}

	@Test
	public void testSumDouble3() {
		assertEquals(problems.sumDouble(2, 2), 8);
	}

	@Test
	public void testSumDouble4() {
		assertEquals(problems.sumDouble(-1, 0), -1);
	}

	@Test
	public void testSumDouble5() {
		assertEquals(problems.sumDouble(3, 3), 12);
	}

	@Test
	public void testSumDouble6() {
		assertEquals(problems.sumDouble(0, 0), 0);
	}

	@Test
	public void testSumDouble7() {
		assertEquals(problems.sumDouble(0, 1), 1);
	}

	@Test
	public void testSumDouble8() {
		assertEquals(problems.sumDouble(3, 4), 7);
	}

	@Test
	public void testDiff19() {
		assertEquals(problems.diff21(19), 2);
	}

	@Test
	public void testDiff10() {
		assertEquals(problems.diff21(10), 11);
	}

	@Test
	public void testDiff0() {
		assertEquals(problems.diff21(0), 21);
	}

	@Test
	public void testDiff22() {
		assertEquals(problems.diff21(22), 2);
	}

	@Test
	public void testDiff25() {
		assertEquals(problems.diff21(25), 8);
	}

	@Test
	public void testDiff30() {
		assertEquals(problems.diff21(30), 18);
	}

	@Test
	public void testDiff00() {
		assertEquals(problems.diff21(0), 21);
	}

	@Test
	public void testDiff1() {
		assertEquals(problems.diff21(1), 20);
	}

	@Test
	public void testDiff2() {
		assertEquals(problems.diff21(2), 19);
	}

	@Test
	public void testDiff2_1() {
		assertEquals(problems.diff21(-1), 22);
	}

	@Test
	public void testDiff2_2() {
		assertEquals(problems.diff21(-2), 23);
	}

	@Test
	public void testDiff2_20() {
		assertEquals(problems.diff21(50), 58);
	}

}
