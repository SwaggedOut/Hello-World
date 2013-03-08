//This an attempt of me doing object oriented programming NIGGGGAAAAAAA
import java.util.*;
public class Fun {

	
	public void output(){
		System.out.println("Rub MY DICK NIGGAAAH FUCK YEAEH");
		System.out.println();
		System.out.println("Ok so now choose a number 1 or 2");
	}
	/**
	 * This method is made to give the outputs of funnies
	 * @return
	 */
	public int getInput(){
		
		Scanner keyboard = new Scanner(System.in);
		int choice = keyboard.nextInt();
		return choice;
		
	}
	/**
	 * Returns the number inputed from the user
	 * @param args
	 */
	public static void main(String[] args){
		
		Fun test = new Fun();
		test.output();
		switch(test.getInput())
		{
		case 1:
			System.out.println("You choose one");
			break;
		case 2:
			System.out.println("You choose two");
			break;
	}
	/**
	 * Calls the first method to get the funny output
	 * Calls the second method to allow user to input a number
	 * Conditions are then set in the main() so that an answer can be chosen
	 */
}
}