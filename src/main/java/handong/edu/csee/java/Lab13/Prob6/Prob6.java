package handong.edu.csee.java.Lab13.Prob6;// package for Lab13 problem 6

public class Prob6 {// main class for print out the result

	public static void main(String[] args) {// main method 

		UpPoint p1 = new UpPoint(3,3); // instantiation  p1 to UpPoint class (x= 3, y= 3)
		DownPoint p2 = new DownPoint(2,5);// instantiation p2 to DownPoint that have(x= 2 , y = 5)
		DownPoint p3 = new DownPoint(4,7);// instantiation p3 to DownPoint (x=4 , y = 7)
		UpPoint p4 = new UpPoint(9,12); // instantiation p4 to UpPoint (x= 9 , y = 12)

		Printer.print(p1);// print out X:3, Y: 3
		Printer.print(p2);//print out x : 2 , y : 5
		Printer.print(p3);// print out x : 4 , y:7
		Printer.print(p4);// print out X:9  Y: 12
	}


}
