package reuse.namehiding;

import static com.juanpickselov.util.Print.*;

public class MoreOver extends OverloadIt {
	String returnVal = "";

	String oload(String text) {
		if (null != text) {
			returnVal = text;
			print(returnVal);
		}
		return returnVal;
	}
}
