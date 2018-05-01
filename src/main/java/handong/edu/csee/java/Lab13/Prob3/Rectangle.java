package handong.edu.csee.java.Lab13.Prob3;// package name for lab13 problem03

public class Rectangle extends Shape {// extend from Shape class(supper Class)
	private double length;// instance variable 
	private double width;// instance variable
	public Rectangle(double length, double width)// constructor local variable 
	{
		this.length = length;// this keyword to assume these two variable because local and instance variable have the same name
		this.width = width;// this keyword to assume these two variable because local and instance variable have the same name
	}
	public double area()//method that implement the Area of Rectangle
	{
		return length * width;// return length *  width
	}
	public double perimeter()// method that implement the perimeter of rectangle 
	{
		return 2*(length+width);// return the value of    2*(length+width)
	}
	public double getLength()// method get length from input 
	{
		return length;// return the value of length from input
	}
	public double getWidth()// method get width from input
	{
		return width;// return the value of width from input 
	}
	public void display()// this method no return value just print out 
	{
		System.out.println("Area: "+ area()+"\nPerimeter: "+perimeter() +"\n");// // print out the value of Area and Perimeter value of Rectangle
	}



}
