package reuse.namehiding;

import static com.juanpickselov.util.Print.*;

class OverloadIt {
	
	byte oload(byte bite){
		print("byte");
		return bite;
	}
	char oload(char a){
		print("char");
		return a;
	}
	int oload(int i){
		print("int");
		return i;
	}
}
