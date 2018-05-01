package handong.edu.csee.java.Lab13.Prob2;// package name of Lab13 Problem2

public class History extends Book {// subclass the extends from Book class (Supper class)

	private String Author;// instance variable as private only for this class 
	public History(String Name, String Author)// method that implement the name of Author
	{
		super(Name);// from Book class (supper class )
		this.Author = Author;// use this keyword because local and instance variable have the same name
	}
	public String toString()// this method implement the Author name 
	{
		return super.toString() + "\n\tAuthor: " + Author;// return the name of Author
	}
	public void show()// method not return value just print out the result
	{
		System.out.println("<<<History>>>" + this.toString());// print out <<<History>>> and Id  BookName and Author
	}


}
