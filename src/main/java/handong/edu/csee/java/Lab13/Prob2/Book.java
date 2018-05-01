package handong.edu.csee.java.Lab13.Prob2;// package name of Lab13 Problem2

public class Book {// class to control Id and BookName
	private static int idCount = 0;// class variable 
	private String BookName;// instance Variable 
	private int id;// instance Variable
	public Book(String Name)// instance variable as a string 

	{
		BookName = Name;// name of book from other class 
		idCount++;// increase id
		id = idCount;// id start from 0-
	}
	public String toString()// method that implement the result of Id an Book name
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;// return the number of Id and Book name
	}
	public void show()// method no return value because as void and print out the result
	{
		System.out.println("<<<BOOK>>>" + toString());// print out <<<BOOK>>> and result from method toString
	}
}


