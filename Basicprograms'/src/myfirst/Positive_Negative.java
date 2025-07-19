package myfirst;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
  System.out.print("enter a number: ");
  int number = scanner.nextInt();
  if(number>0) {
	  System.out.println("The number is positive.");
  }else if (number<0) {
	  System.out.println("The number is negative.");
  }else {
	  System.out.println("The number is Zero.");
  }
  scanner.close();
	}

}
