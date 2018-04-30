package handong.edu.csee.java.Lab13.Prob3;

public class Rectangle extends Shap {
	private double length;
	private double width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double area()
	{
		return length * width;
	}
	public double perimeter()
	{
		return 2*(length+width);
	}
	public double get_Length()
	{
		return length;
	}
	public double get_Width()
	{
		return width;
	}
	public void display()
	{
		System.out.println("Area: "+ area()+"\nPerimeter: "+perimeter() +"\n");
	}



}
