package com.app.geometry;
import java.util.Scanner;

public class point2D {
       float   pointp1;
       float pointp2;
   
   
       
    public point2D() 
    {
    	
    }

public point2D(float pointP1, float pointp2 ) {
	
		this.pointP1 = pointP1;
		this.pointp2 = pointp2;
	
}

public float getPointp1() {
	return pointp1;
}

public void setPointp1(float pointp1) {
	this.pointp1 = pointp1;
}

public float getPointp2() {
	return pointp2;
}

public void setPointp2(float pointp2) {
	this.pointp2 = pointp2;
}

@Override
public String toString() {
	return "point2D [pointp1=" + pointp1 + ", pointp2=" + pointp2 + "]";
}
   
public String getDetails()
{
	 return "point2D [pointp1=" + pointp1 + ", pointp2=" + pointp2 + "]";
 
}
 public  Add isEqual()
 {
	 
 }




  
   

}




