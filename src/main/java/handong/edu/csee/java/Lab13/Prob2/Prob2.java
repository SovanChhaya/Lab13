package handong.edu.csee.java.Lab13.Prob2;// package name for Problem 02

public class Prob2 {// main class to print out the result from other class 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Book book = new Book("Simple Book");// instantiate the Book Class to print out  Simple Book 

		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, Publisher

		History history1 = new History("What Is history?", "E.H.Carr" );//Name, Author

		book.show();// call method show from Book Class 
		science.show(); // call method show from Science class 
		history1.show(); // call method show from History class 
		// history2.show(); // increase Id value
	}

}


