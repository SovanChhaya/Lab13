package handong.edu.csee.java.Lab13.Prob5;// package name for Lab13 problem 5

public class Prob5 {//class for Problem5 
	public static boolean equals(int[][] m1, int[][] m2) {// method that store array two dementional
		int count = 0;// local variable
		if (m1.length != m2.length) // if the number of row is different, return false
			return false;
		for (int i = 0; i < m1.length; i++) // for 
		{
			for (int j = 0; j < m1[i].length; j++)
			{
				if (m1[i][j] != m2[i][j])
					count++;
			}
		}
		if(count <= 3)
			return true;
		else
			return false;
	}



}
