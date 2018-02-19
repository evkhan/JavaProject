//Blake Cannoe
//Ester Aguilera
import java.util.*;
import javax.swing.JOptionPane;
public class MainClass 
{
		public static void main(String[] args) 
		{
			// declaring & creating array lists for student & president
			ArrayList<Person> studentList = new ArrayList<Person>();
			ArrayList<Person> presidentList = new ArrayList<Person>();
			
			ArrayList<Person> studentMalesList = new ArrayList<Person>();
			ArrayList<Person> studentFemalesList = new ArrayList<Person>();
			
			ArrayList<String> stateList = new ArrayList<String>(); // creates list to add presidents state
			
			int presSpot = 0;	// index counter for adding president info in president array list
			int stuSpot = 0;	// index counter for adding student info in student array list
			int genSpot = 0;	// index counter for adding student info in a particular gender list

			
			String message = null;
			String input;
			char choice = 0;
			do {
				choice = selection(message, choice);
				switch(choice) {
				/* In Cases A & B we create a person, name & address object for each time the choices are selected to input one individuals info;
				 * We call on setter methods within the class Name to attain ( first, middle initial & last) & class Address
				 * to attain ( state, city, street & postal code ) & class Person ( to attain name & address from its classes & gender & income ), 
				 * presSpot acts as a counter variable to indicate index when filling the array list.
				 */
				case 'A':
					Person pres = new Person();	
					Name presName = new Name(); //generic name
					Address presAdd = new Address(); //generic address
					
					// within parameters of methods: initialized with quotations for strings & char; initialized with '1' for numbers;
					presName.setFirst(" ");	
					presName.setInitial(' ');
					presName.setLast(" ");
					
					presAdd.setState(" ");
					presAdd.setCity(" ");
					presAdd.setStreet(" ");
					presAdd.setPostalCode(1);
					
					pres.setName(presName);
					pres.setAddress(presAdd);
					pres.setGender(' ');
					pres.setIncome(1);
					
					// meant to add every state that a president that has been input into the system is from;
					int indexCounter = 0;
					stateList.add(indexCounter, presAdd.getState());
					
					
					presidentList.add(presSpot, pres);
					presSpot++;
					
					break;
					
				case 'B':			
					Person stu = new Person();
					Name stuName = new Name(); //generic name
					Address stuAdd = new Address(); //generic address
					// array list for different genders are declared at the top
					
					// within parameters of methods: initialized with quotations for strings & char; initialized with '1' for numbers;
					stuName.setFirst(" ");
					stuName.setInitial(' ');
					stuName.setLast(" ");
					
					stuAdd.setState(" ");
					stuAdd.setCity(" ");
					stuAdd.setStreet(" ");
					stuAdd.setPostalCode(1);
					
					stu.setName(stuName);
					stu.setAddress(stuAdd);
					stu.setGender(' ');
					stu.setIncome(1);
					
					studentList.add(stuSpot, stu);
					
					// Testing user input gender to place in separate lists for male and female students
					char female = 'F';	// used to test
					char male = 'M';	// used to test
					/* If statement calls returned values from getGender method placed in stu variable from Person class & tests value 
					 * if value is female, that students info is placed into the array at the same index as the regular array list for students
					 * the same is done for males, the males' info is placed into the male array list;
					 */
					if(stu.getGender() == female)
					{
						studentFemalesList.add(genSpot, stu);
						//System.out.println("Inside gender test for female");
					}
					else if (stu.getGender() == male)
					{
						studentMalesList.add(genSpot, stu);
						//System.out.println("Inside gender test for male");
					}
					
					stuSpot++;
					
					break;
					
					/* FOR BOTH C & D:
					 * Used Iterator class to run through array lists & display the info in each index;
					 * Loop keeps running as long there are values after its last loop -- boolean argument;
					 * Created president/student variable of type Person to put whatever values are attained from iterator method; 
					 * Type-casted the value returned from iterator method;
					 * Finally, the president/student variable is placed inside JOop;
					 * JOop displays person's info then loops again;
					 */
				case 'C':
					
					Iterator itPres = presidentList.iterator();	
					while(itPres.hasNext())
					{
						Person president = (Person)itPres.next();
						JOptionPane.showMessageDialog(null, president.toString());	// just outputting message
					}
						
					break;
				
				case 'D':
				
					Iterator itStu = studentList.iterator();	
					while(itStu.hasNext())
					{
						Person student = (Person)itStu.next();
						JOptionPane.showMessageDialog(null, student.toString());	// just outputting message
					}
					
					break;
				
				case 'F':
					// Allow user to pick gender //
					Iterator maleListIt = studentMalesList.iterator();	// iterator for running through male list
					Iterator femaleListIt = studentFemalesList.iterator();	// iterator for running through female list
					char userInput;
					char fem = 'F';
					char mal = 'M';
					userInput = (JOptionPane.showInputDialog("Enter 'M' for male or 'F' for female").charAt(0));
					
					// Display student records for that gender //
					if(userInput == fem)	// if the user enters female, we can then proceed to displaying all student records of that gender
					{
						while(femaleListIt.hasNext())	// while there are persons in the array list, keep running them through the loop
						{
							Person femaleStudent = (Person)femaleListIt.next();	// this places values inside of the list into student so that it may be display in the JOp.
							JOptionPane.showMessageDialog(null, femaleStudent.toString());
						}
					}
					else if(userInput == mal)	// if the user enters female, we can then proceed to displaying all student records of that gender
					{
						while(maleListIt.hasNext())	// while there are persons in the array list, keep running them through the loop
						{
							Person maleStudent = (Person)maleListIt.next();	// this places values inside of the list into student so that it may be display in the JOp.
							JOptionPane.showMessageDialog(null, maleStudent.toString());
						}
					}
					
					break;
				
				case 'G':
					
					Iterator stateListIt = stateList.iterator();
					String inputUser = null;
					inputUser = JOptionPane.showInputDialog(stateList);
					while (stateListIt.hasNext())
					{
						String presidentState = (String) stateListIt.next();
						if(presidentState == inputUser)
						{
							// this is ideally where president info from all presidents of selected state would go; was not sure how to solve this in time
							JOptionPane.showMessageDialog(null, "Presidents of the same state");
						}
						
					}
					
					
					break;
				
				case 'Q':
					// Quit Program
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"invalid");
					break;
				
				}	// end of switch case
				
			}while(choice != 'Q'); // end of do while loop

		}	// end of main method

//*************************************************************************************************************
//*************************************************************************************************************
		
		// menu selection method //
		public static char selection(String message, char choice) 
		{
			String input;
			message = "A. Add President\n";
			message += "B. Add Student\n";
			message += "C. Display all Presidents\n";
			message += "D. Display all Students\n";
			message += "F. Display all Students of a Gender\n";
			message += "G. Display all Presidents from a State\n";
			message += "Q. Quit Program\n";
			input = JOptionPane.showInputDialog(message, "selection");
			choice = input.toUpperCase().charAt(0);
			return choice;
		}
			

	}	// end of main class


