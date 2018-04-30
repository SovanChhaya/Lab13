package handong.edu.csee.java.Lab13.Prob2;

public class History extends Book {

	private String Author;
	public History(String Name, String Author)
	{
		super(Name);
		this.Author = Author;
	}
	public String toString()
	{
		return super.toString() + "\n\tAuthor: " + Author;
	}
	public void show()
	{
		System.out.println("<<<History>>>" + this.toString());
	}


}
