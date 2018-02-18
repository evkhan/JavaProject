
import javax.swing.JOptionPane;
public class Person 
{
	private Name name;
	private Address address;
	private char gender;
	private double income;
	
	Person() 
	{
		
	}
	public Person(Name nam, Address addr, char gen, double inc)
	{
		this.name = nam;
		this.address = addr;
		this.gender = gen;
		this.income = inc;
	}
	public void setName(Name nam)
	{
		name = nam;
	}
	public Name getName()	
	{
		return name;
	}
	public void setAddress(Address addr)
	{
		address = addr;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setGender(char gen)	// parameter still necessary for when method is called later
	{
		String input = JOptionPane.showInputDialog("Enter your gender"); 
		gender = input.charAt(0);
	}
	public char getGender()
	{
		return gender;	
	}
	public void setIncome(double inc)
	{
		inc = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual income after tax"));	// string to double conversion
		income = inc;
	}
	public double getIncome()
	{
		return income;
	}
	public String toString()
	{
		String result = null;
		result = name + "\n" + address + "\n" + "Gender: " + gender + "\n" + "$ " +  income;
		return result;
	}
}
