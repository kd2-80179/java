package solution2;
import java.util.Scanner;
public class point2Dtest {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("no of plot to enter =+");
		point2D[]points =new point2D[sc.nextInt()];
		point2D point2d=new point2D();
		point2D[][]arr1= new point2D[2][2];
		
		for(point2D[]arr:arr1) 
			for(point2D point:arr)
				point2d.acceptCoordinate();
			
		int choice= 1;
		int index;
		
		
		int Menu()
		{
			int choice;
			System.out.println("display details of a specific points");
			System.out.println("display x,y co-ordinates of all points");
			System.out.println("user i/p :2 indicies for the points,validate the indices");
		 
			return choice;
	
		
		

		
				
		point2d.acceptCoordinate();
		point2d. calculateDistance(point2D p1,point2D p2);
;
		

	}

}
