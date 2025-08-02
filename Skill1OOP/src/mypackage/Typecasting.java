package mypackage;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b; 
	     int i = 26; 
	     double d = 12.33; 
	     
	     d = i;
	     System.out.println("\nint to double: " + d);
	   
	     System.out.println("\n int to byte."); 
	     b = (byte) i; 
	     
	     System.out.println("i and b " + i + " " + b); 
	     System.out.println("\ndouble to int."); 
	     i = (int) d; 
	     
	     System.out.println("d and i " + d + " " + i); 
	     System.out.println("\ndouble to byte."); 
	     b = (byte) d; 
	     
	     System.out.println("d and b " + d + " " + b);
	}

}
