package handong.edu.csee.java.Lab13.Prob3;

public class Circle  extends Shap {
	
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	//public Circle(double n1) {
		// TODO Auto-generated constructor stub
//	}
	public double area()
	
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	public double perimeter()
	
	
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}
	public double get_Radius()
	{
		return radius;
		
	}
	public void display()
	{
		System.out.println("Area: "+ area()+"\nPerimeter: "+perimeter() +"\n");
	}

	
	

}
