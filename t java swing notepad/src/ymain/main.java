package ymain;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		nframe nf = new nframe("yoel swing notepad",667, 364);
		nf.yshow();
	}

}
