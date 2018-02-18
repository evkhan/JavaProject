
import javax.swing.JOptionPane;
public class Address 
{
	String street;
	String city;
	String state;
	int postalCode;
	
	public Address()
	{
		this.street = " ";
		this.city = " ";
		this.state = " ";
		this.postalCode = 0;
	}
	public Address(String stre, String cit, String sta, int postCo) 
	{
		street = stre;
		city = cit;
		state = sta;
		postalCode = postCo;
	}
	public void setStreet(String stre)
	{
		stre = JOptionPane.showInputDialog("Enter street name");
		street = stre;
	}
	public String getStreet()
	{
		return street;
	}
	public void setCity(String cit)
	{
		cit = JOptionPane.showInputDialog("Enter your City");
		city = cit;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String sta)
	{
		sta = JOptionPane.showInputDialog("Enter your State");
		state = sta;
	}
	public String getState()
	{
		return state;
	}
	public void setPostalCode(int postCo)
	{
		postalCode = Integer.parseInt(JOptionPane.showInputDialog("Enter zipcode")); // string to integer conversion
	}
	public int getPostalCode()
	{
		return postalCode;
	}
	public String toString()
	{
		String result;
		result = street + "\n" + city + ", " + state + " "  + postalCode;
		return result;
	}
	
}
