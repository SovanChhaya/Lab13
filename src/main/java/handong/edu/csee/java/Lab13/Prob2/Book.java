package handong.edu.csee.java.Lab13.Prob2;// package name of Lab13 Problem2

public class Book {
	private static int idCount = 0;// class variable 
	private String BookName;// instance Variable 
	private int id;// instance Variable
	public Book(String Name)// instance variable as a string 

	{
		this.BookName = Name;// 
		idCount++;
		id = idCount;
	}
	public String toString()
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;
	}
	public void show()
	{
		System.out.println("<<<BOOK>>>" + this.toString());
	}
}


