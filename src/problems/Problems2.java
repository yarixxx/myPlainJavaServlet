package problems;

import java.util.*;
import java.text.*;

public class Problems2 {

	public String stringTimes(String string, int i) {
		if (i > 0) {
			return stringTimes(string, --i).concat(string);
		}
		return "";
	}
	
}
