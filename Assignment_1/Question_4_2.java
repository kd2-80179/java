package day2;

public class assignment1_4b {

	public static void main(String[] args) {
	
	int a,b;
	int num=7;
 for(a=1;a<=num;a++)
 {
	 for(b=1;b<=num -a;b++)
	 {
		System.out.print(" "); 
	 }
	 for(b=1;b<=a*2-1;b++)
	 {
		System.out.print("*"); 
	 }
	 System.out.println();
 }
	for(a=num-1;a>0;a--)
	{
		for(b=1;b<=num-a;b++)
		{
			System.out.print(" ");
		}
		for(b=1;b<=a*2-1;b++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
