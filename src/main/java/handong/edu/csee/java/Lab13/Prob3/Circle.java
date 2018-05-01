package handong.edu.csee.java.Lab13.Prob3;// package name for lab13 problem03

public class Circle  extends Shape {// extend from Shape class(supper Class)

	private double radius;// instance variable only for this class 

	public Circle(double radius)// constructor local variable 
	{
		this.radius = radius;// this keyword to assume these two variable because local and instance variable have the same name
	}
	//public Circle(double n1) {
	// TODO Auto-generated constructor stub
	//	}
	public double area()// method implement the area of circle

	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r 
	}
	public double perimeter()// method implement the perimeter of circle 


	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}
	public double getRadius()// get the radius from input
	{
		return radius;// return the value of the radius

	}
	public void display()// method no return the value but print out the result
	{
		System.out.println("Area: "+ area()+"\nPerimeter: "+perimeter() +"\n");// print out the value of Area and Perimeter value
	}




}
