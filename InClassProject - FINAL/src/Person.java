
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
		// user HAS to input upper case letter in order for it to work; calling toUpperCase method on gen not possible because it is primitive; havent found a good solution yet
		gen = (JOptionPane.showInputDialog("Enter your gender").charAt(0)); 
		gender = gen;
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
