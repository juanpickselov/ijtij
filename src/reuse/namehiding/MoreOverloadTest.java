package reuse.namehiding;

public class MoreOverloadTest {

	public static void main(String[] args) {
		// such a simple example that shows that while oload(String text) is
		// inside MoreOver, the other three oload methods are available from
		// OverloadIt

		MoreOver mOver = new MoreOver();
		mOver.oload(127);
		mOver.oload('z');
		mOver.oload(150);
		mOver.oload("Well lah dee dah!");
	}
}
