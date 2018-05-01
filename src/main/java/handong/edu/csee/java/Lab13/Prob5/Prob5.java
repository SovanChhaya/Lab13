package handong.edu.csee.java.Lab13.Prob5;// package name for Lab13 problem 5

public class Prob5 {//class for Problem5 

	public static boolean equals(int[][] m1, int[][] m2) {// method that store array two dementional

		int count = 0;// local variable
		if (m1.length != m2.length) // if the number of row is different, return false
			return false;
		for (int i = 0; i < m1.length; i++) // for i = 0 and i smaller then length of m1 then i increase 
		{
			for (int j = 0; j < m1[i].length; j++)// for j = 0 and j smaller than length of array m1 then j increase 
			{
				if (m1[i][j] != m2[i][j])// if array of m1 not equal to array of m2 
					count++;
			}
		}
		if(count <= 3)//if count smaller or equal to 3 
			return true;// return true 
		else
			return false;// alse return fale 
	}



}
