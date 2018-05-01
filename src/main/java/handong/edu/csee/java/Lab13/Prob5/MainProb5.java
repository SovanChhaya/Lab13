package handong.edu.csee.java.Lab13.Prob5; // package name for Lab13 problem 5
import java.util.Scanner; // import scanner package for key board input

public class MainProb5 {// main class top print out the result

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2 = 0;// local variable
		Scanner keyboard = new Scanner(System.in);// scan keyboard when input something

		System.out.print("Enter row size(maximum 5): ");// print out Enter row size(maximum 5):
		n1 = keyboard.nextInt();// input number of row
		System.out.print("Enter column size(maximum 5): ");//print out Enter column size(maximum 5):
		n2 = keyboard.nextInt();// input the number of column
		int[][] m1 = new int[n1][n2];// instantiate array 
		System.out.print("Enter row size(maximum 5): ");// print out Enter row size(maximum 5):
		n1 = keyboard.nextInt();// input the size of row
		System.out.print("Enter column size(maximum 5): ");// print out Enter column size(maximum 5)
		n2 = keyboard.nextInt();//input the size of column
		int[][] m2 = new int[n1][n2];// instantiate
		System.out.print("Enter List1: ");//print out Enter List1

		for (int i = 0; i < m1.length; i++)// for  i smaller than number of length then i increase
			for (int j = 0; j < m1[i].length; j++)// for  j smaller than array of length then j increase
				m1[i][j] = keyboard.nextInt();// input the list of number

		System.out.print("Enter list2: ");// print out Enter list2
		for (int i = 0; i < m2.length; i++){// for i smaller than second number of length then i increase 
			for (int j = 0; j < m2[i].length; j++)// for j smaller than number of array two then j increase
				m2[i][j] = keyboard.nextInt();// input the list of number
		}
		for (int i = 0; i < m1.length; i++){// for i =0 and smaller than length then i increase
			for (int j = 0; j < m1[i].length; j++)// for j = 0 and j smaller than length of array then j increase 
				System.out.print(m1[i][j] + " ");// print out the result 
			System.out.println();// print out the result 
		}
		System.out.println(); // print out the result
		for (int i = 0; i < m2.length; i++){// for i = 0 and i smaller than length of m2 i increase 
			for (int j = 0; j < m2[i].length; j++)// for j = 0 and j smaller than length of array m2 then j increase 

				System.out.print(m2[i][j] + " ");// show the list 
			System.out.println();// print line 
		}
		System.out.println();// print out the result


		if (equals(m1, m2)) // check the value of m1 and m2 
			System.out.println("The two arrays are approximately identical.");// print out The two arrays are approximately identical.
		else 
			System.out.println("The two arrays are not identical"); // print out The two arrays are not identical




	}

	private static boolean equals(int[][] m1, int[][] m2) {
		// TODO Auto-generated method stub
		return false;
	}



}
