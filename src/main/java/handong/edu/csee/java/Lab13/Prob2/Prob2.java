package handong.edu.csee.java.Lab13.Prob2;

public class Prob2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, Publisher
		History history1 = new History("What Is history?", "E.H.Carr" );//Name, Author
		//History history2 = new History("The South Korea", "Judis");
		book.show();
		science.show();
		history1.show();
		// history2.show(); // increase Id value
	}

}


