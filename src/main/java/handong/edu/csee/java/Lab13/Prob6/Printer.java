package handong.edu.csee.java.Lab13.Prob6; // package for Lab13 problem 6

public class Printer {// class for printer

	public static void print(Object object)// object stand for Object class
	{
		String str = object.toString();// instantiate

		if(object instanceof CapitalPrint)// if object is stand for CapitalPrint (interface)
			str = str.toUpperCase();// change to upperCase
		System.out.println(str);// print out Upper Case
	}


}
