package plainjavaservlet;

import java.util.*;
import java.text.*;

public class ServletService {

	private List<String> months = new ArrayList<String>();
	
	public void initJanuary () {
		months.add("January");
	}
	
	public List<String> getMonths() {
		return months;
	}
	
	public String getDate () {
        DateFormat df = new SimpleDateFormat("hh dd/MM/yy");
        return df.format(new Date());
    }

}
