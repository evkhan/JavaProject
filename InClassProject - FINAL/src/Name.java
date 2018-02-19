
import javax.swing.JOptionPane;
public class Name 
{
	String first;
	char initial;
	String last;
	
		
	public Name()
	{
		// initializing each instance of each variable
		this.first = " ";
		this.initial = ' ';
		this.last = " ";
	}
	
	public Name(String fir, char init, String las)
	{
		this.first = fir;
		this.initial = init;
		this.last = las;
	}
	public void setFirst(String fir)
	{
		fir = JOptionPane.showInputDialog("Enter first name");
		first = fir;
	}
	public String getFirst()	
	{
		return first;
	}
	public void setInitial(char init)	// parameter still necessary for when method is called later
	{
		String input = JOptionPane.showInputDialog("Enter middle initial"); // input middle initial as a string
		initial = input.charAt(0); //convert string to char (by reading the location in the string indicated) 
	}
	public char getInitial()
	{
		return initial;
	}
	public void setLast(String las)
	{
		las = JOptionPane.showInputDialog("Enter last name");
		last = las;
	}
	public String getlast()
	{
		return last;
	}
	public String toString()
	{
		String result;
		result = first + " " + initial + ". " + last;
		return result;
	}
}
