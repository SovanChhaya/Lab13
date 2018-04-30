package handong.edu.csee.java.Lab13.Prob4;// package name of problem 4 

public class Animal {// class for input the name of animals as Supper Class
	
	private String nameOfAnimal;// instance variable as string
	
	public void setName(String name)// method for input name of animal
	{
	nameOfAnimal = name;//local variable
	}
	public void getName()// method for get a name from input
	{
		System.out.println("Name: "+nameOfAnimal);// print out names that user input
	}
}



