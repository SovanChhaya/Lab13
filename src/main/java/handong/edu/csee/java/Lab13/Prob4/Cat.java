package handong.edu.csee.java.Lab13.Prob4; // package name of problem 4 

// sub Class of Animal class
public class Cat extends Animal implements Pet{// interface implements 

	public String food()// method as string to store the food of Cat
	{
		return "(Cat!)" +"Fish";// give the food name fish to cat when user input name of cat
	}


}
