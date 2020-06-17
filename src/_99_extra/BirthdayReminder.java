
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 24th";
		String dadsBirthday = "April 28th";
		String myBirthday = "December 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String input = JOptionPane.showInputDialog("Who's Birthday would you like to remember? mom(type 1), dad(type 2), or you(type 3)");
		// 3. Print out what the user typed
		System.out.println(input);
		int BD = Integer.parseInt(input);
		// 4. if user asked for "mom"
		if(BD == 1) {
			System.out.print(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if(BD == 2) {
			System.out.print(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		if(BD == 3) {
			System.out.print(myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.print("Sorry, I don't remember that person's birthday!");
		}
	} 
}
