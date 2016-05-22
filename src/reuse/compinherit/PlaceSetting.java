package reuse.compinherit;

import static com.juanpickselov.util.Print.*;

public class PlaceSetting extends Custom {
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i) {
		super(i+1);
		PrintDivider(2);
		sp = new Spoon(i+2);
		frk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		print("PlaceSetting constructor");
		PrintDivider(2);
	}
	public static void main(String[] args){
		PlaceSetting x = new PlaceSetting(9);
	}
}
