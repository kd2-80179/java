package day2;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
		 int num=sc.nextInt();
		
		 
		 System.out.println("binary number");
		 String bs = Integer.toBinaryString(num);
	     String os=	 Integer.toOctalString(num)	; 
		 String hx= Integer.toHexString(num);	 
		
		 System.out.println ("binary number="+bs);
		 System.out.println("octal number="+os);
		 System.out.println("hex number="+hx);
		 
	

}
}
