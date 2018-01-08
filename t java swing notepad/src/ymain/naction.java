package ymain;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class naction {

	public static void open(Component parent,JTextArea jt) 
	{
		//create file chooser
		JFileChooser open = new JFileChooser();
		//show option diolog and save responce
		int option = open.showOpenDialog(parent);

		//if aproved (meaning use chose a file)
		if (option == JFileChooser.APPROVE_OPTION) 
		{
			//empty text area
			jt.setText("");

			try {
				//selected file path
				String file_path = open.getSelectedFile().getPath();
				//use scanner to read the file
				Scanner scan = new Scanner(new FileReader(file_path));
				//whle there are lines to read
				while (scan.hasNext())
				{
					//append next line to text area
					jt.append(scan.nextLine() + "\n"); 
				}
			} catch (Exception ex) { 
				
				System.out.println(ex.getMessage());
			}
		}


	}//end open

	public static void save(Component parent,JTextArea jt) 
	{
		JFileChooser save = new JFileChooser();
		int option = save.showSaveDialog(parent);
		if (option == JFileChooser.APPROVE_OPTION) 
		{
			try {
				//selected file path
				String file_path = save.getSelectedFile().getPath();
				
				//if no txt extantion add it
				if(!file_path.contains(".txt")) {file_path +=".txt";}
	            
				//use BufferedWriter to write all the text to file
				BufferedWriter out = new BufferedWriter(new FileWriter(file_path));
				//write all textarea text to file
				out.write(jt.getText()); 
				// close file stream
				out.close(); 
			} catch (Exception ex) { 
				
				System.out.println(ex.getMessage());
			}
			
		}

	}//end open

}
