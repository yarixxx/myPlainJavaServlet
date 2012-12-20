package plainjavaservlet;

import java.util.*;
import java.text.*;

public class ServletService {

    public String getDate () {
        DateFormat df = new SimpleDateFormat("hh dd/MM/yy");
        return df.format(new Date());
    }

}
