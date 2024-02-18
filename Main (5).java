/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Welcome to Guess the Number Game!!!-by Rahee");
	    	System.out.println("Can you guess the secret number within the given chances?");
	    	System.out.println();
	    	System.out.println("Enter Your Name: ");
	    	String name = sc.nextLine();
	    	int n = 0;
	    	System.out.println();
	    	System.out.println("Enter the Difficulty Level - (easy/medium/hard) ");
	    	String level = sc.nextLine();
	    		System.out.println();
	    	if(level.equalsIgnoreCase("easy") )
	    	{
	    	n = 10;
	    	System.out.println(name + " You have Only 5 chances");
		       System.out.println("Enter A Number(1 - 10): ");
	    	}else if(level.equalsIgnoreCase("medium") )
	    	{
	    	n = 30;
	    	System.out.println(name + " You have Only 5 chances");
		       System.out.println("Enter A Number(1 - 30): ");
	    	}else if(level.equalsIgnoreCase("hard") )
	    	{
	    	n = 100;
	    	System.out.println(name + " You have Only 5 chances");
		       System.out.println("Enter A Number(1 - 100): ");
	    	}
	    	
	   Random rand = new Random();
	    int number = rand.nextInt(n);
	  
	    int k = 0;
	    
			
	
		int b = sc.nextInt();
		while( number != b)
		{
		    k++;
	       if(k==5)
		 {
		     System.out.println("Over..sorry!! " + name + " Lost the Game \n The number is: "  + number);
		     break;
		 }
		  if((b + 2) == number || b - 2 == number || b + 3 == number || b - 3 == number)
		 {
		     	System.out.println(name + " You are Close!!!");
		 }else if((b + 1) == number || b - 1 == number)
		 {
		     	System.out.println(name + " You are very Close!!!");
		 }else if(b > number)
		 {
		     	System.out.println(name + " Number is larger enter a smaller number");
		 }else if(b < number)
		 {
		     	System.out.println(name + " Number is smaller enter a larger number");
		 }
		 if(k==4)
		 {
		      System.out.println("Last Chance!!!");
		 }
		 
		System.out.println("Enter a Number Again(1 - " + n +"): ");
		 b = sc.nextInt();
		 
		}
			System.out.println();
		if( number == b)
		{
		    	System.out.println("Congratulations!!! ");
			System.out.println(name + " You Won!!! the " + level + " level.");
	}
	}
}
