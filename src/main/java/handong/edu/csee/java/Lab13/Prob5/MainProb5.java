package handong.edu.csee.java.Lab13.Prob5; // package name for Lab13 problem 5
import java.util.Scanner; // import scanner package for key board input

public class MainProb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2 = 0;// local variable
		Scanner keyboard = new Scanner(System.in);
		
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
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				m1[i][j] = keyboard.nextInt();// input the list of number

		System.out.print("Enter list2: ");// print out Enter list2
		for (int i = 0; i < m2.length; i++){
			for (int j = 0; j < m2[i].length; j++)
				m2[i][j] = keyboard.nextInt();// input the list of number
		}
		for (int i = 0; i < m1.length; i++){
			for (int j = 0; j < m1[i].length; j++)
				System.out.print(m1[i][j] + " ");
			System.out.println();// print out the result 
		}
		System.out.println(); // print out the result
		for (int i = 0; i < m2.length; i++){
			for (int j = 0; j < m2[i].length; j++)
				System.out.print(m2[i][j] + " ");
			System.out.println();
		}
		System.out.println();// print out the result


		if (equals(m1, m2)) 
			System.out.println("The two arrays are approximately identical.");// print out The two arrays are approximately identical.
		else 
			System.out.println("The two arrays are not identical"); // print out The two arrays are not identical




	}

	private static boolean equals(int[][] m1, int[][] m2) {
		// TODO Auto-generated method stub
		return false;
	}

}
