import java.util.*;
public class Funsies {
public static void main(String[] args) {
	int numTries = 5;
	System.out.println("Guess the band in my head");
	Scanner keyboard = new Scanner (System.in);
	String guess = keyboard.nextLine();
	String answer = "Mumford and sons";
	
	while (numTries > 0 ){	
	if(guess.equalsIgnoreCase(answer)){
		System.out.println("OK lets go get a smoothie");
		return;
	}
		else
		{
			 System.out.println("Wrong! you got ");
			 System.out.println("Take a new guess");
			 guess = keyboard.nextLine();
			  numTries --;
		}
		}
	
 
	}
			
}		
	


