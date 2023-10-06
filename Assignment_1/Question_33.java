package day2;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		String choice ="samosa";
		Scanner sc=new Scanner(System.in);

		System.out.println("0.exit");
		System.out.println("1.samosa=10");	
		System.out.println("2.idli=10");
		System.out.println("3.badapaw=15");
		System.out.println("4.chips=20");
		System.out.println("5.banana=15");
		System.out.println("6.orange=12");
		System.out.println("7.grapes=16");
		System.out.println("8.apple=43");
        System.out.println("9.pohe15");
        System.out.println("10.generate  total bill");
        System.out.println("enter your choice");
        
        int choice;
        
        Scanner sc =new Scanner (System.in);
        choice sc=sc.nextInt();
        double price;
        int quantity;
       
       
        switch(choice) {
        case "exit":
        	System.out.println("thank you for using");
             break;
        case "Samosa":
        	System.out.println("enter the price tosamosa=10");
             break;
        case "idli":
        	System.out.println("enter the price to idli=10");
            break;
        case "badapaw":
        	System.out.println("enter the price to badapaw=10");
        	break;
        case "chips":
        	System.out.println ("enter the price to chips=5");
             break; 
        case "banana":
        	System.out.println ("enter the price to banana=20");
             break; 
        case "orange":
        	System.out.println ("enter the price to orange=20");
             break; 
        case "grapes":
        	System.out.println ("enter the price to grapes=20");
             break; 
        case "apple":
        	System.out.println ("enter the price to apple=30");
             break; 
        case "pohe":
        	System.out.println ("enter the price to pohe=15");
             break; 
        
        default:
        	System.out.println("wrong choice");
        	break;
        }
        
        }

        
	
	

}
