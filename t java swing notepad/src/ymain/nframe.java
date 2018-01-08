package ymain;

import java.awt.HeadlessException;

import javax.swing.JFrame;



public class nframe extends JFrame {
	public nframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//dont allow window resize
		setResizable(false);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//add panel to window
		add(new npanel(this));
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}
