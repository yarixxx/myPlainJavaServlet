package problems;

import java.util.*;
import java.text.*;

public class Problems1 {

	public boolean sleepIn (boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public boolean monkeyTrouble (boolean aMonkey, boolean bMonkey) {
		return aMonkey == bMonkey;
	}

	public int sumDouble (int val1, int val2) {
		int sum = val1 + val2;
		if (val1 == val2) {
			return sum * 2;
		} else {
			return sum;
		}
	}

	public int diff21 (int n) {
		if (21 > n) {
			return 21 - n;
		}
		return (n - 21) * 2;
	}

}
