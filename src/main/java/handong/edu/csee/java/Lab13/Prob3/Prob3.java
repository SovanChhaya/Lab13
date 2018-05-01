package handong.edu.csee.java.Lab13.Prob3;// package name for lab13 problem03

import java.util.Scanner;// import the package for scanner to keyboard 

public class Prob3 {// the main class of problem 03 to print out the result from other class
	public static void main(String[] args) {

		double num1 ,num2;// local variable
		Scanner myInput = new Scanner(System.in);// scanner keyboard to input something

		System.out.print("Enter radius: ");// print out Enter radius
		num1 = myInput.nextDouble();// input the value of Radius
		Circle myCircle = new Circle (num1);// instantiate the Circle class that num1 is for 

		System.out.println("Radius: "+ myCircle.getRadius());// print out the radius from input

		myCircle.display();// show the the result from circle class 

		System.out.print("Enter length and width: ");// print out Enter length and width:
		num1 = myInput.nextDouble();//input the length 
		num2 = myInput.nextDouble();// input the width
		Rectangle myRectangle = new Rectangle(num1, num2);// instantiate the Rectangle class that num1 = length , num2 = width is for

		System.out.println("Length: "+ myRectangle.getLength());// print out the length from input 
		System.out.println("Width: "+ myRectangle.getWidth());// print out the width from input

		myRectangle.display();// show the result from Rectangle class 
	}


}
