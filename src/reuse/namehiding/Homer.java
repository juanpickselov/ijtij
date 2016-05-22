package reuse.namehiding;

import static com.juanpickselov.util.Print.*;

class Homer {
	
	char doh(char c) {
		print("doh(char)");
		return 'd';
	}
	float doh(float f) {
		print("doh(float)");
		return 1.0f;
	}
}
