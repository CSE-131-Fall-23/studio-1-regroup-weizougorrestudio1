package studio1;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
	 Scanner in = new Scanner(System.in);
	 System.out.println("Input two integers to be averaged");
	 int n1 = in.nextInt();
	 int n2 = in.nextInt();
	 double n3 = (n1+n2)/2.0;
	 System.out.println("The average of " + n1 + " and " + n2 + " is " + n3);
	} 

}
