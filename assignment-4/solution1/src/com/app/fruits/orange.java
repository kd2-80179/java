package com.app.fruits;

public class orange extends Fruits
{
	String taste;
    String color;
	double weight;
	String name;
	boolean isfresh;
    
	public orange()
	{
		
	}

	public orange(String taste,String color,double weight,String name,boolean isfresh) {
		super(color,weight,name,isfresh);
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "orange [taste=" + taste + "]";
	}
	
	public String taste()
	{
		return "sour";
	}
   
	

}
