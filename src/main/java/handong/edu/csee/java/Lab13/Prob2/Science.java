package handong.edu.csee.java.Lab13.Prob2;// package name of Lab13 Problem2

public class Science extends Book{// subclass that extends from supper class (Book Class) 

	private String publisher;// instance variable only for this class (private)

	public Science(String Name, String Publisher)// method that implement the name publisher 
	{
		super(Name);// from Book class 


		this.publisher = Publisher;// use this keyword because local and instance variable have the same name
	}
	public String toString()// method implement the publisher
	{
		return super.toString() + "\n\tPublisher: " + publisher;// return the name of publisher 
	}
	public void show() //  method not return value just print out the result
	{
		System.out.println("<<<Science>>>" + this.toString());//print out <<<Science>>> and Id  BookName and Publisher name
	}


}
