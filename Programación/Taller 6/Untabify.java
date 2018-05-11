import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import acm.program.*;
import acm.util.*;
public class Untabify extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "txt Files", "txt");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(getParent());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getName());
		    }
		    
		file = chooser.getSelectedFile().getAbsolutePath();
		
		
		println("This program changes TABS to SPACES.");
		try {
			rd = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			throw new ErrorException("Unable to read");
		}	
		
		UNTAB(rd);
		try
		{
			fd = new PrintWriter(new FileWriter(file));
		}
		catch (IOException e)
		{
			throw new ErrorException("Unable to write");
		}
		fd.print(newfile);
		fd.close();
	}
	
	private void UNTAB(BufferedReader rd)
	{
		try {
		if((actualn = rd.readLine()) == null)
		{
			run();
		}
		
		sc = new Scanner(file);
		newfile = "";
		while(actualn != null)
		{
			wrd = "";
			int z = 0;
			int pos = 0;
			int inow = 0;
				for(int i = 0 ; i < actualn.length(); i++)
				{
					if(actualn.charAt(i) == '\t')
					{
						inow = i + (z);
						pos = 8 - ((inow) % 8);
						z += pos - 1;
						
						for(int c = 0; c < pos; c++)
						{
						wrd += " ";
						}
					}
					else
					{
						wrd += actualn.charAt(i);
					}
				
				}
				
			actualn = rd.readLine();
			newfile += wrd;
			if(sc.hasNextLine())
				{
					sc.nextLine();
					newfile += "\r\n";	
				}
			else
				{
					sc.close();
				}
		}
		rd.close();
		pause(1000);
		println("The program has finished replacing TABS to SPACES.");
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to read");
		}
	}
	private static final JFileChooser chooser = new JFileChooser();
	private static BufferedReader rd;
	private static PrintWriter fd;
	private static Scanner sc;
	private static String file;
	private static String actualn;
	private static String wrd;
	private static String newfile;
}
