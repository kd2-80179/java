package FruitBasket;
import java.util.Scanner;
import com.app.fruits.Fruits;
import com.app.fruits.mango;

public class fruitteste {
	static int menu() {
		
	int choice;
	
		System.out.println("0.exit");
	    System.out.println("1.add mango");
	    System.out.println("2.add orange");
		System.out.println("3.add apple");
	    System.out.println("4.display name of all fruits in the basket");
	    System.out.println("5.display name,color,weight taste");
		System.out.println("6.display tastes of all stale ");
		System.out.println("7.mark a fruit as stale");
		System.out.println("8.mark all sour fruits stale");
	    Scanner sc=new Scanner (System.in);
	   
	     System.out.println("enter your  choice=+");
	     choice= sc.nextInt();
	    	return choice;	
	}


	public static void main(String[] args) {
	  
	     Fruits fruits;
	      int choice;
	  while ((choice=menu())!=0)
	  {
		  int count;
		  
		  switch(choice)
		  case 0:
			  System.out.println("0.exit");
			  break;
		  case 1:
			  System.out.println("1.add mango");
			  
			     for(int i=0;i<3;count++)
			    fruits [count] = new mango();
			    Fruits [count].accept();
			    count++;
			    
			    
			  
			    
			  
			  
			  
			  
		  
				    
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	  }		  
			  
			  
			  
			  
	   
	


