package handong.edu.csee.java.Lab13.Prob6;// package for Lab13 problem 6

public class UpPoint implements CapitalPrint {// interface implement CapitalPrint 
	private int x, y; // instance variable

	UpPoint(int x, int y){this.x = x; this.y = y;}//local variable

	public String toString()// method
	{

		return "x : " + x + " y : " + y;//return x : value of x and y : value of y 
	}



}

